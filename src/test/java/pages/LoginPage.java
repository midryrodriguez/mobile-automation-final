package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By loginTabTitle = By.xpath("//android.widget.TextView[@text='Login / Sign up Form']");

    private final By emailInput = By.xpath("//android.widget.EditText[@content-desc='input-email']");
    private final By passwordInput = By.xpath("//android.widget.EditText[@content-desc='input-password']");
    private final By loginButton = By.xpath("//android.view.ViewGroup[@content-desc='button-LOGIN']");

    private final By signUpTab = By.xpath("//android.widget.TextView[@text='Sign up']");
    private final By loginTab = By.xpath("//android.widget.TextView[@text='Login']");
    private final By confirmPasswordInput = By.xpath("//android.widget.EditText[@content-desc='input-repeat-password']");
    private final By signUpButton = By.xpath("//android.view.ViewGroup[@content-desc='button-SIGN UP']");

    private final By signUpSuccessTitle = By.xpath("//android.widget.TextView[@text='Signed Up!']");
    private final By signUpSuccessMessage = By.xpath("//android.widget.TextView[@text='You successfully signed up!']");

    private final By loginSuccessTitle = By.xpath("//android.widget.TextView[@text='Success']");
    private final By loginSuccessMessage = By.xpath("//android.widget.TextView[@text='You are logged in!']");

    private final By successOkButton = By.xpath("//android.widget.Button[@text='OK']");

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

    public void enterEmail(String email) {
        type(emailInput, email);
    }

    public void enterPassword(String password) {
        type(passwordInput, password);
    }

    public void tapLoginButton() {
        click(loginButton);
    }

    public void tapLoginTab() {
        click(loginTab);
    }

    public void login(String email, String password) {
        tapLoginTab();
        enterEmail(email);
        enterPassword(password);
        tapLoginButton();
    }

    public void tapSignUpTab() {
        click(signUpTab);
    }

    public void enterSignUpEmail(String email) {
        type(emailInput, email);
    }

    public void enterSignUpPassword(String password) {
        type(passwordInput, password);
    }

    public void enterConfirmPassword(String password) {
        type(confirmPasswordInput, password);
    }

    public void tapSignUpButton() {
        click(signUpButton);
    }

    public void signUp(String email, String password) {
        tapSignUpTab();
        enterSignUpEmail(email);
        enterSignUpPassword(password);
        enterConfirmPassword(password);
        tapSignUpButton();
    }

    public boolean isSignUpSuccessTitleDisplayed() {
        return isDisplayed(signUpSuccessTitle);
    }

    public boolean isSignUpSuccessMessageDisplayed() {
        return isDisplayed(signUpSuccessMessage);
    }

    public boolean isLoginSuccessTitleDisplayed() {
        return isDisplayed(loginSuccessTitle);
    }

    public boolean isLoginSuccessMessageDisplayed() {
        return isDisplayed(loginSuccessMessage);
    }

    public void tapSuccessOkButton() {
        click(successOkButton);
    }
}