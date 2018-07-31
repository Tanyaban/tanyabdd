package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver ffdriver1;
	String title;
	@Given("^Login application should be available$")
	public void login_application_should_be_available() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
		  ffdriver1=new FirefoxDriver();
			ffdriver1.get("http://ec2-18-217-137-35.us-east-2.compute.amazonaws.com:8090/TestWebapp");
			ffdriver1.manage().window().maximize();
	}

	@When("^validate login application$")
	public void validate_login_application()  {
	    // Write code here that turns the phrase above into concrete actions
		title=ffdriver1.getTitle();
		System.out.println(title);
		
		Assert.assertNotSame("The Apache foundation ",title );
	    	}

	@Then("^login should be successful$")
	public void login_should_be_successful()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	
}
