package Tests;

import Pages.HomePage.HomePageActions;
import Pages.SampleWorksFeature.SampleWorksActions;
import Pages.SampleWorksFeature.SampleWorksVerifications;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SampleWorkFeature extends BaseTest {
    HomePageActions homePageActions;
    SampleWorksActions sampleWorksActions;
    SampleWorksVerifications sampleWorksVerifications;

    public SampleWorkFeature() {
        this.homePageActions = new HomePageActions();
        this.sampleWorksActions = new SampleWorksActions();
        this.sampleWorksVerifications = new SampleWorksVerifications();
    }

    @BeforeClass
    public void beforeSampleWorksArrowsTest() {
        this.homePageActions.scrollToFeatureByElement("עבודות לדוגמה");
    }


    @Test(description = "Verify that the correct dot become active after clicking on the right arrow")
    public void sampleWorksFeaturePositiveTest_RightArrowTest() {

        this.homePageActions.scrollToFeatureByElement("עבודות לדוגמה");
        int indexOfActiveDot = this.sampleWorksActions.getIndexOfActiveDot();
        this.sampleWorksActions.ClickOnRightArrow();
        assertTrue(this.sampleWorksVerifications.VerifyThatCorrectDotBecomeActiveAfterClickingOnArrows(indexOfActiveDot + 1, "right"), "Verify that the correct dot has turned to be active after clicking on right arrow");

    }

    @Test(description = "Verify that the correct dot become active after clicking on the left arrow")
    public void sampleWorksFeaturePositiveTest_LeftArrowTest() {
        int indexOfActiveDot = this.sampleWorksActions.getIndexOfActiveDot();
        this.sampleWorksActions.ClickOnLeftArrow();
        assertTrue(this.sampleWorksVerifications.VerifyThatCorrectDotBecomeActiveAfterClickingOnArrows(indexOfActiveDot - 1, "left"), "Verify that the correct dot has turned to be active after clicking on left arrow");

    }

}
