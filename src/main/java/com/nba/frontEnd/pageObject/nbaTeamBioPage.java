package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nbaTeamBioPage extends BasePage {

    @FindBy(xpath ="//body/div[@id='__next']/div[2]/section[1]/div[1]/div[1]/div[3]/div[2]/button[1]") WebElement favBtnClick;

    public nbaTeamBioPage(WebDriver driver) { super(driver); }
    {
        driver.get("https://www.nba.com/team/1610612738/celtics");
    }

    public nbaTeamBioPage favBtnVisibility()
    {
        favBtnClick.click();
        return new nbaTeamBioPage(driver);
    }

}
