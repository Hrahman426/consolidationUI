package com.nba.frontEnd.test;

import com.nba.frontEnd.base.BaseTest;
import com.nba.frontEnd.pageObject.nbaPrivacyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class nbaPrivacyPageTest extends BaseTest {

    @Test
    public void validatePrivacyUIElements()
    {
        nbaPrivacyPage privacyPage = new nbaPrivacyPage(getDriver());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://www.nba.com/privacy-policy"));
        Assert.assertTrue(privacyPage.privacyBodyVisibility());
        Assert.assertTrue(privacyPage.privacySummaryVisibility());
    }

}
