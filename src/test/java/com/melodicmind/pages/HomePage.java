package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.pages.components.HeaderComponent;
import io.qameta.allure.Step;
import lombok.Getter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.melodicmind.tests.TestBase.urlMain;

@Getter
public class HomePage {

    HeaderComponent header = new HeaderComponent();
    ProfilePage profilePage = new ProfilePage();

    SelenideElement
            title = $("h1.title"),
            buttonAcceptCookies = $("button.cookie__floating__buttons__button--accept");

    @Step("Open Home Page")
    public HomePage openMainPage() {
        open(urlMain);

        return this;
    }

    @Step("Home Page was opened")
    public void checkHomePageWasOpened() {
        title.shouldHave(text("Melodic Mind"));
    }

    @Step("Open Home Page")
    public HomePage openHomePage() {
        header.getButtonHome().click();

        return this;
    }

    @Step("Open The Story Page")
    public HomePage openTheStoryPage() {
        header.getButtonTheStory().click();

        return this;
    }

    @Step("Open Blog Page")
    public HomePage openBlogPage() {
        header.getButtonBlog().click();

        return this;
    }

    @Step("Open Contact Page")
    public HomePage openContactPage() {
        header.getButtonContact().click();

        return this;
    }

    @Step("Open Q & A Page")
    public HomePage openQandAPage() {
        header.getButtonQa().click();

        return this;
    }

    @Step("Open Login Page")
    public HomePage openLoginPage() {
        header.getButtonLogin().click();

        return this;
    }
}
