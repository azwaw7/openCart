import Browser.Browser;
import Browser.Info;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBas {
    WebDriver driver = Browser.driver;
    @BeforeMethod
    public void setup(){
        driver.navigate().to(Info.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

}
