package com.nba.frontEnd.test;

import com.nba.frontEnd.base.BaseTest;
import com.nba.frontEnd.pageObject.nbaTVPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class nbaTVPageTest extends BaseTest {

    @Test
    public void validateTVUIElements()
    {
        nbaTVPage tvPage= new nbaTVPage(getDriver());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("streaming-subscriptions"));
        Assert.assertTrue(tvPage.startedBtnVisibility());
        Assert.assertTrue(tvPage.annualSubscriptionVisibility());
        Assert.assertTrue(tvPage.monthlySubscriptionVisibility());
        Assert.assertTrue(tvPage.lpPremiumVisibility());
    }

}
