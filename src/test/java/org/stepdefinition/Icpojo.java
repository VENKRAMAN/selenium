package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Icpojo extends BaseClass {
	public Icpojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "login-btn")
	private WebElement login;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement name;
	public WebElement getLogin() {
		return login;
	}
	public WebElement getName() {
		return name;
	}
	

}
