package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	@Test
	private void tc3() {
		System.out.println("TC 3 = "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		}
	@Test
	private void tc1() {
		System.out.println("TC 1="+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("vr921718@gmail.com");
	    WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("venkat@30");
		}
	@Test
	private void tc2() {
		System.out.println("TC 2="+Thread.currentThread().getId() );
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

}
