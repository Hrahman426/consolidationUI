package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class nbaPlayersPage extends BasePage {
    @FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]") WebElement playersHeadshot;

    public nbaPlayersPage(WebDriver driver) { super(driver); }
    {
        driver.get("https://www.nba.com/players");
    }

    public  nbaPlayersBioPage playersHeadshotImage()
    {
        playersHeadshot.click();
        return new nbaPlayersBioPage(driver);
    }

}

