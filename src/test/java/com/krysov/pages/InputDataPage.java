package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class InputDataPage {

    private SelenideElement
            mail = $("[name='username']", 0),
            password = $("[name='password']"),
            mailKrysov = $(".container--H9L5q.size_s--3_M-_", 0),
            subject = $(".container--H9L5q.size_s--3_M-_", 1),
            message = $("[role='textbox']");

    public void inputLogin() {
        step("Ввод валиднго логина", () -> {
            mail.setValue("test1.test.2024");
        });
    }

    public void inputPassword() {
        step("Ввод валиднго пароля", () -> {
            password.setValue("superPUPERproject1!");
        });
    }

    public void inputRecipient() {
        step("Ввод адреса получателя", () -> {
            mailKrysov.setValue("krysov-95@mail.ru");
        });
    }

    public void inputSubject() {
        step("Ввод темы сообщения", () -> {
            subject.setValue("testMessage1");
        });
    }

    public void inputMessage() {
        step("Ввод текста сообщения", () -> {
            subject.setValue("Привет! Я мистер сообщение");
        });
    }
}
