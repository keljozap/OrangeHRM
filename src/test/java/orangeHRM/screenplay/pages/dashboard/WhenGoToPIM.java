package orangeHRM.screenplay.pages.dashboard;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import orangeHRM.screenplay.pages.EmployeesModule.EmployeeForm;
import orangeHRM.screenplay.pages.EmployeesModule.EmployeePage;
import orangeHRM.screenplay.pages.aunthentication.LoginActions;
import orangeHRM.screenplay.pages.aunthentication.User;
import orangeHRM.screenplay.pages.aunthentication.WhenLoggingOn;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

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

    DashboardPage dPAge;
    EmployeePage ePage;

    @Before
    public void login(){
        login.as(ADMIN);
        Serenity.reportThat("The dashboard page should be displayed with the correct title",
                () -> assertThat((dPAge.getHeading()).contains("Dashboard")));
    }

    @Test
    public void goToPIMModule(){

        // Go to PIM Module
        dashboardActions.goToPIMModule();

        Serenity.reportThat("The Employee module tab is visible",
                () -> assertThat(ePage.$(EmployeeForm.employeeModuleTitle).isCurrentlyVisible()));
    }
}
