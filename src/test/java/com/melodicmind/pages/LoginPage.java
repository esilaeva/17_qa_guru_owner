package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.pages.components.HeaderComponent;
import com.melodicmind.tests.TestBase;
import io.qameta.allure.Step;
import lombok.Getter;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Getter
public class LoginPage extends TestBase {

    HeaderComponent header = new HeaderComponent();
    HomePage homePage = new HomePage();

    SelenideElement
            title = $("h1"),
            buttonContinue = $("div.btn-container"),
            tab = $("div.email-auth-container"),
            buttonSubmit = $("form.login-form"),
            inputEmail = $("form.q-form.login-form input[aria-label='Email']"),
            inputPassword = $("form.q-form.login-form input[aria-label='Password'"),
            error = $("#q-notify");

    @Step("Error: wrong Email")
    public void checkErrorMessageWrongEmailAppeared(){
        error.$(byText("Error signing in, please try again.")).shouldBe(appear);
    }

    @Step("Error: wrong Email")
    public void checkErrorMessageWrongPasswordAppeared(){
        error.$(byText("Wrong password")).shouldBe(appear);
    }

    @Step("Error: wrong Email")
    public void checkErrorMessageUnregisteredUserAppeared(){
        error.$(byText("No user found with this email")).shouldBe(appear);
    }

    @Step("Open Login Page")
    public LoginPage openLoginPage() {
        open("https://melodic-mind.com/login");

        return this;
    }

    @Step("Click on the button Sign in")
    public void clickButtonSignIn() {
        buttonSubmit.$("button.primary").click();
    }

    @Step("Click on the button Continue with Email")
    public LoginPage clickBtnContinueWithEmail() {
        buttonContinue.lastChild().click();

        return this;
    }

    @Step("Input email")
    public LoginPage setEmail(String value) {
        inputEmail.setValue(value);

        return this;
    }

    @Step("Input password")
    public LoginPage setPassword(String value) {
        inputPassword.setValue(value);

        return this;
    }

    @Step("Login Page was opened")
    public void checkLoginPageWasOpened() {
        title.shouldHave(text("Login / Sign Up"));
    }
}
