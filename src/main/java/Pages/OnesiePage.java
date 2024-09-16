package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OnesiePage {
    WebDriver driver;

    // Localizador del producto Onesie
    By onesieProduct = By.id("item_2_title_link");  // Asegúrate de usar el ID correcto para el enlace del producto Onesie.

    // Constructor
    public OnesiePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Método para hacer clic en el producto Onesie
    public void clickOnesieProduct() {
        driver.findElement(onesieProduct).click();
    }

    // Método para verificar que la página del producto Onesie se ha cargado
    public boolean isOnesiePageDisplayed() {
        return driver.getTitle().contains("Sauce Labs Onesie");
    }
}
