// WAS to open the chrome browser by adding the chromedriver using System.setProperty() method

package com.gqt.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\GQT Softwares\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	}
}
