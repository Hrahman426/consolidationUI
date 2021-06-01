package com.nba.frontEnd.test;

import com.nba.frontEnd.base.BaseTest;
import com.nba.frontEnd.pageObject.nbaPlayersPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class nbaPlayersPageTest extends BaseTest {


    @Test
    public void validatePlayersRotowire() {
        nbaPlayersPage playersPage = new nbaPlayersPage(getDriver());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("players"));
        Assert.assertTrue(playersPage.playersHeadshotImage().rotowireVisibility());

    }
}