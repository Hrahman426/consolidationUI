package com.nba.frontEnd.test;

import com.nba.frontEnd.base.BaseTest;
import com.nba.frontEnd.pageObject.nbaHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class nbaHomePageTest extends BaseTest {

    @Test
    public void homePageLoginTests(){
        nbaHomePage nbaPage = new nbaHomePage(getDriver());

        Assert.assertTrue(nbaPage
                .clickOnSignInBtn()
                .clickOnSignInToNBAAccount()
                .setUserAndPassword("rrosario@nba.com", "13301330").NBANavVisibility());
    }
    
    @Test
    public void logoDisplayedTest()
    {
        nbaHomePage hp= new nbaHomePage(getDriver());
        Assert.assertTrue(hp.NBALogoVisibility());
    }
}
