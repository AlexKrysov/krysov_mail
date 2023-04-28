package com.krysov.pages;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class OpenPage {

    private final String CompanyUrl = "https://mail.ru/";

    public void openMailPage() {
        step("Открыть страницу", () ->
                open(CompanyUrl));
    }
}
