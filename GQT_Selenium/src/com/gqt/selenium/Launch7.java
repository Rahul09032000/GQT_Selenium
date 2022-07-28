// WAS to display the source code of current web page

package com.gqt.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch7 {
	public static void main(String[] args) throws InterruptedException {
		
		// opening the Chrome Application
		System.setProperty("webdriver.chrome.driver", "E:\\GQT Softwares\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "https://www.gmail.com";
				
		// navigate to Gmail Application
		driver.get(url);
					
		// wait for 3 sec's
		Thread.sleep(3000);
		
		// Fetching the source code of Gmail Application
		String c_source = driver.getPageSource();
		System.out.println(c_source);
		
		// Close the Browser
		driver.close();
	}
}
