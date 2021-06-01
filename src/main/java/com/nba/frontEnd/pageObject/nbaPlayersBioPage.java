package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nbaPlayersBioPage extends BasePage {

    @FindBy (xpath = "//a[contains(text(),'Rotowire')]") WebElement rotowire;

    public nbaPlayersBioPage(WebDriver driver) { super(driver); }

    public Boolean rotowireVisibility() { return rotowire.isDisplayed();}

}

