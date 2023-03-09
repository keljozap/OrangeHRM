package orangeHRM.screenplay.pages.EmployeesModule;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class EmployeeActions extends UIInteractionSteps {

    @Step("You can see all employees listed")
    public void seeAllEmployeesListed(){
        $(EmployeeForm.SearchButtonXpath).click();
    }
}
