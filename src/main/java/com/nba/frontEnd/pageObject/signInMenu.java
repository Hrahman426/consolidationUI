package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signInMenu extends BasePage {

    @FindBy(id="nbaMenuNBASignIn") WebElement signInToNBAaccountBtn;

    public signInMenu(WebDriver driver){
        super(driver);
    }

    public signInToNBAAccount clickOnSignInToNBAAccount(){
     signInToNBAaccountBtn.click();
     return new signInToNBAAccount(driver);
    }

}
