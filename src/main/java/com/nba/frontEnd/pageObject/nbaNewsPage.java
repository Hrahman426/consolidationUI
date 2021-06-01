package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nbaNewsPage extends BasePage {


@FindBy(xpath = "//body/div[@id='__next']/div[2]/div[1]/div[3]") WebElement powerRankings;

    public nbaNewsPage(WebDriver driver) { super(driver); }
    {
        driver.get("https://www.nba.com/fantasy");
    }

        public Boolean powerRankingVisibility() {return powerRankings.isDisplayed();}
    }



