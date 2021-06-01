package com.nba.frontEnd.test;

import com.nba.frontEnd.base.BaseTest;
import com.nba.frontEnd.pageObject.nbaFantasyPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class nbaFantasyPageTest extends BaseTest {

    @Test
    public void validateNbaFantasyPageTests()
    {
        nbaFantasyPage standingsPage = new nbaFantasyPage(getDriver());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("fantasy"));
        System.out.println(getDriver().getCurrentUrl());
        Assert.assertTrue(standingsPage.textVisibility());
        Assert.assertTrue(standingsPage.carouselVisibility());
        Assert.assertTrue(standingsPage.featureVisibility());

    }

}
