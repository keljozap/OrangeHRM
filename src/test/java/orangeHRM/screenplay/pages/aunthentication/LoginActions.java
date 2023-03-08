package orangeHRM.screenplay.pages.aunthentication;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractionSteps {
    @Step("Log in as {0} user")
    public void as(User user) {
        openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        $("[name=username]").sendKeys(user.getUsername());
        $("[name=password]").sendKeys(user.getPassword());
        $("//button[contains(.,'Login')]").click();
    }
}
