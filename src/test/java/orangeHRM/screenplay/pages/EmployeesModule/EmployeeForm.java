package orangeHRM.screenplay.pages.EmployeesModule;


import org.openqa.selenium.By;

public class EmployeeForm {

    public static By employeeModuleTitleXpath = By.xpath("//a[contains(.,'Employee List')]");
    public static By employeeTableListXpath = By.xpath("//div[contains(@class,'orangehrm-container')]");
    public static final By SearchButtonXpath = By.xpath("//button[contains(.,'Search')]");
}
