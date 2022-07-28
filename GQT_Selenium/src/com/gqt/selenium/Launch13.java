// Same Script as Launch12 but Enhanced Code using Run Time Polymorphism
package com.gqt.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch13 {
	
	
	public static void test(WebDriver driver) {
		driver.get("https://www.gmail.com");
		String title = driver.getTitle();
		System.out.println(title);
		String c_url = driver.getCurrentUrl();
		System.out.println(c_url);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the name of the Browser : chrome/firefox ");
		Scanner scan = new Scanner(System.in);
		String browser = scan.next();
		if (browser.equals("chrome")) {
			WebDriver c = new ChromeDriver();
			test(c);
		}
		else if(browser.equals("firefox")) {
			WebDriver f = new FirefoxDriver();
			test(f);
		}
		else {
			System.out.println("Invalid browser name......Please try again ");
		}
	}
}
