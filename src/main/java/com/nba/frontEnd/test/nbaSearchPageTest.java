package com.nba.frontEnd.test;

import com.nba.frontEnd.base.BaseTest;
import com.nba.frontEnd.pageObject.nbaSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class nbaSearchPageTest extends BaseTest {

    @Test
    public void validateSearchImprovements()
    {
        nbaSearchPage searchPage = new nbaSearchPage(getDriver());
        Assert.assertTrue(searchPage.enterString("James").viewResultsValidation());
    }

}
