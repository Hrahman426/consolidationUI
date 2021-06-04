package com.nba.frontEnd.test;

import com.nba.frontEnd.base.BaseTest;
import com.nba.frontEnd.pageObject.nbaStandingsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class nbaStandingsPageTest extends BaseTest {

    @Test
    public void nbaStandingsPageTests()
    {
        nbaStandingsPage standingsPage = new nbaStandingsPage(getDriver());
       // getDriver().manage().window().maximize();
       // Assert.assertTrue(getDriver().getCurrentUrl().contains("standings"));

    }
}


