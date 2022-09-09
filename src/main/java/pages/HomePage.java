package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    @FindBy(css = "li[class='nav-item dropdown']>a") private WebElement desktop;
    public MacProductPAge getMac(){
        Select select = new Select(desktop);

    }
}
