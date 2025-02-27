package pageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage_PF {
    @FindBy(id = "user-name")
    WebElement txt_username;
    @FindBy(id = "password")
    WebElement txt_password;

    @FindBy(id ="login-button")
    WebElement loginButton;


    /*@FindBy(partialLinkText = "raghav")
    List<WebElement> myLinks;
    @FindBy(how = How.ID, using = "name")
    WebElement abc;*/

    WebDriver driver;
    public LoginPage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void enterUsername(String username){
        txt_username.sendKeys(username);
    }
    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }
    public void clickLogin(){
        loginButton.click();


    }


}
