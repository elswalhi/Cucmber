package pages;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(className = "btn")
    public WebElement btn;
    @FindBy(css = ".logo_text")
    public WebElement logo;





}


//    boolean logo = driver.findElement(By.cssSelector(".logo_text")).isDisplayed();


