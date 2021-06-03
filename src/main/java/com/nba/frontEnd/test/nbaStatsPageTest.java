package com.nba.frontEnd.test;

import com.nba.frontEnd.base.BaseTest;
import com.nba.frontEnd.pageObject.nbaStatsPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class nbaStatsPageTest extends BaseTest {

    @Test
    public void verifyStatsUIElement()
    {
        nbaStatsPage statsPage = new nbaStatsPage(getDriver());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("stats"));
        Assert.assertTrue(statsPage.seasonLeadersVisibility());
        Assert.assertTrue(statsPage.tonightLoadersVisibility());

    }

}
