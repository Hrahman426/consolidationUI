package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nbaTVPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'GET STARTED')]") WebElement getStartedBtn;
    @FindBy(xpath = "//body/div[@id='nbaRenderContainer']/div[1]/section[2]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]")WebElement annualSubscription;
    @FindBy(xpath = "//p[contains(text(),'Monthly')]")WebElement monthlySubscription;
    @FindBy(xpath = "//body/div[@id='nbaRenderContainer']/div[1]/section[2]/section[1]/div[2]/div[1]/section[3]/div[1]/div[1]")WebElement lpPremium;


    public nbaTVPage(WebDriver driver) { super(driver); }

    {
        driver.get("https://watch.nba.com/streaming-subscriptions");
        driver.manage().window().maximize();
    }

    public Boolean startedBtnVisibility (){return getStartedBtn.isDisplayed();}
    public Boolean annualSubscriptionVisibility() {return annualSubscription.isEnabled();}
    public Boolean monthlySubscriptionVisibility() {return monthlySubscription.isEnabled();}
    public Boolean lpPremiumVisibility() {return lpPremium.isEnabled();}


}
