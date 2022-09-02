package com.gqt.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project_Instagram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		// To open browser and navigate to Instagram
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		// To find e-mail text field
		WebElement un_tf = driver.findElement(By.xpath("//input[@aria-label = 'Phone number, username, or email']"));
		un_tf.sendKeys("---Enter your User Name Here---");
		
		// To find password text field
		WebElement pwd_tf = driver.findElement(By.xpath("//input[@aria-label = 'Password']"));
		pwd_tf.sendKeys("---Enter your Password here---");
		Thread.sleep(5000);
		
		// To find login Button
		WebElement login_btn = driver.findElement(By.xpath("//div[@class = '             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm                                                                                                              ']"));
		login_btn.click();
		Thread.sleep(10000);
		
		// To click on not now button
		WebElement notNow_btn = driver.findElement(By.xpath("//button[@class = 'sqdOP yWX7d    y3zKF     ']"));
		notNow_btn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		// To click on not now button
		WebElement notNow1_btn = driver.findElement(By.xpath("//button[@class = '_a9-- _a9_1']"));
		notNow1_btn.click();
		
		// To refresh the Page
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		// To identify the search bar
		WebElement search_bar = driver.findElement(By.xpath("//input[@aria-label = 'Search input']"));
		search_bar.sendKeys("Rupesh Shetty");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		// To click on 1st Profile
		WebElement profile1 = driver.findElement(By.xpath("(//div[@class='_aacl _aaco _aacw _adda _aacx _aad6'])[1]"));
		profile1.click();
		Thread.sleep(30000);
		
		// To click the follow button
		WebElement follow_btn = driver.findElement(By.xpath("//div[@class = '_aacl _aaco _aacw _adda _aad6 _aade']"));
		follow_btn.click();
		Thread.sleep(10000);
		
		// To click the profile button
		WebElement profile_btn = driver.findElement(By.xpath("//span[@class= '_aa8h _aa8i']"));
		profile_btn.click();
		Thread.sleep(10000);
		
		// To click on the Logout Button
		WebElement logout_btn = driver.findElement(By.xpath("(//div[@class='_aacl _aaco _aacu _aacx _aada'])[9]"));
		logout_btn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(5000);
		
		System.out.println("Project - Instagram Executed Successfully");
		driver.close();
	
	}
}
