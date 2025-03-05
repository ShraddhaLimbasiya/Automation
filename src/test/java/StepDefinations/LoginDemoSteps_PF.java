package StepDefinations;

import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class LoginDemoSteps_PF {

    WebDriver driver = null;
    LoginPage_PF login;

    HomePage_PF home;

    @Given("browser is open")
    public void browserIsOpen() {
        System.out.println(" === I am inside Browser_is_open === ");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        system.out.println("This is Demo for Rebase");
    }

    @And("user is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://www.saucedemo.com/");
        System.out.println("User is on logon page");

    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) throws InterruptedException {
        login = new LoginPage_PF(driver);
        home = new HomePage_PF(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }

    @And("user click on login")
    public void userClickOnLogin() {
        login.clickLogin();
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() throws InterruptedException {
        home = new HomePage_PF(driver);
        assertTrue(home.shoppingCartDisplayed());
        Thread.sleep(2000);
        driver.close();

    }


}
