/*
package StepDefinations;

import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class LoginDemoSteps_POM {
    WebDriver driver = null;
    loginPage login;

    @Given("browser is open")
    public void browserIsOpen() {
        System.out.println(" === I am inside Browser_is_open === ");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://www.saucedemo.com/");

    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) throws InterruptedException {
        login = new loginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }

    @And("user click on login")
    public void userClickOnLogin() {
        login.clickLogin();
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() throws InterruptedException{
        assertTrue(login.checkLogoutIsDisplayed());
        Thread.sleep(2000);
        driver.close();

    }
}
*/
