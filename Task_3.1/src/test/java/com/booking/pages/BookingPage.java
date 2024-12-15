package com.booking.pages;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

//public class BookingMainPage {
//    private SelenideElement searchInput = $("#ss");
//    private SelenideElement searchButton = $("button[type='submit']");
//
//    public BookingMainPage openHomePage() {
//        open("https://booking.com/");
//        return this;
//    }
//
//    public void searchForLocation(String location) {
//        searchInput.setValue(location);
//        searchButton.click();
//    }
//}



import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class BookingPage {

    public void searchCity(String city) {
        open("https://booking.com/");
        $("[name='ss']").setValue(city);
        $("[type='submit']").click();
    }

    public void verifyCityDisplayed(String city) {
        $$(".sr_header").findBy(text(city)).shouldBe(visible);
    }

    public void selectFiveStars() {
        $("[data-filters-item='class:class=5']").click();
    }

    public void verifyAllHotelsAreFiveStars() {
        $$(".bui-review-score__badge").forEach(badge ->
                badge.shouldHave(attribute("aria-label", "5 звёзд")));
    }
}