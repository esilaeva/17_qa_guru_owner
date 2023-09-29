package com.melodicmind.pages.components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.Setter;

import static com.codeborne.selenide.Selenide.$;

@Setter
@Getter
public class HeaderComponent {

    public SelenideElement
            buttonHome = $("a[href='/'"),
            buttonTheStory = $("a[href='/the-story']"),
            buttonBlog = $("a[href='/blog']"),
            buttonContact = $("a[href='/contact']"),
            buttonQa = $("a[href='/qa']"),
            buttonLogin = $("a[href='/login']"),
            buttonProfile = $("a[href='/account']"),
            buttonSettings = $("header div div div div button");
}
