package orangeHRM.screenplay.pages.logout;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import orangeHRM.screenplay.pages.aunthentication.LoginActions;
import orangeHRM.screenplay.pages.aunthentication.LoginForm;
import orangeHRM.screenplay.pages.aunthentication.LoginPage;
import orangeHRM.screenplay.pages.dashboard.DashboardPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static orangeHRM.screenplay.pages.aunthentication.User.ADMIN;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class WhenLoggingOut {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    LoginActions login;
    @Steps
    LogoutActions logout;
    DashboardPage dashboardPage;
    LoginPage loginPage;

    @Test
    public void userCanLogout(){

        // Login
        login.as(ADMIN);

        // Verify the successful login
        Serenity.reportThat("The dashboard page should be displayed with the correct title",
                () -> assertTrue((dashboardPage.getHeading()).equals("Dashboard")));

        // Proceed with the logout
        logout.ofTheSystem();

        // Verify the login page
        Serenity.reportThat("The login page should be displayed with the correct title",
                () -> assertTrue((loginPage.textOf(LoginForm.LOGIN_HEADING).equals("Login"))));
    }

}
