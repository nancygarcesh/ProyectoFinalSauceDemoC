package StepDefinitions;

import Pages.OnesiePage;
import Utilities.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;

public class OnesieSteps {
    WebDriver driver;
    OnesiePage onesiePage;

    public OnesieSteps() {
        this.driver = DriverManager.getDriver().driver;
        PageFactory.initElements(driver, this);
        onesiePage = new OnesiePage(driver);
    }

    @When("I click on the Onesie Product")
    public void iClickOnTheOnesieProduct() {
        onesiePage.clickOnesieProduct();
    }

    @Then("The Onesie product page should be displayed")
    public void isOnesiePageDisplayed() {
        String expectedURL = "https://www.saucedemo.com/inventory-item.html?id=2";
        String actualTitle = driver.getCurrentUrl();
        Assert.assertEquals("La página no está desplegada", expectedURL, actualTitle);
    }
}
