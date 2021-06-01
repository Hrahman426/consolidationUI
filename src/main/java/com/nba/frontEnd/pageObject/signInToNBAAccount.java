package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signInToNBAAccount extends BasePage {


    @FindBy(id="nbaLoginModalId") WebElement userFld;
    @FindBy(id="nbaLoginModalPw") WebElement passwordFld;
    @FindBy(id="nbaLoginModalSignIn") WebElement signInbtn;

    public signInToNBAAccount(WebDriver driver){
        super(driver);
    }

    public nbaHomePage setUserAndPassword(String user, String password) {
        passwordFld.sendKeys(password);
        userFld.sendKeys(user);
        signInbtn.click();
        return new nbaHomePage(driver);
    }

}
