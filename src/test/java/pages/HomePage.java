package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By homeTitle = By.xpath("//android.widget.TextView[@text='WEBDRIVER']");
    private final By logo = By.xpath("//android.widget.ImageView");
    private final By homeDescriptionText = By.xpath("//android.widget.TextView[@text='Demo app for the appium-boilerplate']");

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public boolean isHomeTitleDisplayed() {
        return isDisplayed(homeTitle);
    }

    public boolean isLogoDisplayed() {
        return isDisplayed(logo);
    }

    public boolean isHomeDescriptionTextDisplayed() {
        return isDisplayed(homeDescriptionText);
    }
}