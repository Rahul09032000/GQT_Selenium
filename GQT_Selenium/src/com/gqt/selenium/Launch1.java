// WAS to open the firefox browser by adding the geckodriver using System.setProperty() method

package com.gqt.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\GQT Softwares\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	}
}
