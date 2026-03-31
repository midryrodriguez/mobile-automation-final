package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class NavigationBar extends BasePage {

    private final By homeTab = AppiumBy.accessibilityId("Home");
    private final By webviewTab = AppiumBy.accessibilityId("Webview");
    private final By loginTab = AppiumBy.accessibilityId("Login");
    private final By formsTab = AppiumBy.accessibilityId("Forms");
    private final By swipeTab = AppiumBy.accessibilityId("Swipe");
    private final By dragTab = AppiumBy.accessibilityId("Drag");

    public NavigationBar(AndroidDriver driver) {
        super(driver);
    }

    public void goToHome() {
        click(homeTab);
    }

    public void goToWebview() {
        click(webviewTab);
    }

    public void goToLogin() {
        click(loginTab);
    }

    public void goToForms() {
        click(formsTab);
    }

    public void goToSwipe() {
        click(swipeTab);
    }

    public void goToDrag() {
        click(dragTab);
    }

    public boolean isWebviewTabDisplayed() {
        return isDisplayed(webviewTab);
    }

    public boolean isFormsTabDisplayed() {
        return isDisplayed(formsTab);
    }

    public boolean isDragTabDisplayed() {
        return isDisplayed(dragTab);
    }
}