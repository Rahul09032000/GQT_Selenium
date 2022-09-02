package com.gqt.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_Flipkart 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
		//To find email text field
		driver.findElement(By.xpath("//input[@ class = '_2IX_2- VJZDxU']")).sendKeys("9164932931");
		
		//To find password text field
		driver.findElement(By.xpath("//input[@ class = '_2IX_2- _3mctLh VJZDxU']")).sendKeys("NotPossible_0903");
		
		//To click on Login button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		Thread.sleep(5000);
		
		//Refreshing the browser
		driver.navigate().refresh();
		
		//To find search bar field
		WebElement search_bar = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		search_bar.sendKeys("Mens Sunglasses");
		search_bar.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		//Refreshing the browser
		driver.navigate().refresh();
		Thread.sleep(5000);            
		
//		try {
//		//To find and tick special price field
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/section[6]/div[2]/div/div[2]/div/label/div[2]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		}
//		
//		catch (Exception e){
//			
//		}
		
		//To click on selected product
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div[1]/div/div")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Code to fetch the address of Parent Tab as well as Child Tabs
		Set<String> p_c_addr = driver.getWindowHandles();
		ArrayList<String> a = new ArrayList<String>(p_c_addr);
		driver.switchTo().window(a.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/*
		//To click on popup
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div[1]/div[2]/div/div[2]/div/span/div/div")).click();
		
		//To enter the pincode
		WebElement p_code = driver.findElement(By.xpath("//*[@id=\"pincodeInputId\"]"));
		p_code.sendKeys("590001");
		p_code.sendKeys(Keys.ENTER);
		*/
		
		// Selecting Size
		//driver.findElement(By.xpath("//*[@id=\"swatch-5-size\"]/a")).click();
		
		
		//To add to cart
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		Thread.sleep(10000);
		
		//Place order button
		driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2ObVJD _3AWRsL']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Continue Button
		driver.findElement(By.xpath("//*[@id=\"to-payment\"]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//selecting COD button
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[1]/div/label[6]/div[1]")).click();
		Thread.sleep(10000);
		
		//confirm order button
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[1]/div/label[5]/div[2]/div/div/div[3]/form/button/span")).click();
		
		// Cancelling the same order
		
		// Switching to alert window
//		Alert alert1 = driver.switchTo().alert();
//		alert1.dismiss();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// To click on deny button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/button[1]")).click();
		
		// To click on cancel button
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div/div/div[3]/div[1]/div[3]/div[2]/div[1]/span/span")).click();
		
		// If asked cancel Confirmation
		try {
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div[3]/div/button[1]")).click();
		}
		catch (Exception e){
			
		}
		
		// To Select from Dropdown
		Select se = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div[1]/div[1]/div/div/div/div[1]/div[2]/div/select")));
		se.selectByVisibleText("I have changed my mind");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div[1]/div[1]/div/div/div/div[3]/div[2]/textarea")).sendKeys("I have changed my mind");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div[1]/div[1]/div/div/div/div[4]/button/span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// To click on request cancellation button
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div[1]/div[2]/div/div/div/div/div/div/label[1]/div[2]/div/button/span")).click();
		Thread.sleep(10000);
		
		driver.close();
			
	}
}
