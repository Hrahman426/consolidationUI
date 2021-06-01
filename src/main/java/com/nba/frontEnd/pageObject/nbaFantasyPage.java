package com.nba.frontEnd.pageObject;

import com.nba.frontEnd.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nbaFantasyPage extends BasePage {

    @FindBy(xpath = "//h2[contains(text(),'Fantasy Nightly Leaders')]") WebElement fantasyText;
    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[2]/div[2]/section[1]/div[1]") WebElement carousel;
    @FindBy(xpath = "//p[contains(text(),'Featured')]") WebElement feature;

   public nbaFantasyPage(WebDriver driver) {super(driver);}
    {
        driver.get("https://www.nba.com/fantasy");
    }

    public Boolean textVisibility() {return fantasyText.isDisplayed();}
    public Boolean carouselVisibility () {return carousel.isDisplayed();}
    public Boolean featureVisibility () {return feature.isDisplayed();}
}


