package Pages;

import Constants.EndPoint;
import Utils.ConfigLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage {


    public StorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//a[@title='View your shopping cart'])[1]")
    private WebElement viewCartLink;

    public void openStorePage() {
        load(EndPoint.STORE.path);
        waitForPageToLoad();
    }
    public void clickViewCartLink() {
        wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();
    }

    public void addToCart() {
        By addToCartBtn=By.xpath("//a[@aria-label='Add “Anchor Bracelet” to your cart']");
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
    }

   }
