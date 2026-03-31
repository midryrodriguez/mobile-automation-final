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

        for (int i = 0; i < 4; i++) {
            gestureUtils.swipeLeft(swipePage.getCardContainer());
        }

        Assert.assertTrue(swipePage.isFifthCardDisplayed(), "Last card should be visible");

        int maxScrolls = 6;
        int attempts = 0;

        while (!swipePage.isHiddenTextDisplayed() && attempts < maxScrolls) {
            gestureUtils.swipeUpOnScreen();
            attempts++;
        }

        Assert.assertTrue(swipePage.isHiddenTextDisplayed(), "\"You found me!!!\" text should be visible");
    }
}