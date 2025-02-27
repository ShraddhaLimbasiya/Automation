package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;
    private By txt_username = By.id("user-name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("login-button");
    private By btn_logout = By.id("shopping_cart_container");

    public loginPage(WebDriver driver){
        this.driver = driver;
        if(!driver.getTitle().equals("TestProject Demo")){
            throw new IllegalStateException("This is not login page. the current page is "+
                    driver.getCurrentUrl());
        }
    }
    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btn_login).click();
    }
    public boolean checkLogoutIsDisplayed(){
        return driver.findElement(btn_login).isDisplayed();
    }
    public void loginValidUser(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();

    }

}
