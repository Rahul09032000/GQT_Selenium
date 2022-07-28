// WAS to display the current URL of Gmail Application

package com.gqt.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch6 {
	public static void main(String[] args) throws InterruptedException {
		
		// opening the Chrome Application
		System.setProperty("webdriver.chrome.driver", "E:\\GQT Softwares\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "https://www.gmail.com";
				
		// navigate to Gmail Application
		driver.get(url);
					
		// wait for 3 sec's
		Thread.sleep(3000);
		
		// Fetching the Current url of Gmail Application
		String c_url = driver.getCurrentUrl();
		System.out.println(c_url);
		
		// Close the Browser
		driver.close();
	}
}
