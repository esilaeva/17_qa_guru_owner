package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.tests.TestBase;
import io.qameta.allure.Step;
import lombok.Getter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Getter
public class QandAPage extends TestBase {

    SelenideElement title = $("h1 span").$(byText("Question and answers"));

    @Step("Question and Answers Page was opened")
    public void checkQandAPageWasOpened() {
        title.shouldHave(text("Question and answers"));
    }
}
