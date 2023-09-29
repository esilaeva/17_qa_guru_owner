package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.tests.TestBase;
import io.qameta.allure.Step;
import lombok.Getter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

@Getter
public class ContactPage extends TestBase {

    SelenideElement title = $("h1 span");

    @Step("Contact Page was opened")
    public void checkContactPageWasOpened() {
        title.shouldHave(text("Contact Us"));
    }
}
