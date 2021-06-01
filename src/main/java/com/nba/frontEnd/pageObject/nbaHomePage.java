package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class nbaHomePage extends BasePage {

@FindBy(id ="nbaMenuButton") WebElement signInBtn;
@FindBy(xpath = "//body/div[@id='__next']/div[2]/div[1]/div[1]/nav[1]/a[1]/img[1]") WebElement nbaLogo;
@FindBy(className = "NavItem_item__3UN5f") WebElement nbaNavBar;

    public nbaHomePage(WebDriver driver) {
        super(driver);
    }

    public Boolean NBALogoVisibility(){
        return nbaLogo.isDisplayed();
    }
    public Boolean NBANavVisibility() {
        return nbaNavBar.isDisplayed();
    }
    public signInMenu clickOnSignInBtn(){
      signInBtn.click();
     return new signInMenu(driver);
    }

}
