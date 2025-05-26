package StepsDefinitions;

import Pages.StorePage;
import com.prevails.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDefi extends BaseSetps {

    WebDriver driver;
    StorePage storePage;
    public LoginDefi() {
        this.driver = super.driver;
        this.storePage = new StorePage(driver);
    }
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        // For example, open the login page in the browser
        System.out.println("Navigating to login page");
        //driver.get("https://example.com/login");
        storePage.openStorePage();
    }
    @When("I enter my username and password")
    public void i_enter_my_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        // For example, fill in the username and password fields and submit the form
        System.out.println("Entering username and password");
        // driver.findElement(By.id("username")).sendKeys("myUsername");
        // driver.findElement(By.id("password")).sendKeys("myPassword");
        // driver.findElement(By.id("loginButton")).click();
    }
    @Then("I should be redirected to the home page")
    public void i_should_be_redirected_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        // For example, check if the current URL is the home page URL
        System.out.println("Checking if redirected to home page");
        // String currentUrl = driver.getCurrentUrl();
        // assertEquals(currentUrl, "https://example.com/home");
    }
    @Then("I should see a welcome message")
    public void i_should_see_a_welcome_message() {
        // Write code here that turns the phrase above into concrete actions
        // For example, check if a welcome message is displayed on the home page
        System.out.println("Checking for welcome message");
        // WebElement welcomeMessage = driver.findElement(By.id("welcomeMessage"));
        // assertTrue(welcomeMessage.isDisplayed());
    }

}
