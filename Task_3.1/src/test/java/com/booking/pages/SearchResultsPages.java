package com.booking.pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchResultsPages {
    private SelenideElement locationHeader = $(".bui-header__title");
    private SelenideElement fiveStarFilter = $x("//div[contains(text(), '5 звёзд')]");
    private ElementsCollection hotelStars = $$("span[class*='class']");

    public void checkSearchHeader(String location) {
        locationHeader.shouldHave(text(location));
    }

    public void applyFiveStarFilter() {
        fiveStarFilter.click();
    }

    public void verifyAllHotelsAreFiveStar() {
        hotelStars.forEach(star -> star.shouldHave(text("5")));
    }
}