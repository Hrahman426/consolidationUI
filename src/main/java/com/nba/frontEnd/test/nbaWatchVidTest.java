package com.nba.frontEnd.test;

import com.nba.frontEnd.base.BaseTest;
import com.nba.frontEnd.pageObject.nbaWatchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class nbaWatchVidTest extends BaseTest {

    @Test
    public void validateVideoPlayback()
    {
        nbaWatchPage watchPage= new nbaWatchPage(getDriver());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("watch"));
        watchPage.vidClick();
    }
}
