package orangeHRM.screenplay.pages.EmployeesModule;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EmployeePersonalDetailsPage extends PageObject {
    public static By personalDetailsTitleXpath = By.xpath("//a[contains(.,'Personal Details')]");
    public static By personalDetailsFirstName = By.name("firstName");
}
