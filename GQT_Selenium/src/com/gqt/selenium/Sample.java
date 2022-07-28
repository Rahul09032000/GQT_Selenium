//<input type="text" name="numbere" placeholder="Enter JIO Number" value="" required="" <br="">
//<input type="submit" name="submit" value="submit">
package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bit.ly/3NHWWpo");
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.name("numbere"));
		email.sendKeys("9164932931");
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();

	}
}
