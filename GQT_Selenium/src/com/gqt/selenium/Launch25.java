// WAS to open Chrome Browser and navigate to Gmail application and type email using css Selectors [Substring - endswith]

// HTML Code for forgotten Password? link -
//		<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" 
//			tabindex="0" aria-label="Email or phone" name="identifier" autocapitalize="none" id="identifierId" dir="ltr" 
//			data-initial-dir="ltr" data-initial-value="">

// Syntax - "tagname[attribute_name $= 'attribute_value']"
// "input[id $= 'erID']"

package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch25 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.cssSelector("input[name $='fier']"));
		email.sendKeys("rahulmahendrakar09@gmail.com");
		Thread.sleep(3000);
		driver.close();
	}
}
