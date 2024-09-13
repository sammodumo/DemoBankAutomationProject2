package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver webDriver){
        driver = webDriver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"login_id\"]")
    private WebElement identifier;

    @FindBy(xpath = "//*[@id=\"login_password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"login-btn\"]")
    private WebElement logInButton;

    @FindBy(xpath = "//*[@id="user_name"]/font/font")
    private WebElement usersName;

    //Methods

    public void enterIdentifier(){
        identifier.sendKeys("ModiseQA");
    }

    public void enterPassword(){
        password.sendKeys("24689999");
    }

    public void clickLoginBtn(){
        logInButton.click();
    }

    public void assertForUsersDetails() {

        String expectedDetails = "Jan Demobankowy";

        String actualDetails = usersName.getText().trim();

        Assert.assertTrue("Product details do not match", actualDetails.contains(expectedDetails));
    }
}
