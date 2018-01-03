package Cucumber.CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

      features="src/test/java/Cucumber/CucumberTest/FirstTest.feature",

      format={"pretty","html:target/Reports"}

      )

public class FirstTest {

} 
