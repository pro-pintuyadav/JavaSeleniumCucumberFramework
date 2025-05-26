
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(plugin = "message:target/cucumber-report.ndjson"
        , features = "src/test/java/Features"
        , glue = "StepsDefinitions"
        , tags = "@smoke"
        , monochrome = true
        , publish = true
        , dryRun = false
        , snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
