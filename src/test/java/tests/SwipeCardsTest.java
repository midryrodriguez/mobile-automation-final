package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationBar;
import pages.SwipePage;
import utils.GestureUtils;

public class SwipeCardsTest extends BaseTest {

    @Test
    public void shouldSwipeLeftAndShowNextCard() {
        NavigationBar navigationBar = new NavigationBar(driver);
        SwipePage swipePage = new SwipePage(driver);
        GestureUtils gestureUtils = new GestureUtils(driver);

        navigationBar.goToSwipe();

        Assert.assertTrue(swipePage.isSwipeTitleDisplayed(), "Swipe title should be visible");
        Assert.assertTrue(swipePage.isFirstCardDisplayed(), "First card should be visible before swipe");
        Assert.assertTrue(swipePage.isCardContainerDisplayed(), "Card container should be visible");

        gestureUtils.swipeLeft(swipePage.getCardContainer());

        Assert.assertFalse(swipePage.isFirstCardDisplayed(), "First card should not be visible after swipe");
        Assert.assertTrue(swipePage.isSecondCardDisplayed(), "Second card should be visible after swipe");
    }

    @Test
    public void shouldSwipeToLastCardAndFindHiddenText() {
        NavigationBar navigationBar = new NavigationBar(driver);
        SwipePage swipePage = new SwipePage(driver);
        GestureUtils gestureUtils = new GestureUtils(driver);

        navigationBar.goToSwipe();

        Assert.assertTrue(swipePage.isCardContainerDisplayed(), "Card container should be visible");

        int maxSwipeAttempts = 6;
        int swipeAttempts = 0;

        while (!swipePage.isFifthCardDisplayed() && swipeAttempts < maxSwipeAttempts) {
            gestureUtils.swipeLeft(swipePage.getCardContainer());
            swipeAttempts++;
        }

        Assert.assertTrue(swipePage.isFifthCardDisplayed(), "Last card should be visible");

        int maxScrolls = 6;
        int scrollAttempts = 0;

        while (!swipePage.isHiddenTextDisplayed() && scrollAttempts < maxScrolls) {
            gestureUtils.swipeUpOnScreen();
            scrollAttempts++;
        }

        Assert.assertTrue(swipePage.isHiddenTextDisplayed(), "\"You found me!!!\" text should be visible");
    }
}