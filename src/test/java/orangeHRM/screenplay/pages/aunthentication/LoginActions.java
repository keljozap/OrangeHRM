package orangeHRM.screenplay.pages.aunthentication;

import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matcher;

public class LoginActions extends UIInteractionSteps {
    @Step("Log in as {0} user")
    public void as(User user) throws InterruptedException {
        openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Attempt to login
        $(LoginPage.username).sendKeys(user.getUsername());
        $(LoginPage.password).sendKeys(user.getPassword());
        $(LoginPage.loginButtonXpath).click();
    }
}
