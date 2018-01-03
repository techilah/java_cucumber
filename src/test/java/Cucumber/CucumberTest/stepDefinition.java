package Cucumber.CucumberTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


@SuppressWarnings("deprecation")
public class stepDefinition {
	
	public double myVariable;
	private static double myDelta;
	private RemoteWebDriver driver;

	
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
	
	@Given("^I start the \"([^\"]*)\" application$")
	public void i_start_the_application(String arg1) throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "emulator-5554"); //obtained from the command "adb devices"
		capabilities.setCapability("browserName", "Android");
		capabilities.setCapability("platformVersion", "8.1.0");
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("app", "C:\\selenium\\" + arg1 + "-test-app-0.17.0.apk");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

	@When("^I type the text \"([^\"]*)\" into an input text field$")
	public void i_type_the_text_into_an_input_text_field(String arg1) throws Exception {
		driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys(arg1); //Open drop down country menu
		driver.navigate().back();
	}

	@Then("^I have the text \"([^\"]*)\" in that field$")
	public void i_have_the_text_in_that_field(String arg1) throws Exception {
		String value = driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).getText();
		
		TestCase.assertEquals(arg1, value);
	}
	
}

