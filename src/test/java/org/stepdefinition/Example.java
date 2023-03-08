package org.stepdefinition;

import org.base.BaseClass;
import org.fbpojo.Human;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example extends BaseClass  {
	Human h;
	@Given("user has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		WindowMaximize();
	    
	}

	@When("user has to hit gmail url")
	public void user_has_to_hit_gmail_url() {
		launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S604064385%3A1677838845842350&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHeJ2XyyD5qCe6PjNNPgJx6o4-CW69-TTrACDxADqzhX49dBRls4fO65nZqL3GorllxFoSp1_Q");
	    
	}

	@When("user has to pass the data{string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		h = new Human();
		passText("em", h.getEmail());
	   
	}

	@When("user has to hit the click button")
	public void user_has_to_hit_the_click_button() {
		h = new Human();
		clickBtn(h.getClick());
	    
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
		CloseEntireBrowser();
	    
	}
	

}
