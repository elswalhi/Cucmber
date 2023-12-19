package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver;

    @Given("user should open the website")
    public void user_should_open_the_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://classic.crmpro.com");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    @When("user enter username as {string} and password as {string} and click on btn")
    public void user_enter_user_name_and_password_and_click_on_btn(String user, String pass) {
        // Write code here that turns the phrase above into concrete actions
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement btn = driver.findElement(By.className("btn"));
        username.sendKeys(user);
        password.sendKeys(pass);
        btn.click();
    }

    @Then("user should navigate to home page")
    public void user_should_navigate_to_home_page() {
        driver.switchTo().frame("mainpanel");
        boolean logo = driver.findElement(By.cssSelector(".logo_text")).isDisplayed();
        Assert.assertTrue(logo);
        driver.quit();
    }

    @Then("Error message should be appear")
    public void Error_message_should_be_appear() {
        System.out.println("error message");
    }
}
