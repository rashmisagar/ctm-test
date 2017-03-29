package pages;

import com.selenium.test.webtestsbase.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Created by RSen on 27/03/2017.
 */
public class EnergyElectricityPage extends BasePage  {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;


    //electricity tariff method
    @FindBy(css = "#electricity-tariff-additional-info")
    private WebElement whichelectricitytariff;

    private final String tariffMonthlyPaper = "number:301";

    //economy 7 meter yes/no
    @FindBy(id = "find-postcode")
    @CacheLookup
    private WebElement findPostcode;

    //electricity payment method
    @FindBy(id = "change-postcode")
    private WebElement changePostcode;

    //electricity main source yes/no
    @FindBy(id = "have-bill-label")
    @CacheLookup
    private List<WebElement> yesIHaveMyBillo;

    //electricity usage kwh/pound
    @FindBy(id = "have-bill-label")
    @CacheLookup
    private List<WebElement> yesIHaveMyBill;

    public EnergyElectricityPage(){
        super(true);
    }

    public EnergyElectricityPage(boolean openPageByUrl) {
        super(openPageByUrl);
    }

    @Override
    protected void openPage() {
        //do nothing
    }

    //@Override
    public boolean isPageOpened() {
        try {
           return true;
        } catch (NoSuchElementException e){
            return false;
        }
    }

    public boolean showPage() {
        return whichelectricitytariff.isDisplayed();
    }

}
