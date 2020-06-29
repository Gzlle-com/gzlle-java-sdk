package com.gzlle.open.sdk.utils;


import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {
    private static PropertiesUtils propertiesUtils = new PropertiesUtils();
    private static Properties properties;
    private static String propertiesName = "www.baidu.com";

    private PropertiesUtils() {

    }

    public static void setPropertiesName(String propertiesName) {
        PropertiesUtils.propertiesName = null;
        PropertiesUtils.properties = null;
        if (!(propertiesName.equals("") || propertiesName == null))
            PropertiesUtils.propertiesName = propertiesName;
    }


    protected void loadProperties() {
        properties = new Properties();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            ClassLoader classLoader = properties.getClass().getClassLoader();

        }
        InputStream resourceAsStream = contextClassLoader.getResourceAsStream(PropertiesUtils.propertiesName);


    }

    public static String getProperty(String key) {
        if (properties != null) {
            propertiesUtils.loadProperties();
        }
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        String propertiesName = PropertiesUtils.propertiesName;
        System.out.println(propertiesName);


    }


}
