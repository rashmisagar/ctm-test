package steps;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import Base.FunctionLib;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ElectricityOnlyTestSteps {

    public ElectricityOnlyTestSteps() {
        super();
    }

    public static WebDriver driver;
    Actions action;
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    @Given("^I navigate to Home Page of the Energy journey$")
    public void I_navigate_to_Home_Page_of_the_Energy_journey() throws Throwable {
        File dir = new File(System.getProperty("user.home") +"/Google/Chrome/Driver");
        try{
            FunctionLib.createDirectory(dir);

        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        if (!new File(System.getProperty("user.home") + "/Google/Chrome/Driver/chromedriver.exe").exists()){
            try{
                FunctionLib.copyFile(new File(new File("./src/drivers/chromedriver.exe").getCanonicalPath()), (new File(dir +"/chromedriver.exe")));
                System.out.println("*******************");
                System.out.println("Chrome Driver copied to local");
            }catch (Exception e){//Catch exception if any
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("*******************");
            System.out.println("Driver already exists");
            System.setProperty("webdriver.chrome.driver", (dir +"/chromedriver.exe"));
        }
        System.out.println("*******************");
        System.out.println("Launching chrome browser");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT");
    }

    @Given("^I am on the Supplier Tab$")
    public void I_am_on_the_Supplier_Tab() throws Throwable {
        WebElement yourpostcode = driver.findElement(By.id("your-postcode"));
        assert (yourpostcode.isDisplayed());
    }

    @When("^I enter postcode$")
    public void I_enter_postcode_as(DataTable table) throws Throwable {

        // Express the Regexp above with the code you wish you had
        // Create an ArrayList
        List<ElectricityOnlyUser> users = new ArrayList<ElectricityOnlyUser>();
        // Store all the users
        users = table.asList(ElectricityOnlyUser.class);

        for (ElectricityOnlyUser user : users) {
            WebElement yourpostcode = driver.findElement(By.id("your-postcode"));
            WebElement findpostcode = driver.findElement(By.id("find-postcode"));
            if (findpostcode.isDisplayed() && yourpostcode.isDisplayed()) {
                yourpostcode.clear();
                yourpostcode.sendKeys(user.postcode);
                findpostcode.click();
            }
            WebElement changepostcode = (new WebDriverWait(driver, 30))
                    .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#change-postcode")));
            Assert.assertNotEquals("Your postcode has not been recognised", changepostcode.isDisplayed());
        }
    }

    @When("^I have my bill handy$")
    public void I_have_my_bill_handy() throws Throwable {
        action = new Actions(driver);
        WebElement billhandy_question = driver.findElement(By.cssSelector("#getStarted > fieldset:nth-child(2) > div"));
        action.moveToElement(billhandy_question).perform();
        Thread.sleep(2000);

        WebElement billhandy_yes = driver.findElement(By.id("have-bill-label"));
        action.click(billhandy_yes).perform();

    }

    @When("^I select to compare ElectricityOnly energy$")
    public void i_select_to_compare_ElectricityOnly_energy() throws Throwable {

        WebElement comparewhat_electricityonly = (new WebDriverWait(driver, 40)).until(ExpectedConditions
                .presenceOfElementLocated(By.cssSelector("#compare-electricity-label > span > span")));
        comparewhat_electricityonly.click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1450)");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @When("^I select my supplier$")
    public void i_select_my_supplier() throws Throwable {
        action = new Actions(driver);
        WebElement choosesupplier = driver.findElement(By.id("elec-energy-suppliers-question"));

        action.moveToElement(choosesupplier).perform();
        Thread.sleep(2000);

        WebElement energysupplier_eon = (new WebDriverWait(driver, 40))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
                        "#elec-energy-suppliers-question > div > div > div:nth-child(1) > label.eon.top-six.checked > span")));

        action.moveToElement(energysupplier_eon).perform();
        Thread.sleep(2000);
        action.click(energysupplier_eon).perform();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }

    @When("^I click on Next button of Supplier page$")
    public void i_click_on_Next_button_of_Supplier_page() throws Throwable {

        action = new Actions(driver);

        WebElement nextSupplierButton = (new WebDriverWait(driver, 40))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#goto-your-supplier-details")));

        nextSupplierButton.isDisplayed();
        action.moveToElement(nextSupplierButton).perform();
        Thread.sleep(2000);
        action.click(nextSupplierButton).perform();
    }

    @Then("^I see Your Energy page successfully$")
    public void i_see_Your_Energy_page_successfully() throws Throwable {
        WebElement whichelectricitytariff = driver.findElement(By.cssSelector("#electricity-tariff-additional-info"));
        assert (whichelectricitytariff.isDisplayed());
    }

    @Given("^I am on the Energy page for Electricity Only$")
    public void i_am_on_the_Energy_page_for_Electricity_Only() throws Throwable {
        i_see_Your_Energy_page_successfully();
    }

    @When("^I select electricity tariff$")
    public void i_select_electricity_tariff() throws Throwable {
        action = new Actions(driver);
        WebElement whichelectricitytariff = driver.findElement(By.cssSelector("#electricity-tariff-additional-info"));
        action.moveToElement(whichelectricitytariff).perform();
        Thread.sleep(2000);
        new Select(whichelectricitytariff).selectByValue("number:301");

    }

    @When("^I set economy7 meter as No$")
    public void i_set_economy7_meter_as_No() throws Throwable {
        action = new Actions(driver);
        WebElement economy7question = driver.findElement(By.cssSelector("#economy-7-question"));
        action.moveToElement(economy7question).perform();
        Thread.sleep(2000);
        WebElement economy7_no = driver.findElement(By.id("economy-7-no"));
        action.click(economy7_no).perform();
    }

    @When("^I select electricity payment method$")
    public void i_select_electricity_payment_method() throws Throwable {
        action = new Actions(driver);
        WebElement electricitypaymentdropdown = driver
                .findElement(By.cssSelector("#electricity-payment-method-dropdown-link"));
        action.moveToElement(electricitypaymentdropdown).perform();
        Thread.sleep(2000);
        new Select(electricitypaymentdropdown).selectByValue("number:1");
    }

    @When("^I set electricity as main source of heating as Yes$")
    public void i_set_electricity_as_main_source_of_heating_as_Yes() throws Throwable {
        action = new Actions(driver);
        WebElement electricity_main_heating_source_question = driver
                .findElement(By.cssSelector("#electricity-main-heating-source-question > div"));
        action.moveToElement(electricity_main_heating_source_question).perform();
        Thread.sleep(2000);
        WebElement electricity_main_heating_yes = driver.findElement(By.id("electricity-main-heating-yes"));
        action.click(electricity_main_heating_yes).perform();
    }

    @When("^I select current electricity usage as kWh$")
    public void i_select_current_electricity_usage_as_kWh() throws Throwable {
        action = new Actions(driver);
        WebElement electricity_usage_question = driver.findElement(By.cssSelector("#electricity-usage-question > div"));
        action.moveToElement(electricity_usage_question).perform();
        Thread.sleep(2000);
        WebElement kwhspend_elec = driver.findElement(By.id("kwhSpend"));
        action.click(kwhspend_elec).perform();
    }

    @When("^I enter value in usagefield$")
    public void i_enter_value_in_usagefield(DataTable table) throws Throwable {
        List<ElectricityOnlyUser> users = new ArrayList<ElectricityOnlyUser>();
        // Store all the users
        users = table.asList(ElectricityOnlyUser.class);

        for (ElectricityOnlyUser user : users) {
            WebElement electricity_usage = driver.findElement(By.id("electricity-usage"));
            action = new Actions(driver);
            action.moveToElement(electricity_usage).perform();
            Thread.sleep(2000);
            electricity_usage.clear();
            electricity_usage.sendKeys(user.kwhspend);
        }

    }

    @When("^I select Annually$")
    public void i_select_Annually() throws Throwable {
        action = new Actions(driver);
        WebElement electricity_usage_dropdown = driver.findElement(By.id("electricity-usage-dropdown"));
        action.moveToElement(electricity_usage_dropdown).perform();
        Thread.sleep(2000);
        new Select(electricity_usage_dropdown).selectByValue("Annually");

    }

    @When("^I click on Next button of Electricity Energy page$")
    public void i_click_on_Next_button_of_Electricity_Energy_page() throws Throwable {
        action = new Actions(driver);
        WebElement nextEnergyButton_electricity = (new WebDriverWait(driver, 40))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#goto-your-energy")));

        nextEnergyButton_electricity.isDisplayed();
        action.moveToElement(nextEnergyButton_electricity).perform();
        Thread.sleep(2000);
        action.click(nextEnergyButton_electricity).perform();
    }

    @Then("^I see Your Details page successfully$")
    public void i_see_Your_Details_page_successfully() throws Throwable {
        WebElement fixedtariff = driver.findElement(By.cssSelector("span.icon.fixed-rate-1"));
        fixedtariff.isDisplayed();
    }

    @Given("^I am on the Details Page$")
    public void i_am_on_the_Details_Page() throws Throwable {
        i_see_Your_Details_page_successfully();
    }

    @When("^I select tariff type as Fixed Tariff$")
    public void i_select_tariff_type_as_Fixed_Tariff() throws Throwable {
        action = new Actions(driver);
        WebElement fixedtariff = driver.findElement(By.cssSelector("span.icon.fixed-rate-1"));
        action.moveToElement(fixedtariff).perform();
        Thread.sleep(2000);
        action.click(fixedtariff).perform();
    }

    @When("^I select payment type as Monthly direct debit$")
    public void i_select_payment_type_as_Monthly_direct_debit() throws Throwable {
        action = new Actions(driver);
        WebElement paymentmonthly = driver.findElement(By.cssSelector("span.icon.annual-1"));
        action.moveToElement(paymentmonthly).perform();
        Thread.sleep(2000);
        action.click(paymentmonthly).perform();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1450)");

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }

    @When("^I enter my email address$")
    public void i_enter_my_email_address(DataTable table) throws Throwable {

        List<ElectricityOnlyUser> users = new ArrayList<ElectricityOnlyUser>();
        // Store all the users
        users = table.asList(ElectricityOnlyUser.class);

        for (ElectricityOnlyUser user : users) {
            WebElement emailaddress = driver.findElement(By.id("Email"));
            action = new Actions(driver);
            action.moveToElement(emailaddress).perform();
            Thread.sleep(2000);
            emailaddress.clear();
            emailaddress.sendKeys(user.emailaddress);
        }
    }

    @When("^I select to agree with marketing terms$")
    public void i_select_to_agree_with_marketing_terms() throws Throwable {
        action = new Actions(driver);
        WebElement marketing_text = driver.findElement(By.cssSelector("#marketingT"));
        action.moveToElement(marketing_text).perform();
        Thread.sleep(2000);
        WebElement marketingPreference = driver
                .findElement(By.cssSelector("#marketingT > div > div.answer.radio-ticks > label > span:nth-child(3)"));
        action.click(marketingPreference).perform();
    }

    @When("^I select to have read Terms and Conditions$")
    public void i_select_to_have_read_Terms_and_Conditions() throws Throwable {
        action = new Actions(driver);
        WebElement tnc_question = driver.findElement(By.cssSelector("#TnC > div > div.question"));
        action.moveToElement(tnc_question).perform();
        Thread.sleep(2000);
        WebElement terms = driver.findElement(By.cssSelector("#terms-label > span:nth-child(3)"));
        action.click(terms).perform();
    }

    @When("^I click Go to Prices button$")
    public void i_click_Go_to_Prices_button() throws Throwable {
        action = new Actions(driver);
        WebElement gotopricesbutton = (new WebDriverWait(driver, 40))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("email-submit")));

        gotopricesbutton.isDisplayed();
        action.moveToElement(gotopricesbutton).perform();
        Thread.sleep(2000);
        action.click(gotopricesbutton).perform();
    }

    @Then("^I should see the results loading popup$")
    public void i_should_see_the_results_loading_popup() throws Throwable {
        WebElement resultsloadingoverlay = (new WebDriverWait(driver, 40))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("interstitial-overlay")));
        resultsloadingoverlay.isDisplayed();
    }

    @Then("^I should see the results page successfully$")
    public void i_should_see_the_results_page_successfully() throws Throwable {
        WebElement resultsheader = driver
                .findElement(By.cssSelector("body > div > div > main > section.your-results-with-filters > h2"));
        assert (resultsheader.getText().equals("Your Results"));
    }

    @Then("^I should see the filters with quote results$")
    public void i_should_see_the_filters_with_quote_results() throws Throwable {
        action = new Actions(driver);
        WebElement Electricity = driver.findElement(By.cssSelector(
                "body > div > div > main > section.personal-projection.ng-scope > div > ul > li.ng-scope > div:nth-child(2)"));
        String type = Electricity.getText();
        assert (type.equals("E.ON"));

        WebElement paymentmethod = driver.findElement(By.cssSelector(
                "body > div > div > main > section.personal-projection.ng-scope > div > ul > li:nth-child(2) > div"));
        String method = paymentmethod.getText();
        assert (method.equals("Monthly direct debit"));

        WebElement resultssection = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div > div > main > section.your-results-with-filters")));
        action.moveToElement(resultssection).perform();
        Thread.sleep(2000);
        resultssection.isDisplayed();
        driver.quit();

    }

}
