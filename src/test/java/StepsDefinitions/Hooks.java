package StepsDefinitions;

import com.prevails.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private WebDriver driver;
    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("Before Scenario");
        System.out.println("BEFORE THREAD ID:"+Thread.currentThread().getId()+"SCENARIO NAME:"+scenario.getName());
        driver = DriverFactory.initializeDriver( System.getProperty("browser", "chrome"));
    }

    @After
    public  void afterScenario(Scenario scenario) {
        System.out.println("After Scenario");
        System.out.println("AFTER THREAD ID:"+Thread.currentThread().getId()+"SCENARIO NAME:"+scenario.getName());
        if(driver != null) {
            driver.quit();
        }
        System.out.println("Driver closed");
    }

}
