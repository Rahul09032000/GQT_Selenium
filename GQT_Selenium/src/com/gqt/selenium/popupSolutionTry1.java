package com.gqt.selenium;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popupSolutionTry1 {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		

	}

}
