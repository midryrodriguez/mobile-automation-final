package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.NavigationBar;

public class LoginNavigationTest extends BaseTest {

    @Test
    public void shouldNavigateToLoginAndValidateElements() {
        NavigationBar navigationBar = new NavigationBar(driver);
        LoginPage loginPage = new LoginPage(driver);

        navigationBar.goToLogin();

        Assert.assertTrue(loginPage.isLoginTabTitleDisplayed(), "Login title should be visible");
        Assert.assertTrue(loginPage.isEmailInputDisplayed(), "Email input should be visible");
        Assert.assertTrue(loginPage.isPasswordInputDisplayed(), "Password input should be visible");
        Assert.assertTrue(loginPage.isLoginButtonDisplayed(), "Login button should be visible");
    }
}