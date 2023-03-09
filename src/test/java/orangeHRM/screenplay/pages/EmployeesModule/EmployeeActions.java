package orangeHRM.screenplay.pages.EmployeesModule;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class EmployeeActions extends UIInteractionSteps {

    @Step("You can see all employees listed")
    public void seeAllEmployeesListed(){
        $(EmployeePage.SearchButtonXpath).click();
    }

    @Step("Click on Add Employee Button")
    public void addAnEmployee(Employee employee){
        $(EmployeePage.addButtonXpath).click();
        $(AddEmployeePage.firstNameField).click();
        $(AddEmployeePage.firstNameField).sendKeys(employee.getFirstName());
        $(AddEmployeePage.lastNameField).click();
        $(AddEmployeePage.lastNameField).sendKeys(employee.getLastName());
        $(AddEmployeePage.middleNameField).click();
        $(AddEmployeePage.middleNameField).sendKeys(employee.getMiddleName());

        if(employee.isCreateLoginDetails()){
            if(!$(AddEmployeePage.addUserCheckboxXpath).isSelected()){
                $(AddEmployeePage.addUserCheckboxXpath).click();
            }
        }else{
            if($(AddEmployeePage.addUserCheckboxXpath).isSelected()){
                $(AddEmployeePage.addUserCheckboxXpath).click();
            }
        }
        $(AddEmployeePage.saveButtonXpath).click();
    }
}
