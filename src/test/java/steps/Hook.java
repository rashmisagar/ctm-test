package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by RSen on 27/03/2017.
 */
public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook() {
    }

    public Hook(BaseUtil base) {
        this();
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println("Opening the browser : Chrome");
        //Passing a dummy Webdriver Instance
        //base.StepInfo = "FirefoxDriver";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSen\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void TearDownTest(Scenario scenario){
        if(scenario.isFailed()){
            //Take Screenshot
            System.out.println(scenario.getStatus());
        }

        System.out.println("Closing the browser : MOCK");
    }

}
