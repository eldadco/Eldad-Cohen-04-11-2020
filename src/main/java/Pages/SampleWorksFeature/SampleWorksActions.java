package Pages.SampleWorksFeature;

import PageUtills.Locators;
import Pages.BasePage;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SampleWorksActions extends BasePage {
    public SampleWorksActions() {
    }

    public void ClickOnLeftArrow() {
        this.seleniumInfra.clickElement(Locators.CSS.getLocator(), SampleWorksPage.leftArrow, null);
    }

    public void ClickOnRightArrow() {
        this.seleniumInfra.clickElement(Locators.CSS.getLocator(), SampleWorksPage.rightArrow, null);
    }

    public List<WebElement> getDotsList() {
        return this.seleniumInfra.findElementListBy(Locators.CSS.getLocator(), SampleWorksPage.dotsList);
    }

    public Integer getIndexOfActiveDot() {
        List<WebElement> dotsList = this.getDotsList();
        for (int i = 0; i < dotsList.size(); i++) {
            if (dotsList.get(i).getAttribute("class").equals("slick-active")) {
                return i;
            }
        }
        throw new IllegalArgumentException("There isn't an active dot");
    }
}
