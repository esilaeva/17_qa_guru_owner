package com.melodicmind.pages;

import com.codeborne.selenide.SelenideElement;
import com.melodicmind.tests.TestBase;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class ProfilePage extends TestBase {

    SelenideElement buttonDeleteAccount = $("href='/delete-user'");
}
