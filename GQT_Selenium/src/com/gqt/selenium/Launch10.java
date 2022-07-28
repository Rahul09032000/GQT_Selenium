// WAS to open Chrome browser by adding chromedriver by using environment variables

package com.gqt.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch10 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.close();
	}
}