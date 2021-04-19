package Pages.ContactUsFeature;

import org.openqa.selenium.By;

public class ContactUsPage {
    //contact us big element

    public static final String contactUsForm = "form#section-inputs";

    // inputs
    public static final By nameInput = By.cssSelector( "input#name");
    public static final By companyInput = By.cssSelector( "input#company");
    public static final By emailInput = By.cssSelector( "input#email");
    public static final By telephoneInput = By.cssSelector("input#telephone");

    //contact us button
    public static final By contactUsButton = By.cssSelector("form#section-inputs a[type='button']");

    //Error labels

    public static final By nameErrorLabel = By.cssSelector("input#name + span[class='commun__ErrorText-zi6nvq-6 bDkbFh']");
    public static final By companyErrorLabel = By.cssSelector("input#company + span[class='commun__ErrorText-zi6nvq-6 bDkbFh']");
    public static final By emailErrorLabel = By.cssSelector("input#email + span[class='commun__ErrorText-zi6nvq-6 bDkbFh']");
    public static final By telephoneErrorLabel = By.cssSelector("input#telephone+ span[class='commun__ErrorText-zi6nvq-6 bDkbFh'] span");
}
