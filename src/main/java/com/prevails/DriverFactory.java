package com.prevails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public  static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
    public static WebDriver initializeDriver(String browserName) {
        WebDriver driver;
        switch (browserName) {
            case "chrome" -> {
                driver = new ChromeDriver();
            }
            case "firefox" -> {
                driver = new FirefoxDriver();
            }
            default -> throw new IllegalArgumentException("Browser not supported: " + browserName);
        }
        driver.manage().window().maximize();
        DriverFactory.driver.set(driver);
        return driver;
        };
    public static WebDriver getDriver(String browserName) {
               return driver.get();
    }

}
