import PageObjects.LibraryPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTest {

    @Test
    public void ShadowDOMTEST(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
    }
}
