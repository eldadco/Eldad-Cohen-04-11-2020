package Tests;

import Pages.DriverUtills.DriverSingleton;
import SeleniumInfra.SeleniumInfraStructure;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    private SeleniumInfraStructure seleniumInfra = DriverSingleton.getInstance().seleniumInfra;

    @BeforeClass
    public void beforeClassMethod() {
        this.seleniumInfra.getUrl("https://automation.herolo.co.il/");
    }

    @AfterSuite
    public void afterSuiteMethod() {
        this.seleniumInfra.close();
        this.seleniumInfra.quit();
    }


    @AfterMethod
    public void afterTestActions() {
        if (this.seleniumInfra.urlValidation("https://automation.herolo.co.il/")) {
            this.seleniumInfra.refresh();

        } else {
            this.seleniumInfra.getUrl("https://automation.herolo.co.il/");
        }

    }
}
