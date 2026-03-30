package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class DriverManager {

    private static AndroidDriver driver;
    private static Properties properties;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            loadProperties();
            createDriver();
        }
        return driver;
    }

    private static void loadProperties() {
        properties = new Properties();
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException("Could not load config.properties file", e);
        }
    }

    private static void createDriver() {
        try {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName(properties.getProperty("platformName"));
            options.setAutomationName(properties.getProperty("automationName"));
            options.setDeviceName(properties.getProperty("deviceName"));
            options.setApp(properties.getProperty("appPath"));

            driver = new AndroidDriver(
                    new URL(properties.getProperty("appiumServerUrl")),
                    options
            );
        } catch (Exception e) {
            throw new RuntimeException("Could not initialize AndroidDriver", e);
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}