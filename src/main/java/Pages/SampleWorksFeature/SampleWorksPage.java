package Pages.SampleWorksFeature;

import org.openqa.selenium.By;

public class SampleWorksPage {
    //Arrows

    public static final By leftArrow = By.cssSelector("div[class='slick-arrow slick-prev'] img[alt='Left arrow']");
    public static final By rightArrow = By.cssSelector("div[class='slick-arrow slick-next'] img[alt='Right arrow']");

    //Dots list

    public static final By dotsList = By.cssSelector("section[class='portfolio__Portfolio-sc-80s039-0 bMmzri'] ul[class='slick-dots'] li");
}
