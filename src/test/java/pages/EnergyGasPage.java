package pages;

/**
 * Created by RSen on 27/03/2017.
 */

import java.util.Map;

        import java.util.List;

import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.CacheLookup;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.ui.ExpectedCondition;
        import org.openqa.selenium.support.ui.Select;
        import org.openqa.selenium.support.ui.WebDriverWait;

public class EnergyGasPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "go-back")
    @CacheLookup
    private WebElement back;

    @FindBy(css = "#electricity-bill-day_root div.picker__holder div.picker__frame div.picker__wrap div.picker__box div:nth-of-type(2) button:nth-of-type(2)")
    @CacheLookup
    private WebElement clear1;

    @FindBy(css = "#gas-bill-day_root div.picker__holder div.picker__frame div.picker__wrap div.picker__box div:nth-of-type(2) button:nth-of-type(2)")
    @CacheLookup
    private WebElement clear2;

    @FindBy(css = "#electricity-bill-day_root div.picker__holder div.picker__frame div.picker__wrap div.picker__box div:nth-of-type(2) button:nth-of-type(3)")
    @CacheLookup
    private WebElement close1;

    @FindBy(css = "#gas-bill-day_root div.picker__holder div.picker__frame div.picker__wrap div.picker__box div:nth-of-type(2) button:nth-of-type(3)")
    @CacheLookup
    private WebElement close2;

    @FindBy(id = "ctm-logo")
    @CacheLookup
    private WebElement comparethemarketCom;

    @FindBy(id = "electricity-spend")
    @CacheLookup
    private WebElement electricityCurrentSpendAmount;

    @FindBy(id = "electricity-spend-dropdown")
    @CacheLookup
    private WebElement electricityCurrentSpendPeriod1;

    @FindBy(id = "economy-7-day-usage-dropdown")
    @CacheLookup
    private WebElement electricityCurrentSpendPeriod2;

    @FindBy(id = "economy-7-night-usage-dropdown")
    @CacheLookup
    private WebElement electricityCurrentSpendPeriod3;

    @FindBy(id = "electricity-usage")
    @CacheLookup
    private WebElement electricityKwhAmount;

    @FindBy(id = "electricity-usage-dropdown")
    @CacheLookup
    private WebElement electricityKwhPeriod;

    @FindBy(id = "economy-7-day-usage")
    @CacheLookup
    private WebElement electricityUsedEconomy7DayIn;

    @FindBy(id = "economy-7-night-usage")
    @CacheLookup
    private WebElement electricityUsedEconomy7NightIn;

    @FindBy(id = "gas-spend")
    @CacheLookup
    private WebElement gasCurrentSpendAmount;

    @FindBy(id = "type-of-Gas-bill-dropdown")
    @CacheLookup
    private WebElement gasCurrentSpendPeriod;

    @FindBy(id = "gas-usage")
    @CacheLookup
    private WebElement gasKwhAmount;

    @FindBy(id = "type-of-Gas-bill-usage-dropdown")
    @CacheLookup
    private WebElement gasKwhPeriod;

    @FindBy(id = "electricity-payment-method-dropdown-link")
    @CacheLookup
    private WebElement howDoYouPayForYour1;

    @FindBy(id = "gas-payment-method-dropdown-link")
    @CacheLookup
    private WebElement howDoYouPayForYour2;

    @FindBy(name = "995")
    @CacheLookup
    private List<WebElement> kwh1;

    @FindBy(name = "997")
    @CacheLookup
    private List<WebElement> kwh2;

    private final String kwhValue = "kwh";

    @FindBy(id = "goto-your-energy")
    @CacheLookup
    private WebElement next;

    @FindBy(name = "economy-7-no")
    @CacheLookup
    private List<WebElement> no1;

    @FindBy(name = "elec-main-source")
    @CacheLookup
    private List<WebElement> no2;

    @FindBy(name = "gas-main-source")
    @CacheLookup
    private List<WebElement> no3;

    private final String noValue1 = "false";

    private final String noValue2 = "other";

    private final String noValue3 = "on";

    private final String pageLoadedText = "We may use your data for marketing and you will be given an opportunity to decide whether you wish to receive marketing from us";

    private final String pageUrl = "/energy/v2/yourEnergy?AFFCLIE=TSTT";

    @FindBy(id = "electricity-bill-day")
    @CacheLookup
    private WebElement pleaseEnterTheBillDateWhich1;

    @FindBy(id = "gas-bill-day")
    @CacheLookup
    private WebElement pleaseEnterTheBillDateWhich2;

    @FindBy(css = "a[href='http://www.comparethemarket.com/information/privacy-policy/']")
    @CacheLookup
    private WebElement privacyCookiePolicy;

    @FindBy(css = "a[href='http://www.comparethemarket.com/information/terms-and-conditions/']")
    @CacheLookup
    private WebElement termsAndConditions;

    @FindBy(css = "#electricity-bill-day_root div.picker__holder div.picker__frame div.picker__wrap div.picker__box div:nth-of-type(2) button:nth-of-type(1)")
    @CacheLookup
    private WebElement today1;

    @FindBy(css = "#gas-bill-day_root div.picker__holder div.picker__frame div.picker__wrap div.picker__box div:nth-of-type(2) button:nth-of-type(1)")
    @CacheLookup
    private WebElement today2;

    private final String value = "pound";

    @FindBy(css = "a.arrow-before")
    @CacheLookup
    private WebElement viewQuestion;

    @FindBy(id = "electricity-tariff-additional-info")
    @CacheLookup
    private WebElement whatElectricityTariffAreYouOn;

    @FindBy(id = "gas-tariff-additional-info")
    @CacheLookup
    private WebElement whatGasTariffAreYouOn;

    @FindBy(name = "economy-7-yes")
    @CacheLookup
    private List<WebElement> yes1;

    @FindBy(name = "elec-main-source")
    @CacheLookup
    private List<WebElement> yes2;

    @FindBy(name = "gas-main-source")
    @CacheLookup
    private List<WebElement> yes3;

    private final String yesValue1 = "true";

    private final String yesValue2 = "Gas";

    private final String yesValue3 = "Electricity";

    @FindBy(id = "your-account-button")
    @CacheLookup
    private WebElement yourAccount;

    @FindBy(css = "a.nav-item.ng-scope")
    @CacheLookup
    private WebElement yourSupplier;

    public EnergyGasPage() {
    }

    public EnergyGasPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public EnergyGasPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public EnergyGasPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Back Button.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickBackButton() {
        back.click();
        return this;
    }

    /**
     * Click on Clear Button.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickClear1Button() {
        clear1.click();
        return this;
    }

    /**
     * Click on Clear Button.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickClear2Button() {
        clear2.click();
        return this;
    }

    /**
     * Click on Close Button.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickClose1Button() {
        close1.click();
        return this;
    }

    /**
     * Click on Close Button.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickClose2Button() {
        close2.click();
        return this;
    }

    /**
     * Click on Comparethemarket.com Link.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickComparethemarketComLink() {
        comparethemarketCom.click();
        return this;
    }

    /**
     * Click on Next Button.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickNextButton() {
        next.click();
        return this;
    }

    /**
     * Click on Privacy Cookie Policy Link.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickPrivacyCookiePolicyLink() {
        privacyCookiePolicy.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Link.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickTermsAndConditionsLink() {
        termsAndConditions.click();
        return this;
    }

    /**
     * Click on Today Button.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickToday1Button() {
        today1.click();
        return this;
    }

    /**
     * Click on Today Button.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickToday2Button() {
        today2.click();
        return this;
    }

    /**
     * Click on View Question Link.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickViewQuestionLink() {
        viewQuestion.click();
        return this;
    }

    /**
     * Click on Your Account Link.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickYourAccountLink() {
        yourAccount.click();
        return this;
    }

    /**
     * Click on Your Supplier Link.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage clickYourSupplierLink() {
        yourSupplier.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage fill() {
        setWhatElectricityTariffAreYouOnDropDownListField();
        setYes1RadioButtonField();
        setNo1RadioButtonField();
        setHowDoYouPayForYour1DropDownListField();
        setYes2RadioButtonField();
        setNo2RadioButtonField();
        setKwh1RadioButtonField();
        setElectricityCurrentSpendAmountTextField();
        setElectricityCurrentSpendPeriod1DropDownListField();
        setElectricityKwhAmountTextField();
        setElectricityKwhPeriodDropDownListField();
        setElectricityUsedEconomy7DayInTextField();
        setElectricityCurrentSpendPeriod2DropDownListField();
        setElectricityUsedEconomy7NightInTextField();
        setElectricityCurrentSpendPeriod3DropDownListField();
        setPleaseEnterTheBillDateWhich1TextField();
        setWhatGasTariffAreYouOnDropDownListField();
        setHowDoYouPayForYour2DropDownListField();
        setYes3RadioButtonField();
        setNo3RadioButtonField();
        // setKwh2RadioButtonField();
        setGasCurrentSpendAmountTextField();
        setGasCurrentSpendPeriodDropDownListField();
        setGasKwhAmountTextField();
        setGasKwhPeriodDropDownListField();
        setPleaseEnterTheBillDateWhich2TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Electricity Current Spend Amount Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityCurrentSpendAmountTextField() {
        return setElectricityCurrentSpendAmountTextField(data.get("ELECTRICITY_CURRENT_SPEND_AMOUNT"));
    }

    /**
     * Set value to Electricity Current Spend Amount Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityCurrentSpendAmountTextField(String electricityCurrentSpendAmountValue) {
        electricityCurrentSpendAmount.sendKeys(electricityCurrentSpendAmountValue);
        return this;
    }

    /**
     * Set default value to Electricity Current Spend Period Drop Down List
     * field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityCurrentSpendPeriod1DropDownListField() {
        return setElectricityCurrentSpendPeriod1DropDownListField(data.get("ELECTRICITY_CURRENT_SPEND_PERIOD_1"));
    }

    /**
     * Set value to Electricity Current Spend Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityCurrentSpendPeriod1DropDownListField(
            String electricityCurrentSpendPeriod1Value) {
        new Select(electricityCurrentSpendPeriod1).selectByVisibleText(electricityCurrentSpendPeriod1Value);
        return this;
    }

    /**
     * Set default value to Electricity Current Spend Period Drop Down List
     * field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityCurrentSpendPeriod2DropDownListField() {
        return setElectricityCurrentSpendPeriod2DropDownListField(data.get("ELECTRICITY_CURRENT_SPEND_PERIOD_2"));
    }

    /**
     * Set value to Electricity Current Spend Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityCurrentSpendPeriod2DropDownListField(
            String electricityCurrentSpendPeriod2Value) {
        new Select(electricityCurrentSpendPeriod2).selectByVisibleText(electricityCurrentSpendPeriod2Value);
        return this;
    }

    /**
     * Set default value to Electricity Current Spend Period Drop Down List
     * field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityCurrentSpendPeriod3DropDownListField() {
        return setElectricityCurrentSpendPeriod3DropDownListField(data.get("ELECTRICITY_CURRENT_SPEND_PERIOD_3"));
    }

    /**
     * Set value to Electricity Current Spend Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityCurrentSpendPeriod3DropDownListField(
            String electricityCurrentSpendPeriod3Value) {
        new Select(electricityCurrentSpendPeriod3).selectByVisibleText(electricityCurrentSpendPeriod3Value);
        return this;
    }

    /**
     * Set default value to Electricity Kwh Amount Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityKwhAmountTextField() {
        return setElectricityKwhAmountTextField(data.get("ELECTRICITY_KWH_AMOUNT"));
    }

    /**
     * Set value to Electricity Kwh Amount Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityKwhAmountTextField(String electricityKwhAmountValue) {
        electricityKwhAmount.sendKeys(electricityKwhAmountValue);
        return this;
    }

    /**
     * Set default value to Electricity Kwh Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityKwhPeriodDropDownListField() {
        return setElectricityKwhPeriodDropDownListField(data.get("ELECTRICITY_KWH_PERIOD"));
    }

    /**
     * Set value to Electricity Kwh Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityKwhPeriodDropDownListField(String electricityKwhPeriodValue) {
        new Select(electricityKwhPeriod).selectByVisibleText(electricityKwhPeriodValue);
        return this;
    }

    /**
     * Set default value to Electricity Used Economy 7 Day In Kwh Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityUsedEconomy7DayInTextField() {
        return setElectricityUsedEconomy7DayInTextField(data.get("ELECTRICITY_USED_ECONOMY_7_DAY_IN"));
    }

    /**
     * Set value to Electricity Used Economy 7 Day In Kwh Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityUsedEconomy7DayInTextField(String electricityUsedEconomy7DayInValue) {
        electricityUsedEconomy7DayIn.sendKeys(electricityUsedEconomy7DayInValue);
        return this;
    }

    /**
     * Set default value to Electricity Used Economy 7 Night In Kwh Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityUsedEconomy7NightInTextField() {
        return setElectricityUsedEconomy7NightInTextField(data.get("ELECTRICITY_USED_ECONOMY_7_NIGHT_IN"));
    }

    /**
     * Set value to Electricity Used Economy 7 Night In Kwh Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setElectricityUsedEconomy7NightInTextField(String electricityUsedEconomy7NightInValue) {
        electricityUsedEconomy7NightIn.sendKeys(electricityUsedEconomy7NightInValue);
        return this;
    }

    /**
     * Set default value to Gas Current Spend Amount Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setGasCurrentSpendAmountTextField() {
        return setGasCurrentSpendAmountTextField(data.get("GAS_CURRENT_SPEND_AMOUNT"));
    }

    /**
     * Set value to Gas Current Spend Amount Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setGasCurrentSpendAmountTextField(String gasCurrentSpendAmountValue) {
        gasCurrentSpendAmount.sendKeys(gasCurrentSpendAmountValue);
        return this;
    }

    /**
     * Set default value to Gas Current Spend Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setGasCurrentSpendPeriodDropDownListField() {
        return setGasCurrentSpendPeriodDropDownListField(data.get("GAS_CURRENT_SPEND_PERIOD"));
    }

    /**
     * Set value to Gas Current Spend Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setGasCurrentSpendPeriodDropDownListField(String gasCurrentSpendPeriodValue) {
        new Select(gasCurrentSpendPeriod).selectByVisibleText(gasCurrentSpendPeriodValue);
        return this;
    }

    /**
     * Set default value to Gas Kwh Amount Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setGasKwhAmountTextField() {
        return setGasKwhAmountTextField(data.get("GAS_KWH_AMOUNT"));
    }

    /**
     * Set value to Gas Kwh Amount Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setGasKwhAmountTextField(String gasKwhAmountValue) {
        gasKwhAmount.sendKeys(gasKwhAmountValue);
        return this;
    }

    /**
     * Set default value to Gas Kwh Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setGasKwhPeriodDropDownListField() {
        return setGasKwhPeriodDropDownListField(data.get("GAS_KWH_PERIOD"));
    }

    /**
     * Set value to Gas Kwh Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setGasKwhPeriodDropDownListField(String gasKwhPeriodValue) {
        new Select(gasKwhPeriod).selectByVisibleText(gasKwhPeriodValue);
        return this;
    }

    /**
     * Set default value to How Do You Pay For Your Gas Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setHowDoYouPayForYour1DropDownListField() {
        return setHowDoYouPayForYour1DropDownListField(data.get("HOW_DO_YOU_PAY_FOR_YOUR_1"));
    }

    /**
     * Set value to How Do You Pay For Your Gas Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setHowDoYouPayForYour1DropDownListField(String howDoYouPayForYour1Value) {
        new Select(howDoYouPayForYour1).selectByVisibleText(howDoYouPayForYour1Value);
        return this;
    }

    /**
     * Set default value to How Do You Pay For Your Gas Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setHowDoYouPayForYour2DropDownListField() {
        return setHowDoYouPayForYour2DropDownListField(data.get("HOW_DO_YOU_PAY_FOR_YOUR_2"));
    }

    /**
     * Set value to How Do You Pay For Your Gas Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setHowDoYouPayForYour2DropDownListField(String howDoYouPayForYour2Value) {
        new Select(howDoYouPayForYour2).selectByVisibleText(howDoYouPayForYour2Value);
        return this;
    }

    /**
     * Set default value to Kwh Radio Button field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setKwh1RadioButtonField() {
        for (WebElement el : kwh1) {
            if (el.getAttribute("value").equals(kwhValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Kwh Radio Button field.
     *
     * @return the EnergyGasPage class instance.
     */
	/*
	 * public EnergyGasPage setKwh2RadioButtonField() { for (WebElement el :
	 * kwh2) { if (el.getAttribute("value").equals(kwh2Value)) { if
	 * (!el.isSelected()) { el.click(); } break; } } return this; }
	 */

    /**
     * Set default value to No Radio Button field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setNo1RadioButtonField() {
        for (WebElement el : no1) {
            if (el.getAttribute("value").equals(noValue1)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to No Radio Button field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setNo2RadioButtonField() {
        for (WebElement el : no2) {
            if (el.getAttribute("value").equals(noValue2)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to No Radio Button field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setNo3RadioButtonField() {
        for (WebElement el : no3) {
            if (el.getAttribute("value").equals(noValue3)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Enter The Bill Date Which Can Be Found On The
     * Front Of Your Bill. Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setPleaseEnterTheBillDateWhich1TextField() {
        return setPleaseEnterTheBillDateWhich1TextField(data.get("PLEASE_ENTER_THE_BILL_DATE_WHICH_1"));
    }

    /**
     * Set value to Please Enter The Bill Date Which Can Be Found On The Front
     * Of Your Bill. Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setPleaseEnterTheBillDateWhich1TextField(String pleaseEnterTheBillDateWhich1Value) {
        pleaseEnterTheBillDateWhich1.sendKeys(pleaseEnterTheBillDateWhich1Value);
        return this;
    }

    /**
     * Set default value to Please Enter The Bill Date Which Can Be Found On The
     * Front Of Your Bill. Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setPleaseEnterTheBillDateWhich2TextField() {
        return setPleaseEnterTheBillDateWhich2TextField(data.get("PLEASE_ENTER_THE_BILL_DATE_WHICH_2"));
    }

    /**
     * Set value to Please Enter The Bill Date Which Can Be Found On The Front
     * Of Your Bill. Text field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setPleaseEnterTheBillDateWhich2TextField(String pleaseEnterTheBillDateWhich2Value) {
        pleaseEnterTheBillDateWhich2.sendKeys(pleaseEnterTheBillDateWhich2Value);
        return this;
    }

    /**
     * Set default value to What Electricity Tariff Are You On Drop Down List
     * field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setWhatElectricityTariffAreYouOnDropDownListField() {
        return setWhatElectricityTariffAreYouOnDropDownListField(data.get("WHAT_ELECTRICITY_TARIFF_ARE_YOU_ON"));
    }

    /**
     * Set value to What Electricity Tariff Are You On Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setWhatElectricityTariffAreYouOnDropDownListField(String whatElectricityTariffAreYouOnValue) {
        new Select(whatElectricityTariffAreYouOn).selectByVisibleText(whatElectricityTariffAreYouOnValue);
        return this;
    }

    /**
     * Set default value to What Gas Tariff Are You On Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setWhatGasTariffAreYouOnDropDownListField() {
        return setWhatGasTariffAreYouOnDropDownListField(data.get("WHAT_GAS_TARIFF_ARE_YOU_ON"));
    }

    /**
     * Set value to What Gas Tariff Are You On Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setWhatGasTariffAreYouOnDropDownListField(String whatGasTariffAreYouOnValue) {
        new Select(whatGasTariffAreYouOn).selectByVisibleText(whatGasTariffAreYouOnValue);
        return this;
    }

    /**
     * Set default value to Yes Radio Button field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setYes1RadioButtonField() {
        for (WebElement el : yes1) {
            if (el.getAttribute("value").equals(yesValue1)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Yes Radio Button field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setYes2RadioButtonField() {
        for (WebElement el : yes2) {
            if (el.getAttribute("value").equals(yesValue2)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Yes Radio Button field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage setYes3RadioButtonField() {
        for (WebElement el : yes3) {
            if (el.getAttribute("value").equals(yesValue3)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage submit() {
        clickNextButton();
        return this;
    }

    /**
     * Unset default value from Electricity Current Spend Period Drop Down List
     * field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetElectricityCurrentSpendPeriod1DropDownListField() {
        return unsetElectricityCurrentSpendPeriod1DropDownListField(data.get("ELECTRICITY_CURRENT_SPEND_PERIOD_1"));
    }

    /**
     * Unset value from Electricity Current Spend Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetElectricityCurrentSpendPeriod1DropDownListField(
            String electricityCurrentSpendPeriod1Value) {
        new Select(electricityCurrentSpendPeriod1).deselectByVisibleText(electricityCurrentSpendPeriod1Value);
        return this;
    }

    /**
     * Unset default value from Electricity Current Spend Period Drop Down List
     * field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetElectricityCurrentSpendPeriod2DropDownListField() {
        return unsetElectricityCurrentSpendPeriod2DropDownListField(data.get("ELECTRICITY_CURRENT_SPEND_PERIOD_2"));
    }

    /**
     * Unset value from Electricity Current Spend Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetElectricityCurrentSpendPeriod2DropDownListField(
            String electricityCurrentSpendPeriod2Value) {
        new Select(electricityCurrentSpendPeriod2).deselectByVisibleText(electricityCurrentSpendPeriod2Value);
        return this;
    }

    /**
     * Unset default value from Electricity Current Spend Period Drop Down List
     * field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetElectricityCurrentSpendPeriod3DropDownListField() {
        return unsetElectricityCurrentSpendPeriod3DropDownListField(data.get("ELECTRICITY_CURRENT_SPEND_PERIOD_3"));
    }

    /**
     * Unset value from Electricity Current Spend Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetElectricityCurrentSpendPeriod3DropDownListField(
            String electricityCurrentSpendPeriod3Value) {
        new Select(electricityCurrentSpendPeriod3).deselectByVisibleText(electricityCurrentSpendPeriod3Value);
        return this;
    }

    /**
     * Unset default value from Electricity Kwh Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetElectricityKwhPeriodDropDownListField() {
        return unsetElectricityKwhPeriodDropDownListField(data.get("ELECTRICITY_KWH_PERIOD"));
    }

    /**
     * Unset value from Electricity Kwh Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetElectricityKwhPeriodDropDownListField(String electricityKwhPeriodValue) {
        new Select(electricityKwhPeriod).deselectByVisibleText(electricityKwhPeriodValue);
        return this;
    }

    /**
     * Unset default value from Gas Current Spend Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetGasCurrentSpendPeriodDropDownListField() {
        return unsetGasCurrentSpendPeriodDropDownListField(data.get("GAS_CURRENT_SPEND_PERIOD"));
    }

    /**
     * Unset value from Gas Current Spend Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetGasCurrentSpendPeriodDropDownListField(String gasCurrentSpendPeriodValue) {
        new Select(gasCurrentSpendPeriod).deselectByVisibleText(gasCurrentSpendPeriodValue);
        return this;
    }

    /**
     * Unset default value from Gas Kwh Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetGasKwhPeriodDropDownListField() {
        return unsetGasKwhPeriodDropDownListField(data.get("GAS_KWH_PERIOD"));
    }

    /**
     * Unset value from Gas Kwh Period Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetGasKwhPeriodDropDownListField(String gasKwhPeriodValue) {
        new Select(gasKwhPeriod).deselectByVisibleText(gasKwhPeriodValue);
        return this;
    }

    /**
     * Unset default value from How Do You Pay For Your Gas Drop Down List
     * field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetHowDoYouPayForYour1DropDownListField() {
        return unsetHowDoYouPayForYour1DropDownListField(data.get("HOW_DO_YOU_PAY_FOR_YOUR_1"));
    }

    /**
     * Unset value from How Do You Pay For Your Gas Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetHowDoYouPayForYour1DropDownListField(String howDoYouPayForYour1Value) {
        new Select(howDoYouPayForYour1).deselectByVisibleText(howDoYouPayForYour1Value);
        return this;
    }

    /**
     * Unset default value from How Do You Pay For Your Gas Drop Down List
     * field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetHowDoYouPayForYour2DropDownListField() {
        return unsetHowDoYouPayForYour2DropDownListField(data.get("HOW_DO_YOU_PAY_FOR_YOUR_2"));
    }

    /**
     * Unset value from How Do You Pay For Your Gas Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetHowDoYouPayForYour2DropDownListField(String howDoYouPayForYour2Value) {
        new Select(howDoYouPayForYour2).deselectByVisibleText(howDoYouPayForYour2Value);
        return this;
    }

    /**
     * Unset default value from What Electricity Tariff Are You On Drop Down
     * List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetWhatElectricityTariffAreYouOnDropDownListField() {
        return unsetWhatElectricityTariffAreYouOnDropDownListField(data.get("WHAT_ELECTRICITY_TARIFF_ARE_YOU_ON"));
    }

    /**
     * Unset value from What Electricity Tariff Are You On Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetWhatElectricityTariffAreYouOnDropDownListField(
            String whatElectricityTariffAreYouOnValue) {
        new Select(whatElectricityTariffAreYouOn).deselectByVisibleText(whatElectricityTariffAreYouOnValue);
        return this;
    }

    /**
     * Unset default value from What Gas Tariff Are You On Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetWhatGasTariffAreYouOnDropDownListField() {
        return unsetWhatGasTariffAreYouOnDropDownListField(data.get("WHAT_GAS_TARIFF_ARE_YOU_ON"));
    }

    /**
     * Unset value from What Gas Tariff Are You On Drop Down List field.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage unsetWhatGasTariffAreYouOnDropDownListField(String whatGasTariffAreYouOnValue) {
        new Select(whatGasTariffAreYouOn).deselectByVisibleText(whatGasTariffAreYouOnValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the EnergyGasPage class instance.
     */
    public EnergyGasPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

