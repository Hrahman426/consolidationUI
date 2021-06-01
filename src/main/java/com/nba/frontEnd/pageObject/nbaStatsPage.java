package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nbaStatsPage extends BasePage {


    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/a[2]") WebElement seasonLeaders;
    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/a[1]")WebElement tonightsLeaders;


    public nbaStatsPage(WebDriver driver) { super(driver); }
    {
        driver.get("https://www.nba.com/stats/");
    }
    public Boolean seasonLeadersVisibility (){return seasonLeaders.isDisplayed();}
    public Boolean tonightLoadersVisibility(){return tonightsLeaders.isDisplayed();}
}
