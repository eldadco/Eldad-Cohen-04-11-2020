package Pages.ContactUsFeature;

import PageUtills.Locators;
import Pages.BasePage;

public class ContactUsActions extends BasePage {
    public ContactUsActions() {
    }

    public void insertDetails(String nameInput, String companyInput, String emailInput, String telephoneInput) {
        this.seleniumInfra.write(Locators.CSS.getLocator(), ContactUsPage.nameInput, null, nameInput);
        this.seleniumInfra.write(Locators.CSS.getLocator(), ContactUsPage.companyInput, null, companyInput);
        this.seleniumInfra.write(Locators.CSS.getLocator(), ContactUsPage.emailInput, null, emailInput);
        this.seleniumInfra.write(Locators.CSS.getLocator(), ContactUsPage.telephoneInput, null, telephoneInput);

    }

    public void clickOnContactUsButton() {
        this.seleniumInfra.clickElement(Locators.CSS.getLocator(), ContactUsPage.contactUsButton, null);

    }
}
