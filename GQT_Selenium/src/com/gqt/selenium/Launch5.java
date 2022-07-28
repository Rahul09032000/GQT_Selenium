// WAS to verify the title of Gmail Application

package com.gqt.selenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch5 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the Title : ");
		Scanner sc = new Scanner(System.in);
		String e_title = sc.next();
		
		// opening the Chrome Application
		System.setProperty("webdriver.chrome.driver", "E:\\GQT Softwares\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "https://www.gmail.com";
		
		// navigate to Gmail Application
		driver.get(url);
				
		// wait for 3 sec's
		Thread.sleep(3000);
		
		// fetch the title of the Gmail Application
		String a_title = driver.getTitle();
		
		// Displaying the both Expected and Actual Title
		System.out.println("Expected Title - "+e_title);
		System.out.println("Actual Title - "+a_title);
		
		// Comparing the title of Gmail Application
		if (e_title.equals(a_title)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
				
		// close the Browser
		driver.close();

	}
}
