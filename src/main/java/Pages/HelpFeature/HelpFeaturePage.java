package Pages.HelpFeature;

import org.openqa.selenium.By;

public class HelpFeaturePage {

    // Inputs
    public static final By nameInputByCss = By.cssSelector("#footer form div input[name='name']");
    public static final By emailInputByCss = By.cssSelector( "#footer form div input[name='email']");
    public static final By phoneNumberByCss = By.cssSelector("#footer form div input[name='phone']");
    public static final By sendButtonByCss = By.cssSelector("#footer form div + button");

    // Error labels
    public static final By nameErrorLabelByCss = By.cssSelector( "#footer form div input[name='name'] + label[class*='InputError']");
    public static final By emailErrorLabelByCss = By.cssSelector("#footer form div input[name='email'] + label[class*='InputError']");
    public static final By phoneNumberErrorLabelByCss = By.cssSelector("#footer form div input[name='phone'] + label[class*='InputError']");

}

