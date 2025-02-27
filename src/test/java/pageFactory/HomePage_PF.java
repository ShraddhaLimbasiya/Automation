package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
    @FindBy(id = "shopping_cart_container")
    WebElement shopping_cart;
    WebDriver driver;

    public HomePage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean shoppingCartDisplayed(){
        return shopping_cart.isDisplayed();
    }
}
