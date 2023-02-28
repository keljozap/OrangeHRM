package orangeHRM.screenplay.pages.dashboard;

import net.serenitybdd.core.pages.PageObject;

public class DashboardPage extends PageObject {
    public String getHeading() {
        return $("//h6[contains(.,'Dashboard')]").getText();
    }
}
