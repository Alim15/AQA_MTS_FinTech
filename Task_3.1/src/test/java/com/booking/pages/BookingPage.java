package com.booking.pages;


import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class BookingPage {

    public void searchCity(String city) {
        open("https://booking.com/");
        $("[name='ss']").setValue(city);
        $("[type='submit']").click();
        // Ожидаем видимости поля ввода и вводим название города
        $("[name='ss']").shouldBe(visible).setValue(city);

        // Ожидаем появления подсказок и выбираем первый вариант
        $$(".autocomplete-results li").first().shouldBe(visible).click();

        // Скроллим до кнопки submit и кликаем
        $("[type='submit']").shouldBe(visible).scrollIntoView(true).click();
    }

    public void verifyCityDisplayed(String city) {

        // $$(".sr_header").findBy(text(city)).shouldBe(visible);
        $(".bui-header__title").shouldHave(text(city));
        $(".bui-spinner").should(disappear); // ждем исчезновения индикатора загрузки
        $$(".sr_header").findBy(text(city)).shouldBe(visible);
        $(".bui-spinner").should(disappear); // ждем окончания загрузки
        $(".bui-header__title").shouldHave(text(city)); // альтернативный локатор
        $$(".sr_header").shouldBe(CollectionCondition.sizeGreaterThan(0)); // ждем, что коллекция содержит элементы
        $$(".sr_header").findBy(text(city)).shouldBe(visible);
        $(".bui-header__title").shouldHave(Condition.text(city)); // Убедимся, что заголовок соответствует городу

    }

    public void selectFiveStars() {

        $("[data-filters-item='class:class=5']").click();
        // Найдем фильтр 5 звезд и кликнем по нему
        $("[data-filters-item='class:class=5']").scrollIntoView(true).shouldBe(Condition.visible).click();

        // Добавим ожидание, чтобы список отелей обновился
        $(".sr-loader").should(Condition.disappear);
    }

    public void verifyAllHotelsAreFiveStars() {
        $$(".bui-review-score__badge").forEach(badge ->
                badge.shouldHave(attribute("aria-label", "5 звёзд")));

        // Проверяем, что у всех отелей указаны 5 звезд
//        $$(".bui-review-score__badge").forEach(badge ->
//                badge.shouldHave(Condition.attribute("aria-label", "5 звёзд")));
    }
}