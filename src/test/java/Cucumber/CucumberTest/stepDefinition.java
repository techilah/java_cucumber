package Cucumber.CucumberTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import junit.framework.Assert;
import junit.framework.Test;

import static org.junit.Assert.assertEquals;

import org.junit.internal.runners.TestClass;
import org.junit.rules.TestName;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@SuppressWarnings("deprecation")
public class stepDefinition {
	
	public double myVariable;
	private static double myDelta;
	
	@Given("^I have a variable with the value (\\d+)$")
	public void i_have_a_variable_with_the_value(double arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    this.myVariable = arg1;
	}

	@When("^I increment it with (\\d+)$")
	public void i_increment_it_with(double arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    this.myVariable += arg1;
	}

	@Then("^I have the value (\\d+) in that variable$")
	public void i_have_the_value_in_that_variable(double arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(this.myVariable, arg1, this.myDelta);
	}
	
}

