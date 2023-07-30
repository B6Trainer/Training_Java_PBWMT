package com.training.b6.designpatterns;

import com.training.b6.core.Controller;
import com.training.b6.helpers.LogHelper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfiguration {

    /*
    * Singleton object
    * */
    private static AppConfiguration instance;

    private static Properties properties;

    private static final String className= AppConfiguration.class.getSimpleName();

    /*
    * Constructor is private to ensure that Singleton patter is followed
    * */
    private AppConfiguration() throws IOException {
        loadConfiguration();
    }

    public static AppConfiguration getInstance() throws IOException {
        if (instance == null) {
            instance = new AppConfiguration();
        }
        return instance;
    }

    private static void loadConfiguration() throws IOException {
        properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream("E:/Training/Local Workspace/Training/Config/App.config")) {
            properties.load(fileInputStream);
            LogHelper.printOnConsole(className,"Application configuration loaded successfully");
        }finally {

        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
