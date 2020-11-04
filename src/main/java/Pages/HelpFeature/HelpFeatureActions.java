package Pages.HelpFeature;

import Pages.BasePage;
import PageUtills.Locators;

import static Pages.HelpFeature.HelpFeaturePage.*;

public class HelpFeatureActions extends BasePage {


    public HelpFeatureActions() {

    }

    public void insertDetails(String nameInput, String emailInput, String phoneNumberInput) {
        this.seleniumInfra.write(Locators.CSS.getLocator(), nameInputByCss, null, nameInput);
        this.seleniumInfra.write(Locators.CSS.getLocator(), emailInputByCss, null, emailInput);
        this.seleniumInfra.write(Locators.CSS.getLocator(), phoneNumberByCss, null, phoneNumberInput);

    }

    public void send() {
        this.seleniumInfra.clickElement(Locators.CSS.getLocator(), sendButtonByCss, null);
    }
}
