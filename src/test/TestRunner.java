import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeatureFilesFrontEnd/DemoQA.feature",
        glue = "StepsDefinition"
        //tags = "@RegressionTestsBAP"
)
public class TestRunner {

}