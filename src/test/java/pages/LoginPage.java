package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By loginTabTitle = By.xpath("//android.widget.TextView[@text='Login / Sign up Form']");
    private final By emailInput = By.xpath("//android.widget.EditText[@content-desc='input-email']");
    private final By passwordInput = By.xpath("//android.widget.EditText[@content-desc='input-password']");
    private final By loginButton = By.xpath("//android.view.ViewGroup[@content-desc='button-LOGIN']");

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public boolean isLoginTabTitleDisplayed() {
        return isDisplayed(loginTabTitle);
    }

    public boolean isEmailInputDisplayed() {
        return isDisplayed(emailInput);
    }

    public boolean isPasswordInputDisplayed() {
        return isDisplayed(passwordInput);
    }

    public boolean isLoginButtonDisplayed() {
        return isDisplayed(loginButton);
    }
}