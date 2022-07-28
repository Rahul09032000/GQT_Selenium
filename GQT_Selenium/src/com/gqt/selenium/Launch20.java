// WAS to open Chrome Browser and navigate to Facebook application and type email using css Selectors [tag and id]

// HTML Code for forgotten Password? link -
//		<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" 
//			   placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">

// Tag - input, ID - email
// "input#email"

package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch20 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("rahulmahendrakar09@gmail.com");
		Thread.sleep(3000);
		driver.close();
	}
}
