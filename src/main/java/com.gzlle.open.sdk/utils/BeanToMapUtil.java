package com.gzlle.open.sdk.utils;

import com.gzlle.open.sdk.dto.EmployeeDTO;
import com.gzlle.open.sdk.dto.withdraw.ListOrderDTO;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class BeanToMapUtil {
    //将pojo转换为map集合
    public static SortedMap<String,Object> beanToMap(Object o)  {
        SortedMap<String,Object> sortedMap = new TreeMap<String, Object>();
        Field[] declaredFields = o.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            //过滤内容为空的
            try {
                if (field.get(o) == null) {
                    continue;
                }
                sortedMap.put(field.getName(), field.get(o));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        return sortedMap;
    }

    public static void main(String[] args) {
        ListOrderDTO listOrderDTO=new ListOrderDTO();
        listOrderDTO.setId("1");
        listOrderDTO.setPageNum(4);
        List<String> list=new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        listOrderDTO.setEmployeeIdList(list);
        SortedMap<String,Object> sortedMap=beanToMap(listOrderDTO);
        System.out.println(sortedMap);



    }

}
