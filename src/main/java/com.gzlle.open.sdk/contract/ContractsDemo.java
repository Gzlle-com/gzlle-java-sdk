package com.gzlle.open.sdk.contract;

import com.google.gson.Gson;
import com.gzlle.open.sdk.dto.ContractsDTO;
import com.gzlle.open.sdk.dto.EmployeeDTO;
import com.gzlle.open.sdk.dto.ContractCallbackDTO;
import com.gzlle.open.sdk.exceptions.SignException;
import com.gzlle.open.sdk.api.ContractCallbackHandler;
import com.gzlle.open.sdk.utils.BeanToMapUtil;
import com.gzlle.open.sdk.utils.CallbackUtil;
import com.gzlle.open.sdk.utils.HttpUtil;
import com.gzlle.open.sdk.utils.SignUtil;
import com.gzlle.open.sdk.utils.baseUrlUtil;
import com.gzlle.open.sdk.vo.BaseVO;
import com.gzlle.open.sdk.vo.CallbackVO;
import com.gzlle.open.sdk.vo.contract.EmployeeVO;
import com.gzlle.open.sdk.vo.contract.GetEmployeeVO;
import com.gzlle.open.sdk.vo.contract.QueryContractVO;
import com.gzlle.open.sdk.vo.contract.UserTokenVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.SortedMap;

/**
 * 业务签约相关接口
 */
public class ContractsDemo {

    /**
     * 添加自由职业者接口
     */
    public static EmployeeVO addEmployee(String token, EmployeeDTO employee, String appKey) {
        //调用添加自由职业者接口里面包含添加的职业者的id
        String url = baseUrlUtil.API_BASE_URL + "/contracts/employees/add";
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(employee);
        //使用32位以类的随机字符串
        paramters.put("nonce", SignUtil.buildNonce(32));
        //sign使用SignUtil工具类生成签名
        String sign = SignUtil.createOpenSign(paramters, appKey);
        paramters.put("sign", sign);
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        //添加请求头信息
        header.put("Content-Type", "application/json; charset=UTF-8");
        header.put("Authorization", token);
        String result = HttpUtil.doPost(url, paramters, "UTF-8", header);
        return new Gson().fromJson(result, EmployeeVO.class);
    }

    /**
     * 获取用户token接口
     */
    public static UserTokenVO getUserToken(String token, String employeeId) {
        String url = baseUrlUtil.API_BASE_URL + "/contracts/employees/userToken/" + employeeId;
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        header.put("Authorization", token);
        String result = HttpUtil.doGet(url, "UTF-8", header);
        return new Gson().fromJson(result, UserTokenVO.class);

    }


    //查询签约结果接口
    public static QueryContractVO queryResult(String token, String employeeId) {
        String url = baseUrlUtil.API_BASE_URL + "/contracts/employees/status/" + employeeId;
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        header.put("Authorization", token);
        String result = HttpUtil.doGet(url, "UTF-8", header);
        return new Gson().fromJson(result, QueryContractVO.class);
    }


    //获取自由职业者信息接口
    public static GetEmployeeVO getEmployee(String token, String employeeId) {
        String url = baseUrlUtil.API_BASE_URL + "/contracts/get/" + employeeId;
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        header.put("Authorization", token);
        String result = HttpUtil.doGet(url, "UTF-8", header);
        return new Gson().fromJson(result, GetEmployeeVO.class);
    }

    //修改自由职业者信息接口
    public static EmployeeVO editEmployee(String token, EmployeeDTO employee) {
        String url = baseUrlUtil.API_BASE_URL + "/contracts/employees/edit";
        //转换为map集合
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(employee);
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        //添加请求头信息
        header.put("Content-Type", "application/json; charset=UTF-8");
        header.put("Authorization", token);
        String result = HttpUtil.doPost(url, paramters, "UTF-8", header);
        return new Gson().fromJson(result, EmployeeVO.class);
    }

    //生成合同接口
    public static BaseVO generateContract(String token, ContractsDTO contracts) {
        String url = baseUrlUtil.API_BASE_URL + "/contracts/employees/generate";
        //转换为map集合
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(contracts);
        LinkedHashMap<String, String> header = new LinkedHashMap<String, String>();
        //添加请求头信息
        header.put("Content-Type", "application/json; charset=UTF-8");
        header.put("Authorization", token);
        String result = HttpUtil.doPost(url, paramters, "UTF-8", header);
        return new Gson().fromJson(result, BaseVO.class);
    }

    //处理回调请求
    public static void processCallback(HttpServletRequest request, HttpServletResponse response, ContractCallbackHandler callbackHandler, String appKey) {
        ContractCallbackDTO contractCallbackDTO = CallbackUtil.parseObject(request, ContractCallbackDTO.class);
        //验证签名合法性
        SortedMap<String, Object> paramters = BeanToMapUtil.beanToMap(contractCallbackDTO);
        paramters.remove("sign");
        String sign = SignUtil.createOpenSign(paramters, appKey);
        try {
            if (!sign.equals(contractCallbackDTO.getSign())) {
                throw new SignException("签名不合法");
            }
        } catch (SignException e) {

        }
        try {
            if (callbackHandler != null) {
                callbackHandler.processCallback(contractCallbackDTO);
            }
        } catch (Exception e) {
            System.err.println("处理回调请求失败");
        }
        response.setContentType("application/json");

        try {
            CallbackVO callbackVO = new CallbackVO();
            callbackVO.setMessage("成功");
            callbackVO.setResponseCode(200);
            Gson gson=new Gson();
            String str = gson.toJson(callbackVO);
            PrintWriter writer = response.getWriter();
            writer.write(str);
        } catch (IOException e) {
            System.err.println("写入回调处理结果失败");
        }


    }

    public static void main(String[] args) throws Exception {
        EmployeeDTO employee = new EmployeeDTO();
        employee.setName("chenhao");
        employee.setPhone("15444848");
        EmployeeVO employeeVO = ContractsDemo.addEmployee("Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiaW1hZ2luZS1tYWluIiwiaW1hZ2luZS1vcGVuIiwiaW1hZ2luZS1hdXRoIl0sInNjb3BlIjpbInByb2ZpbGUiXSwiZXhwIjoxNTkyODEyMjIxLCJqdGkiOiI2NGUzNzM5OS04NDkwLTQzNDEtYWY4Ny1kMDhjNWNiNWUwNjMiLCJjbGllbnRfaWQiOiIzMDkwMDU4MjU0NTQ2MzcwNTYifQ.vHwVmzoVXQ93rdvFeouZ08L7xQWSw-d9BS_q10dStiB5bEOnroeipk_BOV_E_eHaFHIgWcxHGrBqcZt0l6EM4HKNoLIXjGI5kkKe66iOukv42U14q9SFUQ1j_EO9Rr_qTvhJOwvRBD6d-2TMcrjuscSF4Nwx-ZQVUMzBo3LZY6o7199"
                , employee, "309005825454637056");
        String employeeId = employeeVO.getEmployeeId();
        String extra = employeeVO.getExtra();
        String error = employeeVO.getError();
        String message = employeeVO.getMessage();
        System.out.println(employeeId);
        System.out.println(extra);
        System.out.println(error);
        System.out.println(message);


    }
}
