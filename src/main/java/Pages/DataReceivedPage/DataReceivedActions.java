package Pages.DataReceivedPage;

import PageUtills.TabsIndex;
import Pages.BasePage;
import PageUtills.Locators;

public class DataReceivedActions extends BasePage {

    public DataReceivedActions() {

    }

    public void navigateToDataReceivedPage() {
        this.seleniumInfra.getUrl("https://automation.herolo.co.il/thank-you/");
    }

    public void goToHeroloWebSite() {
        this.seleniumInfra.clickElement( DataReceivedPage.heroloWebSiteLinkButton,null,null);
        this.seleniumInfra.switchToTheNewTab();

    }

    public void closeTheHeroloWebSite() {
        this.seleniumInfra.closeTabByIndex(TabsIndex.SECOND.getIndex());
    }

    public void returnToAutomationWebSite() {
        this.seleniumInfra.wait(2);
        this.seleniumInfra.clickElement(DataReceivedPage.returnToAutomationSiteLinkButton, null,null);

    }


}
