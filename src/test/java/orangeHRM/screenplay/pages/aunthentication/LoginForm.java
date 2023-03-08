package orangeHRM.screenplay.pages.aunthentication;

import org.openqa.selenium.By;

public class LoginForm {
    public static By USER_NAME = By.name("username");
    public static By PASSWORD = By.name("password");
    public static By LOGIN_BUTTON = By.xpath("//button[contains(.,'Login')]");
    public static By LOGIN_HEADING = By.xpath("//h5[contains(.,'Login')]");
}
