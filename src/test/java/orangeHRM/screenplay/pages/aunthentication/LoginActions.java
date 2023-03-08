package orangeHRM.screenplay.pages.aunthentication;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractionSteps {
    @Step("Log in as {0} user")
    public void as(User user) {
        openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Attempt to login
        $(LoginForm.USER_NAME).sendKeys(user.getUsername());
        $(LoginForm.PASSWORD).sendKeys(user.getPassword());
        $(LoginForm.LOGIN_BUTTON).click();
    }
}
