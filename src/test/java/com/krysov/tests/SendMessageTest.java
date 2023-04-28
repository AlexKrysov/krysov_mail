package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SendMessageTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void sendMessage() {
        open("https://mail.ru/");
        $("[data-testid='enter-mail-primary']").click();
        switchTo().frame(14);
        $("[name='username']",0).setValue("test1.test.2024");
        $(byText("Ввести пароль")).click();
        $("[name='password']").setValue("superPUPERproject1!");
        $("[data-test-id='submit-button']").click();
        $(".compose-button__wrapper").click();
        $(".container--H9L5q.size_s--3_M-_", 0).setValue("krysov-95@mail.ru");
        $(".container--H9L5q.size_s--3_M-_", 1).setValue("testMessage1");
        $("[role='textbox']").setValue("Привет! Я мистер сообщение");
        $(".vkuiButton__content").click();
        $(".layer__link").shouldHave(text("Письмо отправлено"));
    }
}
