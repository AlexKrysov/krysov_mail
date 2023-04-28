package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SendMessageTest extends TestBase {

    @DisplayName("Проверка отправки сообщения")
    @Owner("Krysov")
    @Tag("PositiveMessageTest")
    @Test
    void sendMessage1() {
        openPage.openMailPage();
        navigationPage.clickButtonEnter();
        navigationPage.changeFrame();
        inputData.inputLogin();
        navigationPage.clickButtonPassword();
        inputData.inputPassword();
        navigationPage.clickButtonSubmit();
        navigationPage.clickButtonMessage();
        inputData.inputRecipient();
        inputData.inputSubject();
        randomData.inputRandomMessage();
        navigationPage.clickButtonSend();
        checkPage.checkText();

    }
}
