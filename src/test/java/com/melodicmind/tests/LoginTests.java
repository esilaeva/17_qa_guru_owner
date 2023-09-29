package com.melodicmind.tests;

import com.melodicmind.pages.HomePage;
import com.melodicmind.pages.LoginPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@Feature("Login test")
public class LoginTests extends TestBase {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    @Tag("login")
    @DisplayName("Positive login with email")
    void loginSuccessWithEmail() {
        loginPage
                .openLoginPage()
                .clickBtnContinueWithEmail()
                .setEmail("ilana.qa@proton.me")
                .setPassword("Ii12345$")
                .clickButtonSignIn();

        homePage.checkHomePageWasOpened();
    }

    @CsvFileSource(resources = "/negative_login_wrong_email.csv")
    @Tag("login")
    @DisplayName("Negative login with wrong email")
    @ParameterizedTest(name = "Negative login {0}.  Wrong email: {1} and valid password: {2}")
    void negativeLoginWrongEmail(String nameTest, String email, String password) {
        loginPage
                .openLoginPage()
                .clickBtnContinueWithEmail()
                .setEmail(email)
                .setPassword(password)
                .clickButtonSignIn();

        loginPage.checkErrorMessageWrongEmailAppeared();
    }

    @CsvFileSource(resources = "/negative_login_wrong_password.csv")
    @Tag("login")
    @DisplayName("Negative login with wrong password")
    @ParameterizedTest(name = "Negative login {0}.  Valid email: {1} and wrong password: {2}")
    void negativeLoginWrongPassword(String nameTest, String email, String password) {
        loginPage
                .openLoginPage()
                .clickBtnContinueWithEmail()
                .setEmail(email)
                .setPassword(password)
                .clickButtonSignIn();

        loginPage.checkErrorMessageWrongPasswordAppeared();
    }

    @Test
    @Tag("login")
    @DisplayName("Negative login with unregistered user")
    void negativeLoginUnregisteredUser() {
        loginPage
                .openLoginPage()
                .clickBtnContinueWithEmail()
                .setEmail("ilana.qa+1@proton.me")
                .setPassword("Ii12345$")
                .clickButtonSignIn();

        loginPage.checkErrorMessageUnregisteredUserAppeared();
    }
}