package com.telran.sconto.steps;

import com.telran.sconto.pages.HomePage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.telran.sconto.pages.HomePage.baseURL;

public class HomePageSteps implements En {

    HomePage homePage;

    public HomePageSteps() {
        Given("Navigate to Home Page",() ->{
            homePage = open(baseURL,HomePage.class);
            homePage.acceptCookies();
        });

        Then("Home Page diplayed",() ->{
            homePage.validMyAccount().shouldHave(text("Onita Onitovna"));
        });

        When("Click on Main Konto icon",() ->{
            homePage.clickOnMyAccountIcon();
        });

    }
}
