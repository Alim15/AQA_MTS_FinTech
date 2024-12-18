package com.booking.base;

import com.booking.pages.BookingPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class BaseTest {
    @BeforeAll
    public static void setUp() {


        Configuration.browser = "chrome";
        Configuration.browserSize = String.valueOf(true); // Браузер открывается на весь экран
        addListener("AllureSelenide", new AllureSelenide());
        Configuration.timeout = 50000; // Таймаут ожидания элементов

        // Подключение Allure Selenide Listener
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)  // Добавлять скриншоты
                .savePageSource(true)); // Сохранять исходный код страниц



//        System.setProperty("selenide.browser", "chrome");
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/yandexdriver.exe");
//        Configuration.browser = "chrome";
//        Configuration.browserBinary = "C:\\Users\\1\\AppData\\Local\\Yandex\\YandexBrowser\\Application\\browser.exe";
//        Configuration.browserSize = String.valueOf(true);
//        Configuration.timeout = 50000; // Таймаут ожидания элементов

    }
}
