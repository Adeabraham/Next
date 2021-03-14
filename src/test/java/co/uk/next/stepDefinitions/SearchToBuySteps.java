package co.uk.next.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchToBuySteps {

    WebDriver driver;
    @Given("I navigate to Next homepage")
    public void i_navigate_to_next_homepage() {
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.navigate().to("https://www.next.co.uk");


    }

    @When("I enter {string} into the search field")
    public void i_enter_into_the_search_field(String string) {
      driver.findElement(By.id("sli_search_1")).sendKeys(string);
    }

    @When("I click on search button")
    public void i_click_on_search_button() {

    }

    @Then("the search for {string} is displayed")
    public void the_search_for_is_displayed(String string) {

    }

}
