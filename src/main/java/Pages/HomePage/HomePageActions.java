package Pages.HomePage;

import PageUtills.Locators;
import Pages.BasePage;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageActions extends BasePage {
    public HomePageActions()
    {}

    private WebElement findFeatureTitleElement(String title)
    {
        List<WebElement> featureTitles= this.seleniumInfra.findElementListBy(Locators.CSS.getLocator(), HomePage.featureTitles);

        for(WebElement elem : featureTitles)
        {
            if(this.seleniumInfra.getTextFromElement(null,null,elem).equals(title))
            {
                return elem;
            }
        }

        return null;

    }

    public void scrollToFeatureByElement(String featureTitle)
    {
        WebElement featureTitleElement= this.findFeatureTitleElement(featureTitle);
        this.seleniumInfra.scrollByOption("toElement", featureTitleElement);
    }

    public void scrollToBottomOfThePage()
    {
        this.seleniumInfra.scrollByOption("untilDown",null);
    }
}
