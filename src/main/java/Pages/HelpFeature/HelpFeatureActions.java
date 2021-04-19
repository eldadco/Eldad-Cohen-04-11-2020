package Pages.HelpFeature;

import Pages.BasePage;
import PageUtills.Locators;

import static Pages.HelpFeature.HelpFeaturePage.*;

public class HelpFeatureActions extends BasePage {


    public HelpFeatureActions() {

    }

    public void insertDetails(String nameInput, String emailInput, String phoneNumberInput) {
        this.seleniumInfra.write(HelpFeaturePage.nameInputByCss, null,null, nameInput);
        this.seleniumInfra.write(HelpFeaturePage.emailInputByCss, null,null, emailInput);
        this.seleniumInfra.write(HelpFeaturePage.phoneNumberByCss,null, null, phoneNumberInput);

    }

    public void send() {
        this.seleniumInfra.clickElement(HelpFeaturePage.sendButtonByCss,null, null);
    }
}
