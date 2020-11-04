package Tests;

import Pages.ContactUsFeature.ContactUsActions;
import Pages.ContactUsFeature.ContactUsVerifications;
import Pages.DataReceivedPage.DataReceivedVerifications;
import Pages.HomePage.HomePageActions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactUsFeature extends BaseTest {
    ContactUsActions contactUsActions;
    ContactUsVerifications contactUsVerifications;
    DataReceivedVerifications dataReceivedVerifications;
    HomePageActions homePageActions;

    public ContactUsFeature() {
        this.contactUsActions = new ContactUsActions();
        this.contactUsVerifications = new ContactUsVerifications();
        this.dataReceivedVerifications = new DataReceivedVerifications();
        this.homePageActions = new HomePageActions();
    }

    @BeforeMethod
    public void beforeMethod() {
        this.homePageActions.scrollToBottomOfThePage();
    }

    @Test(description = "Verify the data received page was opened after insert details and clicking on the contact us button")
    public void ContactUsFeaturePositiveTest_DataReceivedPageIsOpened() {
        this.contactUsActions.insertDetails("Jhon", "Google", "Jhon11@gmail.com", "0544569874");
        this.contactUsActions.clickOnContactUsButton();
        Assert.assertTrue(this.dataReceivedVerifications.isDataReceivedPageWasOpened(), "Verify the data received page was opened after insert details and clicking on the contact us button");

    }

    @Test(description = "Verify that in case of clicking the contact us button in time that the inputs are empty, the error labels are displayed and the data received page is not opened")
    public void ContactUsFeatureEmptyInputsNegativeTest_ErrorLabelsDisplayed() {
        this.contactUsActions.clickOnContactUsButton();
        boolean isErrorLabelsDisplayed = this.contactUsVerifications.isNameInputErrorLabelDisplayed() && this.contactUsVerifications.isEmailInputErrorLabelDisplayed() && this.contactUsVerifications.isCompanyInputErrorLabelDisplayed() && this.contactUsVerifications.isTelephoneInputErrorLabelDisplayed();
        Assert.assertTrue(isErrorLabelsDisplayed, "Verify that empty inputs cannot be sent");
        Assert.assertFalse(this.dataReceivedVerifications.isDataReceivedPageWasOpened(), "Verify the data received page was not opened");

    }

    @Test(description = "Verify the email error label and telephone error label are displayed after inserting nine digits telephone number and incorrect email format")
    public void ContactUsFeatureInputsInWrongFormatNegativeTest_ErrorsLabelsDisplayed() {
        this.contactUsActions.insertDetails("Jhon", "google", "Jhon11gmailcom", "05445698741");
        this.contactUsActions.clickOnContactUsButton();
        boolean isErrorLabelsDisplayed = this.contactUsVerifications.isEmailInputErrorLabelDisplayed() && this.contactUsVerifications.isTelephoneInputErrorLabelDisplayed();
        Assert.assertTrue(isErrorLabelsDisplayed, "Verify the email address has to be in email format and the telephone number can not contain nine digits");
        Assert.assertFalse(this.dataReceivedVerifications.isDataReceivedPageWasOpened(), "Verify data received page was not opened");

    }

}
