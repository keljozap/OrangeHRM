package orangeHRM.screenplay.pages.aunthentication;

import org.openqa.selenium.By;

public class LoginForm {
    public static By username = By.name("username");
    public static By password = By.name("password");
    public static By loginButtonXpath = By.xpath("//button[contains(.,'Login')]");
    public static By loginHeadingXpath = By.xpath("//h5[contains(.,'Login')]");
}
