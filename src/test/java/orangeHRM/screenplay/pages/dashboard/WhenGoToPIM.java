package orangeHRM.screenplay.pages.dashboard;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import orangeHRM.screenplay.pages.EmployeesModule.EmployeeActions;
import orangeHRM.screenplay.pages.EmployeesModule.EmployeePage;
import orangeHRM.screenplay.pages.EmployeesModule.EmployeePersonalDetailsPage;
import orangeHRM.screenplay.pages.aunthentication.LoginActions;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static orangeHRM.screenplay.pages.EmployeesModule.Employee.SANDRA;
import static orangeHRM.screenplay.pages.EmployeesModule.EmployeePage.*;
import static orangeHRM.screenplay.pages.EmployeesModule.EmployeePersonalDetailsPage.personalDetailsFirstName;
import static orangeHRM.screenplay.pages.EmployeesModule.EmployeePersonalDetailsPage.personalDetailsTitleXpath;
import static orangeHRM.screenplay.pages.aunthentication.User.ADMIN;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class WhenGoToPIM {
    @Managed(driver = "chrome")
    WebDriver driver;
    @Steps
    LoginActions login;
    @Steps
    DashboardActions dashboardActions;
    @Steps
    EmployeeActions employeeActions;

    EmployeePage employeePage;
    EmployeePersonalDetailsPage employeePersonalDetailsPage;

    @Before
    public void goToEmployeesModule() throws InterruptedException {
        login.as(ADMIN);
        // Go to PIM Module
        dashboardActions.goToPIMModule();
        Serenity.reportThat("The Employee module tab is visible",
                () -> assertThat(employeePage.$(employeeModuleTitleXpath).isCurrentlyVisible()));
    }

    @Test
    public void seeAllEmployees(){
        employeeActions.seeAllEmployeesListed();

        Serenity.reportThat("All the employees are listed on employees table",
                () -> assertThat(employeePage.$(employeeTableListXpath).isCurrentlyVisible()));
    }

    @Test
    public void addAnEmployeeWithoutLoginDetails(){
        employeeActions.addAnEmployee(SANDRA);
        Serenity.reportThat("The employee was correctly created",
                () -> Assertions.assertThat(employeePage.$(employeeModuleTitleXpath).isCurrentlyVisible()));

        assertThat(employeePersonalDetailsPage.$(personalDetailsTitleXpath).isCurrentlyVisible());
        assertThat(employeePersonalDetailsPage.$(personalDetailsFirstName).getText().equals(SANDRA.getFirstName()));
    }
}
