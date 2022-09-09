package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
 public static WebDriver driver;

    public static WebDriver getDriver() {
        if (Info.browser.equals("chrom")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (Info.browser.equals("EDGE")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

   return driver;
    }
}
