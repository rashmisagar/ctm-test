package runner;

/**
 * Created by RSen on 28/03/2017.
 */
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
        features = "src/test/java/Features"
        ,format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"}
        ,glue={"steps"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
