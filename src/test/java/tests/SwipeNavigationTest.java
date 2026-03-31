package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationBar;
import pages.SwipePage;

public class SwipeNavigationTest extends BaseTest {

    @Test
    public void shouldNavigateToSwipeAndValidateElements() {
        NavigationBar navigationBar = new NavigationBar(driver);
        SwipePage swipePage = new SwipePage(driver);

        navigationBar.goToSwipe();

        Assert.assertTrue(swipePage.isSwipeTitleDisplayed(), "Swipe title should be visible");
        Assert.assertTrue(swipePage.isFirstCardDisplayed(), "First card title should be visible");
        Assert.assertTrue(swipePage.isCardContainerDisplayed(), "Card container should be visible");
    }
}