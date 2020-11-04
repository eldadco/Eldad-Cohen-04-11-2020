package Tests;

import Pages.DataReceivedPage.DataReceivedActions;
import Pages.DataReceivedPage.DataReceivedVerifications;
import Pages.HelpFeature.HelpFeatureActions;
import Pages.HelpFeature.HelpFeatureVerifications;
import Pages.HomePage.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class HelpFeature extends BaseTest {
    HomePage homePage;
    HelpFeatureActions helpFeatureActions;
    HelpFeatureVerifications helpFeatureVerifications;
    DataReceivedActions dataReceivedActions;
    DataReceivedVerifications dataReceivedVerifications;

    public HelpFeature() {
        this.homePage = new HomePage();
        this.helpFeatureActions = new HelpFeatureActions();
        this.dataReceivedActions = new DataReceivedActions();
        this.helpFeatureVerifications = new HelpFeatureVerifications();
        this.dataReceivedVerifications = new DataReceivedVerifications();
    }


    @Test(description = "Verify the data received page is opened when inserting name,email address ,phone number and clicking on the send button")
    public void helpFeaturePositiveTest_DataReceivedPageIsOpened() {

        this.helpFeatureActions.insertDetails("Jhon Cena", "Jhon@gmail.com", "0522222114");
        this.helpFeatureActions.send();
        assertTrue(this.dataReceivedVerifications.isDataReceivedPageWasOpened(), "Help feature test ==> Verify the details have been send successfully");

    }

    @Test(description = "Verify that illegal inputs cannot be sent")
    public void helpFeatureNegativeTest_DataReceivedPageIsNotOpened() {

        this.helpFeatureActions.insertDetails("", "Jhongmail.com", "aaaaa");
        this.helpFeatureActions.send();
        assertFalse(this.dataReceivedVerifications.isDataReceivedPageWasOpened(), "Verify the data received page was opened successfully");
    }

    @Test(description = "Verify that error labels displayed under the input fields when inserting wrong name,email and phone number")
    public void helpFeatureNegativeTest_ErrorLabelsAppearBelowTheFields() {
        this.helpFeatureActions.insertDetails("", "Jhongmail.com", "aaaaa");
        this.helpFeatureActions.send();
        boolean isErrorLabelsDisplayed = this.helpFeatureVerifications.isNameInputErrorDisplayed() && this.helpFeatureVerifications.isEmailInputErrorDisplayed() && this.helpFeatureVerifications.isPhoneNumberInputErrorDisplayed();
        assertTrue(isErrorLabelsDisplayed, "Verify the error labels displayed under the input fields");
    }

}



