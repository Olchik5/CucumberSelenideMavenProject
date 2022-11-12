package com.telran.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import com.telran.sconto.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static String baseURL = PropertiesLoader.loadProperty("url");
    private static By acceptButton = By.cssSelector("[data-accept-action='all']");

    public void acceptCookies() {
        $(acceptButton).click();
    }

    private static By myAccountIcon =
            By.xpath("//div[@class='headerElement headerElement--login']");

    public SelenideElement validMyAccount() {
        return $(myAccountIcon);
    }

    public void clickOnMyAccountIcon() {
        $(myAccountIcon).click();
    }
}
