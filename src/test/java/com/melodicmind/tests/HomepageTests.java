package com.melodicmind.tests;

import com.melodicmind.pages.*;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Feature(value = "Homepage buttons test")
public class HomepageTests extends TestBase {

    HomePage homePage = new HomePage();
    TheStoryPage theStoryPage = new TheStoryPage();
    BlogPage blogPage = new BlogPage();
    ContactPage contactPage = new ContactPage();
    QandAPage qAndAPage = new QandAPage();
    LoginPage loginPage = new LoginPage();

    @Test
    @Tag("homepage")
    @DisplayName("Checking The Story button")
    public void checkTheStoryButton() {
        homePage
                .openMainPage()
                .openTheStoryPage();

        theStoryPage.checkTheStoryPageWasOpened();
    }

    @Test
    @Tag("homepage")
    @DisplayName("Checking Blog button")
    public void checkBlogButton() {
        homePage.openMainPage()
                .openBlogPage();

        blogPage.checkBlogPageWasOpened();
    }

    @Test
    @Tag("homepage")
    @DisplayName("Checking Contact button")
    public void checkContactButton() {
        homePage
                .openMainPage()
                .openContactPage();

        contactPage.checkContactPageWasOpened();
    }

    @Test
    @Tag("homepage")
    @DisplayName("Checking Q&A button")
    public void checkQandAButton() {
        homePage
                .openMainPage()
                .openQandAPage();

        qAndAPage.checkQandAPageWasOpened();
    }

    @Test
    @Tag("homepage")
    @DisplayName("Checking Profile button")
    public void checkProfileButton() {
        homePage
                .openMainPage()
                .openLoginPage();
        loginPage
                .clickBtnContinueWithEmail()
                .setEmail("ilana.qa@proton.me")
                .setPassword("Ii12345$")
                .clickButtonSignIn();

        homePage.checkHomePageWasOpened();
    }

    @Test
    @Tag("homepage")
    @DisplayName("Checking Login button")
    public void checkLoginButton() {
        homePage
                .openMainPage()
                .openLoginPage();

        loginPage.checkLoginPageWasOpened();
    }

    @Test
    @Tag("homepage")
    @DisplayName("Checking Home button")
    public void checkHomeButton() {
        homePage.openMainPage()
                .openLoginPage()
                .openHomePage()

                .checkHomePageWasOpened();
    }
}
