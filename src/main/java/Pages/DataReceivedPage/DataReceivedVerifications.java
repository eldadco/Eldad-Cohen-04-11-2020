package Pages.DataReceivedPage;

import Pages.BasePage;

public class DataReceivedVerifications extends BasePage {
    public DataReceivedVerifications() {
    }

    public Boolean isDataReceivedPageWasOpened() {
        return seleniumInfra.urlValidation("automation.herolo.co.il/thank-you/");

    }

    public Boolean isHeroloWebSiteWasOpened() {
        return seleniumInfra.urlValidation("https://herolo.co.il/");
    }
}
