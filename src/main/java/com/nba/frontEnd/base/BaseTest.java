package com.nba.frontEnd.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;


public class BaseTest {

    private WebDriver driver;
    private String webUrl = "https://www.nba.com/";


    @BeforeClass
    public void beforeSuite() {
        System.setProperty("headless", "false"); // You can set this property elsewhere
       // String chromePath = "C:\\Selenium\\chromedriver.exe";
       // System.setProperty("webdriver.chrome.driver", chromePath);
        String headless = System.getProperty("headless");

        WebDriverManager.chromedriver().setup();

        if("true".equals(headless)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else {
            driver = new ChromeDriver();
        }

        driver.get(webUrl);
    }

    @AfterClass
    public void afterSuite() {
     System.out.println("afterTestRun");
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}