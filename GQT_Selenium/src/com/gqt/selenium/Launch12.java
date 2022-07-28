// WAS to display the title, current url from Gmail Application either by
// using chrome or firefox browser based on the input provided by the user 

// Code without Using the Run Time Polymorphism 
package com.gqt.selenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch12 {
	
	
	public static void test(ChromeDriver driver) {
		driver.get("https://www.gmail.com");
		String title = driver.getTitle();
		System.out.println(title);
		String c_url = driver.getCurrentUrl();
		System.out.println(c_url);
	}
	
	public static void test(FirefoxDriver driver) {
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
			ChromeDriver c = new ChromeDriver();
			test(c);
		}
		else if(browser.equals("firefox")) {
			FirefoxDriver f = new FirefoxDriver();
			test(f);
		}
		else {
			System.out.println("Invalid browser name......Please try again ");
		}
	}
}
