$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Cucumber/CucumberTest/SelendroidTest.feature");
formatter.feature({
  "name": "Selendroid application test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Type into text field",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I start the \"selendroid\" application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.i_start_the_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type the text \"testtext\" into an input text field",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.i_type_the_text_into_an_input_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have the text \"testtext\" in that field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.i_have_the_text_in_that_field(String)"
});
formatter.result({
  "status": "passed"
});
});