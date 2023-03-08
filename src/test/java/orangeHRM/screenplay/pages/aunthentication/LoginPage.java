package orangeHRM.screenplay.pages.aunthentication;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {
    private static final String loginHeadingXpath = "//h5[contains(.,'Login')]";
    public String getLoginHeading() {
        return $(loginHeadingXpath).getText();
    }
}
