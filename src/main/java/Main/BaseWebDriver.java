package Main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseWebDriver {

    public  WebDriver driver;

    public WebDriver getDriver(){
        if(driver==null){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

        }
        return driver;
    }
}
