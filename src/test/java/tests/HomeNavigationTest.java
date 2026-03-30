package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NavigationBar;

public class HomeNavigationTest extends BaseTest {

    @Test
    public void shouldNavigateToHomeAndValidateElements() {
        NavigationBar navigationBar = new NavigationBar(driver);
        HomePage homePage = new HomePage(driver);

        navigationBar.goToHome();

        Assert.assertTrue(homePage.isHomeTitleDisplayed(), "Home title should be visible");
        Assert.assertTrue(homePage.isLogoDisplayed(), "Home logo should be visible");
    }
}