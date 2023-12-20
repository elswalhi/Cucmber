package Steps;

import Base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ContactStep extends Base {
    public ContactStep() throws IOException {
    }

    @And("clicks on contact")
    public void clicksOnContact() throws InterruptedException {
        driver.switchTo().frame("mainpanel");
        WebElement contacts = driver.findElement(By.xpath("//a[@href='https://classic.freecrm.com/system/index.cfm?action=contact&sub=load&edit=1']"));
        contacts.click();
    }

    @Then("Email text filed should be visible")
    public void emailTextFiledShouldBeVisible() {
        WebElement email = driver.findElement(By.cssSelector("value=\"Save\""));
        Assert.assertTrue(email.isDisplayed());
    }

    @And("Clicks on Add new contact")
    public void clicksOnAddNewContact() {
        WebElement addContactBtn = driver.findElement(By.cssSelector("[value=\"New Contacts\"]"));
        addContactBtn.click();
    }

    @And("Fill the firstname and lastname")
    public void fillTheFirstnameAndLastname() {
        WebElement fName = driver.findElement(By.name("first_name"));
        WebElement lName = driver.findElement(By.name("surname"));
        WebElement save = driver.findElement(By.cssSelector("[value=\"save\"]"));
        fName.sendKeys("Abdelrahman");
        lName.sendKeys("Elswalhi");
        save.click();
    }
    @Then("A new contact should be added")
    public void aNewContactShouldBeAdded() {
        WebElement btn = driver.findElement(By.cssSelector("[value=\"Previous\"]"));
        Assert.assertTrue(btn.isDisplayed());
    }
}
