package orangeHRM.screenplay.pages.dashboard;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class DashboardActions extends UIInteractionSteps {

    @Step("Click on PIM Module")
    public void goToPIMModule(){
        $(DashboardForm.pimModule).click();
    }
}
