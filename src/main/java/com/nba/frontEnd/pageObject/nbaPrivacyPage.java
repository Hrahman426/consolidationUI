package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nbaPrivacyPage extends BasePage{

        @FindBy(xpath = "//strong[contains(text(),'About This Privacy Policy')]") WebElement privacyPolicy;
        @FindBy(xpath = "//body/div[@id='__next']/div[2]/main[1]/div[2]/section[1]/div[2]/section[1]")WebElement privacyBody;


 public nbaPrivacyPage(WebDriver driver) { super(driver);}
    {
        driver.get("https://www.nba.com/privacy-policy");
    }
    public boolean privacySummaryVisibility(){return privacyPolicy.isDisplayed();}
    public boolean privacyBodyVisibility(){return privacyBody.isDisplayed();}

}
