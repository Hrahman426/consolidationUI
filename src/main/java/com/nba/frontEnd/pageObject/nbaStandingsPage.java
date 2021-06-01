package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nbaStandingsPage extends BasePage {


 @FindBy(className = "DropDown_dropdown__3yMqx[1]" ) WebElement selectGroup;
 @FindBy(className = "bracket__background") WebElement background;
 @FindBy(xpath = "//span[contains(text(),'Show/Hide Bracket')]") WebElement hideBracket;


    public nbaStandingsPage(WebDriver driver) { super(driver); }
    {
        driver.get("https://www.nba.com/standings");
    }

    public Boolean selectGroupVisibility() { return selectGroup.isDisplayed(); }
   // public Boolean backgroundLogo() {return background.isDisplayed();}
    //public void hideBracketClick(){hideBracket.click();}

}
