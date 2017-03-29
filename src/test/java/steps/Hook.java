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

        public Hook(BaseUtil base) {
            this.base = base;
        }

        @cucumber.api.java.Before
        public void InitializeTest() {

            System.out.println("Opening the browser : MOCK");

            //Passing a dummy WebDriver instance step info
            base.StepInfo = "ChromeDriver";
        }


        @cucumber.api.java.After
        public void TearDownTest(Scenario scenario) {
            if (scenario.isFailed()) {
                //Take screenshot logic goes here
                System.out.println(scenario.getStatus());
            }
            System.out.println("Closing the browser : MOCK");
        }

    }
