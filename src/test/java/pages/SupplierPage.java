package pages;

import com.selenium.test.webtestsbase.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

/**
 * This page is a page object.
 */
public class SupplierPage extends BasePage {

    private static final String PAGE_URL = "https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT";

    private Map<String, String> data;
    private WebDriver driver;

    //your postcode
    @FindBy(id = "your-postcode")
    private WebElement whatIsYourPostcode;

    //find postcode button
    @FindBy(id = "find-postcode")
    @CacheLookup
    private WebElement findPostcode;

    //change postcode link
    @FindBy(id = "change-postcode")
    private WebElement changePostcode;

    //bill handy yes
    @FindBy(css = "#getStarted > fieldset:nth-child(2) > div")
    @CacheLookup
    private WebElement yesIHaveMyBill;

    //private final String yesIHaveMyBillValue = "HaveMyBill";
    //private final String yesValue = "true";

    //bill handy no
    @FindBy(name = "bill-nobill")
    private List<WebElement> noIDontHaveMyBill;

    //private final String noIDontHaveMyBillValue = "DontHaveMyBill";
    //private final String noValue = "false";


    //what to compare both/elec/gas
    @FindBy(css = "#compare-electricity-label > span > span")
    private WebElement electricityOnly;

    private final String electricityOnlyValue = "Electricity";


    @FindBy(name = "compare-what-energy")
    @CacheLookup
    private List<WebElement> gasElectricity;

    private final String gasElectricityValue = "both";

    @FindBy(name = "compare-what-energy")
    @CacheLookup
    private List<WebElement> gasOnly;

    private final String gasOnlyValue = "Gas";

    //choose electricity supplier question
    @FindBy(css = "#dual-energy-suppliers-question > div")
    private WebElement chooseElectricitySupplier;

    //who supplies (eon)
    @FindBy(name = "dual-top-six")
    @CacheLookup
    private List<WebElement> eOn1;

    @FindBy(css = "#elec-energy-suppliers-question > div > div > div:nth-child(1) > label.eon.top-six.checked > span")
    private WebElement electricityEon;

    @FindBy(name = "gas-top-six")
    @CacheLookup
    private List<WebElement> eOn3;

    //next button
    @FindBy(css = "#goto-your-supplier-details")
    private WebElement nextSupplierPageButton;

    public SupplierPage() {
        super(true);
    }


    public SupplierPage(boolean openPageByUrl) {
        super(openPageByUrl);
    }

    protected void openPage() {
        getDriver().get(PAGE_URL);
    }

    protected boolean isOpened(){
        return whatIsYourPostcode.isDisplayed();
    }
    public boolean isChangePostcodeButtonDisplayed() {
        return changePostcode.isDisplayed();
    }

    /**
     * inserts postcode
     */
    public void setWhatIsYourPostcodeTextField(String whatIsYourPostcodeValue) {
        clearPostcodeField();
        whatIsYourPostcode.sendKeys(whatIsYourPostcodeValue);
    }

    /**
     * clears search string
     */
    private void clearPostcodeField(){
        whatIsYourPostcode.clear();
    }

    /**
     * Click on Find Postcode Button.
     *
     * @return the SupplierPage class instance.
     */
    public void clickFindPostcodeButton() {

        findPostcode.click();
    }

    /**
     * getting text from textfield
     * @return text from textfield as string
     */
    public String getPostcodeText(){
        return whatIsYourPostcode.getText();
    }

    public void billHandyYes() throws InterruptedException {
        pageAction().moveToElement(yesIHaveMyBill).perform();
        Thread.sleep(2000);
        pageAction().click(yesIHaveMyBill).perform();
    }
    public void compareElectricityOnly() throws InterruptedException {
        pageAction().moveToElement(electricityOnly).perform();
        Thread.sleep(2000);
        pageAction().click(electricityOnly).perform();
    }

    public void selectSupplierElectricity() throws InterruptedException {
        pageAction().moveToElement(chooseElectricitySupplier).perform();
        Thread.sleep(2000);
        pageAction().click(electricityEon).perform();
        Thread.sleep(2000);
    }

    public void clickNextSupplierPageButton() throws InterruptedException {
        pageAction().moveToElement(nextSupplierPageButton).perform();
        Thread.sleep(2000);
        pageAction().click(nextSupplierPageButton).perform();


    }
}
