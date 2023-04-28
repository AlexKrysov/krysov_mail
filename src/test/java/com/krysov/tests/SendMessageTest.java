package com.krysov.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
