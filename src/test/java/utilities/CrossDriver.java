package utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CrossDriver {
    private CrossDriver() {

    }

    static WebDriver driver;


    public static WebDriver getDriver(String browser) {

        browser=browser==null?ConfigReader.getProperty("browser"):browser;


        if (driver == null) {
            switch (browser){

                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }


    }

    public static void quitDriver() {
        if (driver != null) {
            driver = null;
        }
    }
    public static Select Select(WebElement x){
        Select select = new Select(x);
        return select;
    }


    public static Actions Actions() {
        Actions actions = new Actions(driver);
        return actions;
    }

    public static Faker Faker(){
        Faker faker = new Faker();
        return faker;
    }

}
