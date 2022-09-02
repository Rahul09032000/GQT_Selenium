package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupSolutionTry3 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		// HTML Code for Close Button - 
		// <button class="_2KpZ6l _2doB4z">✕</button>
		WebElement close_btn = driver.findElement(By.cssSelector("button._2KpZ6l"));
		close_btn.click();
		
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		
		// <input autocomplete="off" type="text" class="_2IX_2- VJZDxU" value="">
		WebElement email = driver.findElement(By.linkText("Enter Email/Mobile number"));
		email.sendKeys("9164932931");
		
		
		

	}

}
