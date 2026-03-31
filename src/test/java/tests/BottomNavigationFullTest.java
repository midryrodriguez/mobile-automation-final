package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.NavigationBar;
import pages.SwipePage;

public class BottomNavigationFullTest extends BaseTest {

    @Test
    public void shouldNavigateThroughCoreBottomTabs() {

        NavigationBar nav = new NavigationBar(driver);
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SwipePage swipePage = new SwipePage(driver);


        nav.goToHome();
        Assert.assertTrue(homePage.isTitleDisplayed(), "Home title should be displayed");


        nav.goToLogin();
        Assert.assertTrue(loginPage.isLoginTabTitleDisplayed(), "Login screen title should be displayed");
        Assert.assertTrue(loginPage.isEmailInputDisplayed(), "Login email input should be displayed");
        Assert.assertTrue(loginPage.isPasswordInputDisplayed(), "Login password input should be displayed");
        Assert.assertTrue(loginPage.isLoginButtonDisplayed(), "Login button should be displayed");


        nav.goToSwipe();
        Assert.assertTrue(swipePage.isSwipeTitleDisplayed(), "Swipe title should be displayed");


        nav.goToWebview();
        Assert.assertTrue(nav.isWebviewTabDisplayed(), "Webview tab should remain visible after navigation");


        nav.goToForms();
        Assert.assertTrue(nav.isFormsTabDisplayed(), "Forms tab should remain visible after navigation");


        nav.goToDrag();
        Assert.assertTrue(nav.isDragTabDisplayed(), "Drag tab should remain visible after navigation");
    }
}