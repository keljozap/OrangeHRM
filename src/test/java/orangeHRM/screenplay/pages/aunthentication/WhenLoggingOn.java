package orangeHRM.screenplay.pages.aunthentication;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import orangeHRM.screenplay.pages.dashboard.DashboardPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static orangeHRM.screenplay.pages.aunthentication.User.ADMIN;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn{
    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    LoginActions login;

    DashboardPage dashboardPage;

    @Test
    public void userCanLogin() throws InterruptedException {

        // Login
        login.as(ADMIN);

        // Login sucessfull
        Serenity.reportThat("The dashboard page should be displayed with the correct title",
                () -> assertThat((dashboardPage.getHeading()).contains("Dashboard")));
        Serenity.reportThat("The dashboard page should be displayed with the correct title",
                () -> assertTrue((dashboardPage.getHeading()).equals("Dashboard")));
    }
}
