// WAS to navigate to Facebook Application and type the email in the email field and password in password field using
// "name" Locator

// Link - https://www.facebook.com
// Email - rahulmahendrakar09@gmail.com
// Password - rahulrahul

// HTML CODE FOR EMAIL WEB ELEMENT -
//		<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" 
//			   placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">
// HTML CODE FOR PASSWORD WEB ELEMENT -
//		<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal_pass" 
//			   placeholder="Password" aria-label="Password">


package com.gqt.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch16 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.name("email"));
		e.sendKeys("rahulmahendrakar09@gmail.com");
		WebElement p = driver.findElement(By.name("pass"));
		p.sendKeys("rahulrahul");
	}
}
