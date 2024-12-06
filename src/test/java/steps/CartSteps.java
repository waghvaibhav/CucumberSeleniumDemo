package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SharedDriver;

import java.time.Duration;

public class CartSteps{

    private final SharedDriver sharedDriver;

    public CartSteps(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
    }
    WebDriver driver;

    @Then("Add To Cart")
    public void addToCart() {
        driver = sharedDriver.getDriver();
        WebElement AddToCart = driver.findElement(By.cssSelector(".btn_primary.btn_inventory"));
        AddToCart.click();

    }

    @Then("go to Shopping Cart")
    public void goToShoppingCart() {
        driver.findElement(By.id("shopping_cart_container")).click();

    }

    @Then("click Checkout button")
    public void clickCheckoutButton() {
        driver.findElement(By.cssSelector(".btn_action.checkout_button")).click();
    }

    @Then("Enter Checkout Details")
    public void enterCheckoutDetails() {
        driver.findElement(By.id("first-name")).sendKeys("Vithika");

        driver.findElement(By.id("last-name")).sendKeys("patel");
        driver.findElement(By.id("postal-code")).sendKeys("310091");

        WebElement btn = driver.findElement(By.cssSelector(".btn_primary.cart_button"));
        btn.click();
        WebElement btn1 = driver.findElement(By.cssSelector(".btn_action.cart_button"));
        btn1.click();
        driver.close();


    }
}

