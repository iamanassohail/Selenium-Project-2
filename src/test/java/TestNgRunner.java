import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features", glue = {"StepDefinitions"}, dryRun = false,
        monochrome = true)
public class TestNgRunner extends AbstractTestNGCucumberTests {

}
