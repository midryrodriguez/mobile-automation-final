package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By homeTitle = By.xpath("//android.widget.TextView[@text='WEBDRIVER']");
    private final By logo = By.xpath("//android.widget.ImageView");

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public boolean isHomeTitleDisplayed() {
        return isDisplayed(homeTitle);
    }

    public boolean isLogoDisplayed() {
        return isDisplayed(logo);
    }
}