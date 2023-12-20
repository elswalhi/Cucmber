package Steps;

import Base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

import java.io.IOException;

public class LoginSteps extends Base {
    LoginPage login = new LoginPage();

    public LoginSteps() throws IOException {
    }

    @Given("user should open the website")
    public void user_should_open_the_website() throws IOException {
        init();
    }
    @When("user enter username as {string} and password as {string} and click on btn")
    public void user_enter_user_name_and_password_and_click_on_btn(String user, String pass) {
        login = new LoginPage();
        login.username.sendKeys(user);
        login.password.sendKeys(pass);
        login.btn.click();
        // Write code here that turns the phrase above into concrete actions


    }

    @Then("user should navigate to home page")
    public void user_should_navigate_to_home_page() {
        login = new LoginPage();
        driver.switchTo().frame("mainpanel");
        Assert.assertTrue(login.logo.isDisplayed());
        driver.quit();
    }

    @Then("Error message should be appear")
    public void Error_message_should_be_appear() {
//        Assert.assertTrue(username.isDisplayed());
    }
}
