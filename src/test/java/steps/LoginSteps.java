package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import utils.SharedDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps{
    private final SharedDriver sharedDriver;

    public LoginSteps(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
    }
    WebDriver driver;
    Select filterDropDown;
    Actions sideMenuBtn;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = sharedDriver.getDriver();
        driver.get("https://www.saucedemo.com/v1/");
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should see the dashboard")
    public void i_should_see_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        String title = driver.getTitle();
        assert title.contains("Swag Labs");

    }

    @Then("I should go to Sorting the product By Name Z-A")
    public void i_should_go_to_filter_the_product() throws InterruptedException {
        filterDropDown = new Select(driver.findElement(By.className("product_sort_container")));
        filterDropDown.selectByVisibleText("Name (Z to A)");
    }
    @Then("I should see navigate")
    public void i_should_see_navigate() {
        /*
 Write code here that turns the phrase above into concrete actions
        sideMenuBtn = (Actions) driver.findElement(By.className("bm-burger-button"));
        sideMenuBtn.click();
*/
        WebElement sideMenuBtn = driver.findElement(By.className("bm-burger-button"));
        sideMenuBtn.click();

    }
    @Then("I should logout")
    public void i_should_logout() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoutLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));

        // Click logout
        logoutLink.click();
        driver.close();
    }


    @Then("I should go to sorting the product By Name A-Z")
    public void iShouldGoToSortingTheProductByNameAZ() {
        filterDropDown = new Select(driver.findElement(By.className("product_sort_container")));
        filterDropDown.selectByVisibleText("Name (A to Z)");
    }

    @Then("I should go to Sorting the product By Name low to high")
    public void iShouldGoToSortingTheProductByNameLowToHigh() {
        filterDropDown = new Select(driver.findElement(By.className("product_sort_container")));
        filterDropDown.selectByVisibleText("Price (low to high)");
    }

    @Then("I should go to Sorting the product By Name high to low")
    public void iShouldGoToSortingTheProductByNameHighToLow() {
        filterDropDown = new Select(driver.findElement(By.className("product_sort_container")));
        filterDropDown.selectByVisibleText("Price (high to low)");
    }

    @When("I enter In-Correct Username and Correct Password")
    public void iEnterInCorrectUsernameAndCorrectPassword() {
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("I enter Correct Username and In-Correct Password")
    public void iEnterCorrectUsernameAndInCorrectPassword() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauc");
        driver.findElement(By.id("login-button")).click();
    }

    @When("I enter In-Correct Username and In-Correct Password")
    public void iEnterInCorrectUsernameAndInCorrectPassword() {
        driver.findElement(By.id("user-name")).sendKeys("standard_use");
        driver.findElement(By.id("password")).sendKeys("secret_sauc");
        driver.findElement(By.id("login-button")).click();
    }

    @Then("select the Product")
    public void selectTheProduct() {
        WebElement selectProduct = driver.findElement(By.id("item_0_title_link"));
        selectProduct.click();
    }


}
