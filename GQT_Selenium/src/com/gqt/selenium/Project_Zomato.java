package com.gqt.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_Zomato {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		WebElement login_btn = driver.findElement(By.linkText("Log in"));
		login_btn.click();
		Thread.sleep(5000);

		WebElement phone_textField = driver.findElement(By.xpath("//*[@id=\"id-74\"]/section[2]/section/div[1]/div/input"));
		phone_textField.sendKeys("9164932931");

		WebElement login_btn2 = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-3 gXvQtR']"));
		login_btn2.click();
		Thread.sleep(10000);
		
//		WebElement send_otp = driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/div[2]/a"));
//		Thread.sleep(10000);
//		
//		driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/div[2]/a")).click();
//	
	}
}
