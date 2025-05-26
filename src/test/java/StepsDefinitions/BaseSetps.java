package StepsDefinitions;

import com.prevails.DriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseSetps {
    // This class can be used to define common methods or properties for all step definitions
    // For example, you can define a WebDriver instance here if needed
    // Or any other common setup/teardown logic that applies to all step definitions

    // Example:
     protected WebDriver driver;

     public BaseSetps() {
         this.driver = DriverFactory.getDriver("chrome");
     }
}
