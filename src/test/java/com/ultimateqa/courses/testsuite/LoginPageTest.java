package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnSignIn();
        String expectedTextMessage = "Welcome Back!";
        Assert.assertEquals(loginPage.getTextMessage(),expectedTextMessage,"Welcome Back Message is not Displayed");
    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnSignIn();
        loginPage.enterInvalidEmail("admin1234@example.com");
        loginPage.enterInvalidPassword("admin1234");
        loginPage.clickOnSignInButton();
        String expectedErrorMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.getErrorMessage(),expectedErrorMessage,"Invalid credential text is not displayed");
    }
}
