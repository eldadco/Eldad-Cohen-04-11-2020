package Pages.ContactUsFeature;

import PageUtills.Locators;
import Pages.BasePage;

public class ContactUsVerifications extends BasePage {
    public ContactUsVerifications() {
    }

    public Boolean isNameInputErrorLabelDisplayed() {
        return this.seleniumInfra.isElementExists(Locators.CSS.getLocator(), ContactUsPage.nameErrorLabel);

    }

    public Boolean isEmailInputErrorLabelDisplayed() {
        return this.seleniumInfra.isElementExists(Locators.CSS.getLocator(), ContactUsPage.emailErrorLabel);
    }

    public Boolean isCompanyInputErrorLabelDisplayed() {
        return this.seleniumInfra.isElementExists(Locators.CSS.getLocator(), ContactUsPage.companyErrorLabel);
    }

    public Boolean isTelephoneInputErrorLabelDisplayed() {
        return this.seleniumInfra.isElementExists(Locators.CSS.getLocator(), ContactUsPage.telephoneErrorLabel);
    }

}
