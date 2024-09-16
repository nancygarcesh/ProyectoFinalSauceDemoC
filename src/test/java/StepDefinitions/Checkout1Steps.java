package StepDefinitions;

import Pages.Checkout1Page;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout1Steps {
    WebDriver driver;
    Checkout1Page checkout1Page;

    By checkoutButton = By.xpath("//*[@id=\"checkout\"]");

    public Checkout1Steps() {
        this.driver = DriverManager.getDriver().driver;
        checkout1Page = new Checkout1Page(driver);
    }
    @When("I click on the checkout button")
    public void iClickOnTheCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }

    @When("I fill in the checkout fields with last name {string} and postal code {string}")
    public void iFillInTheCheckoutFieldsWithLastNameAndPostalCode(String lastName, String postalCode) {
        checkout1Page.fillCheckoutFields(lastName, postalCode);
    }

    @And("I click on the continue button")
    public void iClickOnTheContinueButton() {
        checkout1Page.clickContinueButton();
    }

    @Then("I should see an error message for missing first name")
    public void iShouldSeeAnErrorMessageForMissingFirstName() {
        Assert.assertTrue("No se encontró el mensaje de error esperado", checkout1Page.isErrorMessageDisplayed());
        Assert.assertTrue("El mensaje de error no es el esperado",
                checkout1Page.getErrorMessageText().contains("Error: First Name is required"));
    }
}
