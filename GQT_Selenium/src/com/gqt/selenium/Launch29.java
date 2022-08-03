// Program to Identify both Username and Password Web Element

package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch29 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("F:/GQT Selenium/HTML for Selenium/Login.html");
		
		WebElement un = driver.findElement(By.xpath("/html/body/input[1]"));
		un.sendKeys("Rahul");
		WebElement pwd = driver.findElement(By.xpath("/html/body/input[2]"));
		pwd.sendKeys("12345678");
		Thread.sleep(3000);
		driver.close();		
		
	}
}
