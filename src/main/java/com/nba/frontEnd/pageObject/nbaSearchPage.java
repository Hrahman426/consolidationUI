package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nbaSearchPage extends BasePage {

    @FindBy(id = "search-text-input") WebElement searchTextBox;
    @FindBy(xpath = "//button[contains(text(),'SEARCH')]") WebElement searchResultsClick;
    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[3]/div[1]/div[1]") WebElement viewResults;


    public nbaSearchPage(WebDriver driver) { super(driver); }
    {
        driver.get("https://www.nba.com/search");
        driver.manage().window().maximize();
    }

    public nbaSearchPage enterString(String text)
    {
        searchTextBox.sendKeys(text);
        searchResultsClick.click();

        return new nbaSearchPage(driver);
    }

    public boolean viewResultsValidation()
    {
        return viewResults.isDisplayed();
    }

}

