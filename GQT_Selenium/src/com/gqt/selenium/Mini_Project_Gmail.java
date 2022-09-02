package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project_Gmail 
{
	public static void main(String[] args) throws InterruptedException
	{
		// To open browser and navigate to Gmail Application
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		
		// To find e-mail text field
		WebElement email_tf = driver.findElement(By.xpath("//input[@class ='whsOnd zHQkBf' and @type='email']"));
		email_tf.sendKeys("rahulmahendrakar09@gmail.com");
		Thread.sleep(2000);
		
		// To Click on Next Button
		WebElement next_btn = driver.findElement(By.xpath("(//span[@jsname = 'V67aGc' and @class ='VfPpkd-vQzf8d'])[2]"));
		next_btn.click();

//		// To find password text field
//		WebElement pwd_tf = driver.findElement(By.xpath("//input[@aria-label = 'Password']"));
//		pwd_tf.sendKeys("NotPossible_0903");
//		Thread.sleep(5000);
				
	}
}
