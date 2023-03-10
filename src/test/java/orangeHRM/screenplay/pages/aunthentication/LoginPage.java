package orangeHRM.screenplay.pages.aunthentication;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends PageObject {
    public static By username = By.name("username");
    public static By password = By.name("password");
    public static By loginButtonXpath = By.xpath("//button[contains(.,'Login')]");
    public static By loginHeadingXpath = By.xpath("//h5[contains(.,'Login')]");

}
