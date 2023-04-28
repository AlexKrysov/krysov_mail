package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class NavigationPage {

    private SelenideElement
            buttonEnter = $("[data-testid='enter-mail-primary']"),
            buttonPassword = $(byText("Ввести пароль")),
            buttonSubmit = $("[data-test-id='submit-button']"),
            buttonMessage = $(".compose-button__wrapper"),
            buttonSend = $(".vkuiButton__content");

    public void clickButtonEnter() {
        step("Клик на кнопку 'Войти'", () -> {
            buttonEnter.click();
        });
    }

    public void clickButtonPassword() {
        step("Клик на кнопку 'Ввести пароль'", () -> {
            buttonPassword.click();
        });
    }

    public void clickButtonSubmit() {
        step("Клик на кнопку 'Войти', после заполнения полей", () -> {
            buttonSubmit.click();
        });
    }

    public void clickButtonMessage() {
        step("Клик на кнопку 'Написать письмо'", () -> {
            buttonMessage.click();
        });
    }

    public void clickButtonSend() {
        step("Клик на кнопку 'Отправить'", () -> {
            buttonSend.click();
        });
    }
}