package StepsDefinitions;

import Pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreSteps extends BaseSetps {

    StorePage storePage;
    // Constructor
    public StoreSteps() {
        this.storePage = new StorePage(driver);
    }
    // Example step definition
    @Given("I am on the store page")
    public void iAmOnTheStorePage() {
       storePage.openStorePage();
    }

    @When("I add an item to the cart")
    public void iAddAnItemToTheCart() {
        storePage.addToCart();
    }

    @Then("I should see the item in the cart")
    public void iShouldSeeTheItemInTheCart() {
        storePage.clickViewCartLink();
    }
}
