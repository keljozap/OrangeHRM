package orangeHRM.screenplay.pages.dashboard;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {
    public static final String dashboardHeadingXpath = "//h6[contains(.,'Dashboard')]";
    public static final By pimModuleXpath = By.xpath("//span[contains(., 'PIM')]");
    public String getHeading() {
        return $(dashboardHeadingXpath).getText();
    }
}
