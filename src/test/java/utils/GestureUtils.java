package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;

public class GestureUtils {

    private final AndroidDriver driver;

    public GestureUtils(AndroidDriver driver) {
        this.driver = driver;
    }

    public void swipeLeft(WebElement element) {
        Point location = element.getLocation();
        Dimension size = element.getSize();

        int startX = (int) (location.getX() + size.getWidth() * 0.8);
        int endX = (int) (location.getX() + size.getWidth() * 0.2);
        int y = location.getY() + (size.getHeight() / 2);

        performSwipe(startX, y, endX, y, 500);
    }

    public void swipeUp(WebElement element) {
        Point location = element.getLocation();
        Dimension size = element.getSize();

        int centerX = location.getX() + (size.getWidth() / 2);
        int startY = (int) (location.getY() + size.getHeight() * 0.8);
        int endY = (int) (location.getY() + size.getHeight() * 0.2);

        performSwipe(centerX, startY, centerX, endY, 600);
    }

    private void performSwipe(int startX, int startY, int endX, int endY, int durationMs) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(durationMs), PointerInput.Origin.viewport(), endX, endY));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(swipe));
    }
}