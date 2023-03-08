package orangeHRM.screenplay.pages.logout;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import orangeHRM.screenplay.pages.aunthentication.User;

public class LogoutActions extends UIInteractionSteps {
    @Step("Logout of the system")
    public void ofTheSystem() {
        $("//*[contains(@class, 'oxd-userdropdown-tab')]").click();
        $("//*[contains(text(), 'Logout')]").click();
    }
}
