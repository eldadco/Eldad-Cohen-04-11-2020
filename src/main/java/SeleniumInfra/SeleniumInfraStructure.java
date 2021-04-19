package SeleniumInfra;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumInfraStructure {
    protected WebDriver driver;
    protected WebDriverWait waitForElems;
    protected JavascriptExecutor js;
    protected ExpectedConditions conditions;

    public SeleniumInfraStructure() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\p0028867\\Documents\\Java---selenium-project-using-testNG\\src\\main\\java\\Pages\\DriverUtills\\chromrDriver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.waitForElems = new WebDriverWait(this.driver, 40);
        this.js = (JavascriptExecutor) driver;

    }

    public void getUrl(String url) {
        try {
            this.driver.get(url);
            System.out.println("Selenium-infra success message:\t The requested site has opened successfully");
            this.driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println("Selenium-infra error : \t" + e.toString());
        }
    }

    public boolean isElementExists(By locator, WebElement fromElement) {
        if (this.findElem(locator, fromElement) != null) {
            System.out.println("The element has found successfully");
            return true;
        } else {
            return false;
        }
    }


    public Boolean urlValidation(String url) {
        try {
            Thread.sleep(6000);
            if (this.driver.getCurrentUrl().contains(url)) {
                System.out.println("SeleniumInfra success message : the current url is: " + url);
                return true;
            } else {
                System.out.println("SeleniumInfra failed message : the current url does not contain: " + url);
                System.out.println("The current url is " + this.driver.getCurrentUrl());
                return false;
            }
        } catch (Exception excep) {
            System.out.println("SeleniumInfra exception message : " + excep.toString());
            return false;
        }
    }

    public WebElement findElem(By locator,WebElement fromElement) {

        try {
            if(fromElement != null){
                return fromElement.findElement(locator);
            }
            else{
                return this.driver.findElement(locator);
            }

        } catch (InvalidSelectorException excep) {
            System.out.println("Selenium-infra error : \t" + "invalid selector located : " + locator );
        } catch (NoSuchElementException excep) {
            System.out.println("Selenium-infra error : No such Element Exception located : " +  locator);

        } catch (ElementNotVisibleException excep) {

            System.out.println("Selenium-infra error : element not visible exception located : " + locator);
        }
        return null;

    }

    public List<WebElement> findElementListBy(By locator, WebElement fromElement) {

        try {
            if(fromElement != null){
                return fromElement.findElements(locator);
            }
            else{
                return this.driver.findElements(locator);
            }
        } catch (NoSuchElementException | ElementNotVisibleException except) {
            System.out.println("Selenium-infra error : \t" + except.toString());
        }
        return null;

    }

    public String getTextFromElement(By locator, WebElement fromElement, WebElement element) {
        try {
            if (element == null) {
                element = this.findElem(locator, fromElement);
            }
            return element.getText();
        } catch (Exception excep) {
            System.out.println("seleniumInfra error " + excep.toString());
            return "getTextFromElement function failed";
        }
    }

    public void clickElement(By locator, WebElement fromElement,WebElement element) {
        try {
            if (fromElement == null) {
                element = this.findElem(locator, fromElement);
            }
            element.click();
            System.out.println("Selenium-infra success message:\tThe element was successfully clicked");
        } catch (ElementNotVisibleException | ElementNotSelectableException excep) {
            System.out.println("Selenium-infra error : \t" + excep.toString());
        }
    }

    public void write(By locator,WebElement fromElement, WebElement element, String text) {
        try {
            if (element == null) {
                element = this.findElem(locator, fromElement);
            }

            element.sendKeys(text);
            System.out.println("Selenium-infra success message:\twriting text to the element");
        } catch (ElementNotVisibleException exception) {
            System.out.println("Selenium-infra error : \t" + exception.toString());
        }
    }

    public void wait(int number) {
        this.driver.manage().timeouts().implicitlyWait(number, TimeUnit.SECONDS);
    }

    public void scrollByOption(String option, WebElement element) {
        switch (option) {
            case "toElement": {
                if (element != null) {
                    this.js.executeScript("arguments[0].scrollIntoView(true)", element);
                }
                break;
            }
            case "untilDown": {
                this.js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
                break;
            }
        }
    }

    public void refresh() {
        this.driver.navigate().refresh();
    }

    public void closeTabByIndex(int index) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        if (tabs.size() > 1) {
            this.driver.switchTo().window(tabs.get(index));
            this.driver.close();
            this.driver.switchTo().window(tabs.get(index - 1));
        }
    }

    public void switchToTheNewTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        this.driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public void close() {

        this.driver.close();
    }

    public void quit() {
        this.driver.quit();
    }
}
