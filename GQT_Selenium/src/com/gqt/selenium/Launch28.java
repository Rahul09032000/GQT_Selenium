// This Code is to close the whole browser
// HTML code of Parent Page 
// <a href="Page2.html" target="blank"> Go to child Page </a>

package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch28 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("F:/GQT Selenium/HTML for Selenium/page1.html");
		
		WebElement link = driver.findElement(By.linkText("Go to child Page"));
		link.click();
		Thread.sleep(5000);
		
		driver.quit();
	}
}
