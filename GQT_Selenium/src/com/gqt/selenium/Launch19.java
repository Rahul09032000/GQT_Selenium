// WAS to navigate to Facebook application and click on "Forgotten Password?" Link using "Partial Linktext" locator

// HTML Code for forgotten Password? link -
// <a href="https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90
//  aW1lIjoxNjU5MDE5NDQ2LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&amp;ars=facebook_login">Forgotten password?</a>

package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch19 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		//WebElement f_p = driver.findElement(By.partialLinkText("Forgotten"));
		//WebElement f_p = driver.findElement(By.partialLinkText("password?"));
		//WebElement f_p = driver.findElement(By.partialLinkText("password"));
		WebElement f_p = driver.findElement(By.partialLinkText("?"));
		f_p.click();
		Thread.sleep(5000);
		driver.close();
	}
}
