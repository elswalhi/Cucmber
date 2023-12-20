package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public Base() {
        try {
            File file = new File("src/test/java/properties/config.properties");
            FileInputStream fis = new FileInputStream(file);
            props.load(fis);
        }
        catch (Error error){
            throw new Error("not valid file");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
  public  static  WebDriver driver;
 public static Properties props = new Properties();
  public static void init()  {
      if(props.getProperty("browser").equalsIgnoreCase("chrome")){
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();

      } else if (props.getProperty("browser").equalsIgnoreCase("firefox")) {
          WebDriverManager.firefoxdriver().setup();
          driver = new FirefoxDriver();

      }


      String  url= props.getProperty("url");
      System.out.println(url);
      driver.manage().window().maximize();
//      driver.manage().timeouts().pageLoadTimeout(60000);
      driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
      driver.get(url);





  }

}
