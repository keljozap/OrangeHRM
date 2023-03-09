package orangeHRM.screenplay.pages.EmployeesModule;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EmployeePage extends PageObject {
    public static By employeeModuleTitleXpath = By.xpath("//a[contains(.,'Employee List')]");
    public static By employeeTableListXpath = By.xpath("//div[contains(@class,'orangehrm-container')]");
    public static final By SearchButtonXpath = By.xpath("//button[contains(.,'Search')]");
    public static final By addButtonXpath = By.xpath("//button[contains(.,'Add')]");
}
