package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nbaWatchPage extends BasePage {

    @FindBy(xpath = "//body/div[@id='root']/div[@id='pFeatured']/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/img[1]")WebElement playVid;

    public nbaWatchPage(WebDriver driver) { super(driver); }
    {
        driver.get("https://www.nba.com/watch/");
    }
    public nbaPlayVideoPage vidClick()
    {
        playVid.click();
        return new nbaPlayVideoPage(driver);}

}
