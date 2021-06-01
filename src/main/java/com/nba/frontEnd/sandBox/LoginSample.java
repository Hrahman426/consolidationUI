package com.nba.frontEnd.sandBox;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LoginSample {

    public static void main(String[] args) {

        String chromePath = "C:\\Users\\rrosario\\Documents\\ChromeDriver\\Chrome90\\chromedriver.exe";
        String webUrl = "https://www.nba.com";
        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();
        driver.get(webUrl);

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1000))
                .ignoring(NoSuchElementException.class);

        WebElement signIn=wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//span[@id='nbaMenuButton']"));
            }
        });
        signIn.click();

        wait = null;

        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1000))
                .ignoring(NoSuchElementException.class);

        WebElement nbaMenuSignIn=wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//a[@id='nbaMenuNBASignIn']"));
            }
        });
        nbaMenuSignIn.click();

    }
}
