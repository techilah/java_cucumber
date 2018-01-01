$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Cucumber/CucumberTest/FirstTest.feature");
formatter.feature({
  "name": "Cucumber Test",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Simple Scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I have a variable with the value 5",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.i_have_a_variable_with_the_value(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I increment it with 1",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.i_increment_it_with(double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the value 6 in that variable",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.i_have_the_value_in_that_variable(double)"
});
formatter.result({
  "status": "passed"
});
});