package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.krysov.helpers.Attach;
import com.krysov.pages.CheckPage;
import com.krysov.pages.InputDataPage;
import com.krysov.pages.NavigationPage;
import com.krysov.pages.OpenPage;
import com.krysov.randomData.RandomData;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    NavigationPage navigationPage = new NavigationPage();
    InputDataPage inputData = new InputDataPage();
    OpenPage openPage = new OpenPage();
    CheckPage checkPage = new CheckPage();
    RandomData randomData = new RandomData();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
