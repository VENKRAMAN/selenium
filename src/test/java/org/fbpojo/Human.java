package org.fbpojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Human extends BaseClass {
	public Human() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement click;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getClick() {
		return click;
	}
	
	
	
	
	
	

}
