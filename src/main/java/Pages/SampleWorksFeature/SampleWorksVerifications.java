package Pages.SampleWorksFeature;

import Pages.BasePage;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SampleWorksVerifications extends BasePage {
    SampleWorksActions sampleWorksActions;

    public SampleWorksVerifications() {
        this.sampleWorksActions = new SampleWorksActions();
    }

    public Boolean VerifyThatCorrectDotBecomeActiveAfterClickingOnArrows(int indexOfActiveDot, String typeOfArrow) {

        List<WebElement> dots = this.sampleWorksActions.getDotsList();
        switch (typeOfArrow) {
            case "left":
                if (indexOfActiveDot == -1) {
                    indexOfActiveDot = dots.size() - 1;
                }

            case "right":
                if (indexOfActiveDot == dots.size()) {
                    indexOfActiveDot = 0;
                }
        }
        return dots.get(indexOfActiveDot).getAttribute("class").equals("slick-active");
    }
}
