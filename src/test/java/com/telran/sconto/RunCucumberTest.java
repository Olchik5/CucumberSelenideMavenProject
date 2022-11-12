package com.telran.sconto;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
    plugin = {"json:target/cucumber-report.json", "pretty"},
    tags = "@wrongPassword")

@io.cucumber.testng.CucumberOptions(features = "src/test/resources/features",
        plugin = {"json:target/cucumber-report.json", "pretty"},
        tags = "@wrongPassword")

public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
