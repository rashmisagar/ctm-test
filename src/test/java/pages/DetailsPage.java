package pages;

/**
 * Created by RSen on 27/03/2017.
 */

        import java.util.List;
        import java.util.Map;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.CacheLookup;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.ui.ExpectedCondition;
        import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailsPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "terms")
    @CacheLookup
    private WebElement agreeTerms;

    @FindBy(name = "pre-select-payment-type")
    @CacheLookup
    private List<WebElement> allPaymentTypes;

    private final String allPaymentTypesValue = "all";

    @FindBy(name = "pre-select-tariff-type")
    @CacheLookup
    private List<WebElement> allTariffs;

    private final String allTariffsValue = "all";

    @FindBy(id = "go-back")
    @CacheLookup
    private WebElement back;

    @FindBy(id = "ctm-logo")
    @CacheLookup
    private WebElement comparethemarketCom;

    @FindBy(css = "a[href='https://www.comparethemarket.com/contact-us/']")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(name = "pre-select-tariff-type")
    @CacheLookup
    private List<WebElement> fixedTariff;

    private final String fixedTariffValue = "fixed";

    @FindBy(id = "email-submit")
    @CacheLookup
    private WebElement goToPrices;

    @FindBy(id = "marketingPreference")
    @CacheLookup
    private WebElement marketing;

    @FindBy(name = "pre-select-payment-type")
    @CacheLookup
    private List<WebElement> monthlyDirectDebit;

    private final String monthlyDirectDebitValue = "monthly";

    private final String pageLoadedText = "We will send you an email confirming your best prices and another to invite you to join MEERKAT MOVIES once you have made a qualifying purchase";

    private final String pageUrl = "/energy/v2/yourDetails?AFFCLIE=TSTT";

    @FindBy(name = "pre-select-payment-type")
    @CacheLookup
    private List<WebElement> payOnReceiptOfBill;

    private final String payOnReceiptOfBillValue = "onBill";

    @FindBy(css = "a[href='http://www.comparethemarket.com/information/privacy-policy/']")
    @CacheLookup
    private WebElement privacyCookiePolicy;

    @FindBy(name = "pre-select-payment-type")
    @CacheLookup
    private List<WebElement> quarterlyDirectDebit;

    private final String quarterlyDirectDebitValue = "quarterly";

    @FindBy(css = "a[href='http://www.comparethemarket.com/information/terms-and-conditions/']")
    @CacheLookup
    private WebElement termsAndConditions;

    @FindBy(css = "a[href='https://www.comparethemarket.com/information/terms-and-conditions/']")
    @CacheLookup
    private WebElement termsConditions;

    @FindBy(name = "pre-select-tariff-type")
    @CacheLookup
    private List<WebElement> variableTariff;

    private final String variableTariffValue = "variable";

    @FindBy(css = "a.arrow-before")
    @CacheLookup
    private WebElement viewQuestion;

    @FindBy(id = "Email")
    @CacheLookup
    private WebElement whatIsYourEmailAddress;

    @FindBy(id = "your-account-button")
    @CacheLookup
    private WebElement yourAccount;

    @FindBy(css = "#header-container ul.journey-navigation.ng-scope.five-tabs li:nth-of-type(2) a.nav-item.ng-scope")
    @CacheLookup
    private WebElement yourEnergy;

    @FindBy(css = "a[href='http://www.comparethemarket.com/information/rewards-terms/']")
    @CacheLookup
    private WebElement yourRewardsTermsAndConditions;

    @FindBy(css = "#header-container ul.journey-navigation.ng-scope.five-tabs li:nth-of-type(1) a.nav-item.ng-scope")
    @CacheLookup
    private WebElement yourSupplier;

    public DetailsPage() {
    }

    public DetailsPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public DetailsPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public DetailsPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Back Button.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage clickBackButton() {
        back.click();
        return this;
    }

    /**
     * Click on Comparethemarket.com Link.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage clickComparethemarketComLink() {
        comparethemarketCom.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Go To Prices Button.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage clickGoToPricesButton() {
        goToPrices.click();
        return this;
    }

    /**
     * Click on Privacy Cookie Policy Link.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage clickPrivacyCookiePolicyLink() {
        privacyCookiePolicy.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Link.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage clickTermsAndConditionsLink() {
        termsAndConditions.click();
        return this;
    }

    /**
     * Click on Terms Conditions Link.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage clickTermsConditionsLink() {
        termsConditions.click();
        return this;
    }

    /**
     * Click on View Question Link.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage clickViewQuestionLink() {
        viewQuestion.click();
        return this;
    }

    /**
     * Click on Your Account Link.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage clickYourAccountLink() {
        yourAccount.click();
        return this;
    }

    /**
     * Click on Your Energy Link.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage clickYourEnergyLink() {
        yourEnergy.click();
        return this;
    }

    /**
     * Click on Your Rewards Terms And Conditions Link.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage clickYourRewardsTermsAndConditionsLink() {
        yourRewardsTermsAndConditions.click();
        return this;
    }

    /**
     * Click on Your Supplier Link.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage clickYourSupplierLink() {
        yourSupplier.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage fill() {
        setFixedTariffRadioButtonField();
        setVariableTariffRadioButtonField();
        setAllTariffsRadioButtonField();
        setMonthlyDirectDebitRadioButtonField();
        setQuarterlyDirectDebitRadioButtonField();
        setPayOnReceiptOfBillRadioButtonField();
        setAllPaymentTypesRadioButtonField();
        setWhatIsYourEmailAddressTextField();
        setMarketingCheckboxField();
        setAgreeTermsCheckboxField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set Agree Terms Checkbox field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage setAgreeTermsCheckboxField() {
        if (!agreeTerms.isSelected()) {
            agreeTerms.click();
        }
        return this;
    }

    /**
     * Set default value to All Payment Types Radio Button field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage setAllPaymentTypesRadioButtonField() {
        for (WebElement el : allPaymentTypes) {
            if (el.getAttribute("value").equals(allPaymentTypesValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to All Tariffs Radio Button field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage setAllTariffsRadioButtonField() {
        for (WebElement el : allTariffs) {
            if (el.getAttribute("value").equals(allTariffsValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Fixed Tariff Radio Button field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage setFixedTariffRadioButtonField() {
        for (WebElement el : fixedTariff) {
            if (el.getAttribute("value").equals(fixedTariffValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set Marketing Checkbox field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage setMarketingCheckboxField() {
        if (!marketing.isSelected()) {
            marketing.click();
        }
        return this;
    }

    /**
     * Set default value to Monthly Direct Debit Radio Button field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage setMonthlyDirectDebitRadioButtonField() {
        for (WebElement el : monthlyDirectDebit) {
            if (el.getAttribute("value").equals(monthlyDirectDebitValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Pay On Receipt Of Bill Radio Button field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage setPayOnReceiptOfBillRadioButtonField() {
        for (WebElement el : payOnReceiptOfBill) {
            if (el.getAttribute("value").equals(payOnReceiptOfBillValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Quarterly Direct Debit Radio Button field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage setQuarterlyDirectDebitRadioButtonField() {
        for (WebElement el : quarterlyDirectDebit) {
            if (el.getAttribute("value").equals(quarterlyDirectDebitValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Variable Tariff Radio Button field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage setVariableTariffRadioButtonField() {
        for (WebElement el : variableTariff) {
            if (el.getAttribute("value").equals(variableTariffValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to What Is Your Email Address Text field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage setWhatIsYourEmailAddressTextField() {
        return setWhatIsYourEmailAddressTextField(data.get("WHAT_IS_YOUR_EMAIL_ADDRESS"));
    }

    /**
     * Set value to What Is Your Email Address Text field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage setWhatIsYourEmailAddressTextField(String whatIsYourEmailAddressValue) {
        whatIsYourEmailAddress.sendKeys(whatIsYourEmailAddressValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage submit() {
        clickGoToPricesButton();
        return this;
    }

    /**
     * Unset Agree Terms Checkbox field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage unsetAgreeTermsCheckboxField() {
        if (agreeTerms.isSelected()) {
            agreeTerms.click();
        }
        return this;
    }

    /**
     * Unset Marketing Checkbox field.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage unsetMarketingCheckboxField() {
        if (marketing.isSelected()) {
            marketing.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the DetailsPage class instance.
     */
    public DetailsPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
