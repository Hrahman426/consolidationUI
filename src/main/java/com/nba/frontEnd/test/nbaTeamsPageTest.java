package com.nba.frontEnd.test;

import com.nba.frontEnd.base.BaseTest;
import com.nba.frontEnd.pageObject.nbaTeamBioPage;
import org.testng.annotations.Test;

public class nbaTeamsPageTest extends BaseTest {


    @Test
    public void validateFavoriteSignInPrompt()
    {
        nbaTeamBioPage teamBioPage = new nbaTeamBioPage(getDriver());
        teamBioPage.favBtnVisibility();
    }
}
