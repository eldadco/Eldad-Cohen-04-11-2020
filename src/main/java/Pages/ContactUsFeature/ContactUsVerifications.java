package Pages.ContactUsFeature;

import PageUtills.Locators;
import Pages.BasePage;

public class ContactUsVerifications extends BasePage {
    public ContactUsVerifications() {
    }

    public Boolean isNameInputErrorLabelDisplayed() {
        return this.seleniumInfra.isElementExists(ContactUsPage.nameErrorLabel,null);

    }

    public Boolean isEmailInputErrorLabelDisplayed() {
        return this.seleniumInfra.isElementExists( ContactUsPage.emailErrorLabel,null);
    }

    public Boolean isCompanyInputErrorLabelDisplayed() {
        return this.seleniumInfra.isElementExists(ContactUsPage.companyErrorLabel,null);
    }

    public Boolean isTelephoneInputErrorLabelDisplayed() {
        return this.seleniumInfra.isElementExists(ContactUsPage.telephoneErrorLabel,null);
    }

}
