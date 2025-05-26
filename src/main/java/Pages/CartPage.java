package Pages;

import Constants.EndPoint;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//a[text()='Anchor Bracelet']")
    private WebElement productNAmeField;

    @FindBy(xpath = "//input[starts-with(@id,'quantity')]")
    private WebElement productQuantityField;

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void openCartPage() {
        load(EndPoint.CART.path);
        waitForPageToLoad();
    }

    public String getProductName() {
        return productNAmeField.getText();
    }

    public int getProductQuantity() {
        String quantityText = productQuantityField.getDomProperty("value");
        return quantityText.isEmpty() ? 0 : Integer.parseInt(quantityText);
    }
}
