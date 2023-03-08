package org.stepdefinition;

import org.base.BaseClass;
import org.fbpojo.Human;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gmaillogin extends BaseClass {
	Human h;
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		WindowMaximize();
	   
	}

	@When("To launch the url of the gmail application")
	public void to_launch_the_url_of_the_gmail_application() {
		launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S604064385%3A1677838845842350&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHeJ2XyyD5qCe6PjNNPgJx6o4-CW69-TTrACDxADqzhX49dBRls4fO65nZqL3GorllxFoSp1_Q");
	   
	}

	@When("To pass the valid username in email field")
	public void to_pass_the_valid_username_in_email_field() {
		h = new Human();
		passText("vr921718@gmail.com", h.getEmail());
	    
	}

	@When("To click the next button")
	public void to_click_the_next_button() {
		h = new Human();
		clickBtn(h.getClick());
	    
	}

	@When("To check whether navigate to homepage or not")
	public void to_check_whether_navigate_to_homepage_or_not() {
		System.out.println("To check is this correct");
	  
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		CloseEntireBrowser();
	    
	}



}
