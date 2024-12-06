package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SharedDriver;

public class Hooks {
    private final SharedDriver sharedDriver;

    public Hooks(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
    }

    @Before
    public void setUp() {
        sharedDriver.getDriver(); // Initialize WebDriver before each scenario
    }

    @After
    public void tearDown() {
        sharedDriver.quitDriver(); // Quit WebDriver after each scenario
    }
}
