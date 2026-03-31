package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SwipePage extends BasePage {

    private final By swipeTitle = By.xpath("//android.widget.TextView[@text='Swipe horizontal']");
    private final By firstCardTitle = By.xpath("//android.widget.TextView[@text='FULLY OPEN SOURCE']");
    private final By secondCardTitle = By.xpath("//android.widget.TextView[@text='GREAT COMMUNITY']");
    private final By thirdCardTitle = By.xpath("//android.widget.TextView[@text='JS.FOUNDATION']");
    private final By fourthCardTitle = By.xpath("//android.widget.TextView[@text='SUPPORT VIDEOS']");
    private final By fifthCardTitle = By.xpath("//android.widget.TextView[@text='COMPATIBLE']");
    private final By cardContainer = AppiumBy.accessibilityId("card");
    private final By swipeScreen = AppiumBy.accessibilityId("Swipe-screen");
    private final By hiddenText = By.xpath("//android.widget.TextView[@text='You found me!!!']");

    public SwipePage(AndroidDriver driver) {
        super(driver);
    }

    public boolean isSwipeTitleDisplayed() {
        return isDisplayed(swipeTitle);
    }

    public boolean isFirstCardDisplayed() {
        return isDisplayed(firstCardTitle);
    }

    public boolean isSecondCardDisplayed() {
        return isDisplayed(secondCardTitle);
    }

    public boolean isThirdCardDisplayed() {
        return isDisplayed(thirdCardTitle);
    }

    public boolean isFourthCardDisplayed() {
        return isDisplayed(fourthCardTitle);
    }

    public boolean isFifthCardDisplayed() {
        return isDisplayed(fifthCardTitle);
    }

    public boolean isCardContainerDisplayed() {
        return isDisplayed(cardContainer);
    }

    public boolean isHiddenTextDisplayed() {
        return isDisplayed(hiddenText);
    }

    public WebElement getCardContainer() {
        return find(cardContainer);
    }

    public WebElement getSwipeScreen() {
        return find(swipeScreen);
    }
}