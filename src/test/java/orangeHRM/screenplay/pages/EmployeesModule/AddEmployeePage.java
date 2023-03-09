package orangeHRM.screenplay.pages.EmployeesModule;

import org.openqa.selenium.By;

public class AddEmployeePage {
    public static By addEmployeeTitleXpath = By.xpath("//div[@class='orangehrm-card-container']/*[contains(.,'Add Employee')]");
    public static By saveButtonXpath = By.xpath("//div[@class='orangehrm-card-container']//button[contains(.,'Save')]");
    public static By firstNameField = By.name("firstName");
    public static By lastNameField = By.name("lastName");
    public static By middleNameField = By.name("middleName");
    public static By addUserCheckboxXpath = By.xpath("//div[@class='oxd-switch-wrapper']//input[@type='checkbox']");
}
