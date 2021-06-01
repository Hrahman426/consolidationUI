package com.nba.frontEnd.test;

import com.nba.frontEnd.base.BaseTest;
import com.nba.frontEnd.pageObject.nbaNewsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class nbaNewsPageTest extends BaseTest {

@Test
    public void nbaNewsPageTests()
    {
        nbaNewsPage newsPage= new nbaNewsPage(getDriver());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("fantasy"));
        Assert.assertTrue(newsPage.powerRankingVisibility());
    }

}
