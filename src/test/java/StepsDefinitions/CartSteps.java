package StepsDefinitions;

import Pages.CartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartSteps extends BaseSetps {

        CartPage cartPage;
        public CartSteps() {
           cartPage = new CartPage(driver);
        }


    @Given("I am on the cart page")
    public void iAmOnTheCartPage() {
            cartPage.openCartPage();
    }
    @When("I view the items in the cart")
    public void iViewTheItemsInTheCart() {
            Assert.assertEquals(cartPage.getProductName(), "Anchor Bracelet");
       //cartPage.getProductName();
    }
    @Then("I should see the correct items listed")
    public void iShouldSeeTheCorrectItemsListed() {
            Assert.assertEquals(cartPage.getProductQuantity(), 1);
       //cartPage.getProductQuantity();
    }

}
