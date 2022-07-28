// WAS to navigate to Facebook Application and type the password in the password field using "class" locator

// Link - https://www.facebook.com
// Password - rahulrahul

// HTML CODE FOR PASSWORD WEB ELEMENT -
//		<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal_pass" 
//			   placeholder="Password" aria-label="Password">

package com.gqt.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch17 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.className("inputtext"));
		e.sendKeys("rahulrahul");
	}
}
