package tests;

import base.BaseTest;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.NavigationBar;
import utils.UserDataGenerator;

public class LoginTest extends BaseTest {

    @Test
    public void shouldLoginSuccessfully() {

        NavigationBar navigationBar = new NavigationBar(driver);
        LoginPage loginPage = new LoginPage(driver);

        navigationBar.goToLogin();


        User user = UserDataGenerator.createRandomUser();


        loginPage.signUp(user.getEmail(), user.getPassword());


        Assert.assertTrue(loginPage.isSignUpSuccessTitleDisplayed());
        loginPage.tapSuccessOkButton();


        loginPage.login(user.getEmail(), user.getPassword());
        
        Assert.assertTrue(loginPage.isLoginSuccessTitleDisplayed(), "Login success title should be displayed");
        Assert.assertTrue(loginPage.isLoginSuccessMessageDisplayed(), "Login success message should be displayed");

        loginPage.tapSuccessOkButton();
    }
}