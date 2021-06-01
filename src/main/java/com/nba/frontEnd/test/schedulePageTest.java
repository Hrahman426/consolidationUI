package com.nba.frontEnd.test;

import com.nba.frontEnd.base.BaseTest;
import com.nba.frontEnd.pageObject.nbaSchedulePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class schedulePageTest extends BaseTest {
    
    @Test
    public void validateSchedulePage()
    {
        nbaSchedulePage schedulepage = new nbaSchedulePage(getDriver());
        Assert.assertTrue(getDriver().getCurrentUrl().contains("schedule"));
        Assert.assertTrue(schedulepage.previewVisibility());
        Assert.assertTrue(schedulepage.gameChartsVisibility());
        Assert.assertTrue(schedulepage.seriesVisibility());
    }

}
