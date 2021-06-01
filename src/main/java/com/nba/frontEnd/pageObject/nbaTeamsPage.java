package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nbaTeamsPage extends BasePage {
    @FindBy (xpath = "//body/div[@id='__next']/div[2]/div[3]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]") WebElement teamProfileClick;

    public nbaTeamsPage(WebDriver driver) { super(driver); }
    {
        driver.get("https://www.nba.com/teams");
    }
    public nbaTeamBioPage profileClick()
    {
        teamProfileClick.click();
        return new nbaTeamBioPage(driver);
    }



}
