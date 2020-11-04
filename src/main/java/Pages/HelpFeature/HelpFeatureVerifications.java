package Pages.HelpFeature;

import Pages.BasePage;
import PageUtills.Locators;

import static Pages.HelpFeature.HelpFeaturePage.*;

public class HelpFeatureVerifications extends BasePage {

    public HelpFeatureVerifications() {
    }

    public boolean isNameInputErrorDisplayed() {
        return this.seleniumInfra.isElementExists(Locators.CSS.getLocator(), nameErrorLabelByCss);

    }

    public boolean isEmailInputErrorDisplayed() {
        return this.seleniumInfra.isElementExists(Locators.CSS.getLocator(), emailErrorLabelByCss);
    }

    public boolean isPhoneNumberInputErrorDisplayed() {
        return this.seleniumInfra.isElementExists(Locators.CSS.getLocator(), phoneNumberErrorLabelByCss);
    }
}
