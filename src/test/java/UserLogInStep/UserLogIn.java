package UserLogInStep;

import Pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class UserLogIn {
    private WebDriver driver;
    private BasePage basePage;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://demo-bank.vercel.app/");
        Thread.sleep(2000);
        basePage = new BasePage(driver);

    }

    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() throws InterruptedException {
        basePage.enterIdentifier();
        Thread.sleep(2000);

        basePage.enterPassword();
        Thread.sleep(2000);
    }

    @And("clicks the login button")
    public void clicksTheLoginButton() throws InterruptedException {
        basePage.clickLoginBtn();
        Thread.sleep(2000);
    }

    @Then("the user's name should be displayed on the account dashboard")
    public void theUserSNameShouldBeDisplayedOnTheAccountDashboard() throws InterruptedException {
        basePage.assertForUsersDetails();
        Thread.sleep(2000);
    }
}
