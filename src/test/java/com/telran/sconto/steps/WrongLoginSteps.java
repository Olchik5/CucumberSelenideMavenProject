package com.telran.sconto.steps;

import com.telran.sconto.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class WrongLoginSteps implements En {

    LoginPage loginPage;

    public WrongLoginSteps() {
        When ("Enter a valid email and an invalid password",(DataTable table) ->{
            loginPage = page(LoginPage.class);
            List<Map<String,String>> dataTable = table.asMaps();

            String email = dataTable.get(0).get("email");
            String password = dataTable.get(0).get("password");

            loginPage.invalidLoginInput(email, password);
        });

        Then("Password Error message displayed",() ->{
            loginPage.passwordErrorMassage().shouldHave(text("Benutzername nicht gefunden"));
        });
    }
}
