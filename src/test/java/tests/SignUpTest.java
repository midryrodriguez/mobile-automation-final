package tests;

import base.BaseTest;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.NavigationBar;
import utils.UserDataGenerator;

public class SignUpTest extends BaseTest {

    @Test
    public void shouldSignUpSuccessfully() {

        NavigationBar navigationBar = new NavigationBar(driver);
        LoginPage loginPage = new LoginPage(driver);

        navigationBar.goToLogin();

        User user = UserDataGenerator.createRandomUser();

        loginPage.signUp(user.getEmail(), user.getPassword());

        Assert.assertTrue(loginPage.isSignUpSuccessTitleDisplayed(), "Sign up success title should be displayed");
        Assert.assertTrue(loginPage.isSignUpSuccessMessageDisplayed(), "Sign up success message should be displayed");

        loginPage.tapSuccessOkButton();
    }
}