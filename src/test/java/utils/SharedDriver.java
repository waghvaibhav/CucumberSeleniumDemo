package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedDriver {
    private WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) { // Create the WebDriver instance only once
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vithika Patel\\IdeaProjects\\CucumberSeleniumDemo\\src\\test\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Reset driver to null after quitting
        }
    }
}
