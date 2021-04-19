package Pages.ContactUsFeature;

import PageUtills.Locators;
import Pages.BasePage;

public class ContactUsActions extends BasePage {
    public ContactUsActions() {
    }

    public void insertDetails(String nameInput, String companyInput, String emailInput, String telephoneInput) {
        this.seleniumInfra.write( ContactUsPage.nameInput,null, null, nameInput);
        this.seleniumInfra.write( ContactUsPage.companyInput, null,null, companyInput);
        this.seleniumInfra.write(ContactUsPage.emailInput, null,null, emailInput);
        this.seleniumInfra.write(ContactUsPage.telephoneInput,null, null, telephoneInput);

    }

    public void clickOnContactUsButton() {
        this.seleniumInfra.clickElement(ContactUsPage.contactUsButton, null,null);

    }
}
