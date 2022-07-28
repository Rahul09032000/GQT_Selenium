// WAS to maximize the chrome browser window

package com.gqt.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch8 {
	public static void main(String[] args) throws InterruptedException {
		
		// opening the Chrome Application
		System.setProperty("webdriver.chrome.driver", "E:\\GQT Softwares\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "https://www.gmail.com";
		
		// maximize the chrome browser window
		driver.manage().window().maximize();
		
		// navigate to Gmail Application
		driver.get(url);
					
		// wait for 3 sec's
		Thread.sleep(3000);
		
		// Close the Browser
		driver.close();
	}
}
