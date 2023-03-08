package orangeHRM.screenplay.pages.dashboard;

import net.serenitybdd.core.pages.PageObject;

public class DashboardPage extends PageObject {
    private static final String dashboardHeadingXpath = "//h6[contains(.,'Dashboard')]";
    public String getHeading() {
        return $(dashboardHeadingXpath).getText();
    }
}
