package com.krysov.randomData;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class RandomData {

    public static Faker faker = new Faker();

    private SelenideElement
            message = $("[role='textbox']");



    private String randomMessage = faker.weather().description();


    public void inputRandomMessage() {
        step("Вводим рандомный адрес электронной почты", () -> {
            message.setValue(randomMessage);
        });
    }
}
