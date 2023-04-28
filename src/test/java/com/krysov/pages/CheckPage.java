package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CheckPage {

    private SelenideElement

            message = $(".layer__link");

    public void checkText() {
        step("Проверка отправки сообщения", () -> {
            message.shouldHave(text("Письмо отправлено"));
        });
    }
}
