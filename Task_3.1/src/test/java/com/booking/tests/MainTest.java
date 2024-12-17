package com.booking.tests;
// import com.booking.base.BaseTest;
//import com.booking.pages.BookingMainPage;
//import com.booking.pages.BookingMainPage;
//import com.booking.pages.SearchResultsPages;
//import org.junit.jupiter.api.Test;
//
//public class MainTest extends BaseTest {
//    BookingMainPage mainPage = new BookingMainPage();
//    SearchResultsPages resultsPage = new SearchResultsPages();
//
//    @Test
//    public void testBookingSearchAndFilters() {
//        String location = "Анталья";
//
//        mainPage.openHomePage()
//                .searchForLocation(location);
//
//        resultsPage.checkSearchHeader(location);
//        resultsPage.applyFiveStarFilter();
//        resultsPage.verifyAllHotelsAreFiveStar();
//    }
//}

import com.booking.base.BaseTest;
import com.booking.pages.BookingPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;


public class MainTest extends BaseTest {
    BookingPage bookingPage = new BookingPage();

    @Test
    public void testSearchAndFilter() {
        String city = "Анталья";

        bookingPage.searchCity(city);
        bookingPage.verifyCityDisplayed(city);
        bookingPage.selectFiveStars();
        bookingPage.verifyAllHotelsAreFiveStars();

        if ($(".ot-sdk-row").isDisplayed()) {
            $(".ot-sdk-row .close-button").click(); // Замените на правильный селектор
        }
    }
}
