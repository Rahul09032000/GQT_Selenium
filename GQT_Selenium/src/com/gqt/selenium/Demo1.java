// Scenario to be Automated 
// 1 - Open the Chrome Browser
// 2 - Navigate to https://www.webmath.com/ website
// 3 - Click on General Math
// 4 - Under dropdown select the Interest, simple
// 5 - Enter the principal Amount
// 6 - Enter the percent of Interest
// 7 - Enter the year
// 8 - Click on Find the amount of Interest Button
// 9 - wait for 5 seconds
//10 - close the Browser

/*
 * HTML Code for General Math - 
 * <a href="/index2.html" title="General Math">General Math</a>
 * 
 * HTML Code for Interest Simple - 
 * <select style="margin:0px 0px 0px 5px;width:305px;" onchange="redirectPageAction()" name="topicItem" id="topicItem">
 * <option value="simpinterest.html">Interest, Simple</option>
 * 
 * HTML Code for Principal Amount - 
 * <input type="text" name="principal" maxlength="10" size="10">
 * 
 * HTML Code for Percent of Interest - 
 * <input type="text" name="interest" maxlength="10" size="10">
 * 
 * HTML Code for year -
 * <input type="text" name="desired_time" maxlength="5" size="5">
 * 
 * HTML Code for Find the amount of Interest Button
 * <input type="submit" value="Find the amount of interest"> 
 */
package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		// Open the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Navigate to https://www.webmath.com/ website
		driver.get("https://www.webmath.com/");
		
		// Click on General Math
		WebElement general_math_link = driver.findElement(By.linkText("General Math"));
		general_math_link.click();
		
		// Under dropdown select the Interest, simple
		Select drop_down = new Select(driver.findElement(By.cssSelector("Select[id *= 'topicItem']")));
		drop_down.selectByVisibleText("Interest, Simple");
		
		// Enter the principal Amount
		WebElement princial_amount = driver.findElement(By.name("principal"));
		princial_amount.sendKeys("10000");
		
		// Enter the percent of Interest
		WebElement persent_interest = driver.findElement(By.name("interest"));
		persent_interest.sendKeys("10");
		
		// Enter the year
		WebElement year = driver.findElement(By.name("desired_time"));
		year.sendKeys("1");
		
		// Click on Find the amount of Interest Button
		WebElement find_interest = driver.findElement(By.cssSelector("input[value='Find the amount of interest']"));
		find_interest.click();
		
		// wait for 5 seconds
		Thread.sleep(5000);
		
		// close the Browser
		driver.close();
		
	}

}
