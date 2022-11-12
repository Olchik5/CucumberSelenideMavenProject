package com.telran.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import com.telran.sconto.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static By loginIcon = By.cssSelector(".headerElement--login");
    private static By loginHeader = By.cssSelector(".existingAccount__headline");
    private static By emailInput = By.id("loginEmail");
    private static By passwordInput = By.id("loginPassword");
    private static String validEmail = PropertiesLoader.loadProperty("valid.email");
    private static String validPassword = PropertiesLoader.loadProperty("valid.password");

    public void clickOnLoginIcon() {
        $(loginIcon).click();
    }

    public SelenideElement loginPageHeaderDisplyed() {
        return $(loginHeader);
    }

    public void validLoginInput() {
        $(emailInput).setValue(validEmail);
        $(passwordInput).setValue(validPassword);
    }

    private static By submitButton = By.id("login-submit");

    public void clickOnLoginSubmitButton() {
        $(submitButton).click();
    }


    public void invalidLoginInput(String email, String password) {
        $(emailInput).setValue(email);
        $(passwordInput).setValue(password);
    }

    private static By passwordErrorMessageLocator = By.id("loginEmail-error");

    public SelenideElement passwordErrorMassage() {
        return $(passwordErrorMessageLocator);
    }
}
