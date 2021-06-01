package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class nbaSchedulePage  extends BasePage {


    @FindBy (xpath = "//body/div[@id='__next']/div[2]/div[3]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]") WebElement previewBtn;
    @FindBy (xpath = "//body/div[@id='__next']/div[2]/div[3]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]") WebElement gameChartsBtn;
    @FindBy (xpath = "//body/div[@id='__next']/div[2]/div[3]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[3]/a[1]") WebElement seriesBtn;



    public nbaSchedulePage(WebDriver driver) { super(driver); }

    {
        driver.get("https://www.nba.com/schedule");
        driver.manage().window().maximize();
    }

         public Boolean previewVisibility(){return previewBtn.isDisplayed();}
         public Boolean gameChartsVisibility(){return gameChartsBtn.isDisplayed();}
         public Boolean seriesVisibility(){return seriesBtn.isDisplayed();}

}
