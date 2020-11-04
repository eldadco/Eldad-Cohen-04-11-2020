package Tests;

import Pages.DataReceivedPage.DataReceivedActions;
import Pages.DataReceivedPage.DataReceivedVerifications;
import Pages.DriverUtills.DriverSingleton;
import Pages.HomePage.HomePageActions;
import Pages.HomePage.HomePageVerifications;
import SeleniumInfra.SeleniumInfraStructure;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DataReceivedPageFeature extends BaseTest {
    DataReceivedActions dataReceivedActions;
    DataReceivedVerifications dataReceivedVerifications;
    HomePageVerifications homePageVerifications;
    HomePageActions homePageActions;
    private SeleniumInfraStructure seleniumInfra = DriverSingleton.getInstance().seleniumInfra;

    public DataReceivedPageFeature() {
        this.dataReceivedActions = new DataReceivedActions();
        this.dataReceivedVerifications = new DataReceivedVerifications();
        this.homePageVerifications = new HomePageVerifications();
        this.homePageActions = new HomePageActions();
    }

    @BeforeMethod
    public void beforeMethod() {
        this.dataReceivedActions.navigateToDataReceivedPage();
    }

    @Test(description = "Verify the home page is opened after clicking on the 'return' button")
    public void DataReceivedPositiveTest_HomePageIsOpened() {
        this.dataReceivedActions.returnToAutomationWebSite();
        assertTrue(this.homePageVerifications.isHomePageWasOpened(), "Verify the home page was opened after clicking on the return button");
    }

    @Test(description = "Verify the herolo web site is opened after clicking on 'go to web site' button")
    public void DataReceivedPositiveTest_HeroloWebSiteIsOpened() {
        this.dataReceivedActions.goToHeroloWebSite();
        assertTrue(this.dataReceivedVerifications.isHeroloWebSiteWasOpened(), "Verify that herolo web site was opened after clicking on herolo web site link button");
        this.dataReceivedActions.closeTheHeroloWebSite();
    }


}

