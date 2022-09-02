package com.gqt.whatsappautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsappProject {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		
		// Scan the QR Code within 10 Seconds
		Thread.sleep(60000);
		
		// Refreshing the web Page
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Linking the Excel File with Java
		FileInputStream fis = new FileInputStream("F:\\GQT_SeleniumWithJava\\MainProject_Whatsapp\\src\\com\\gqt\\whatsappautomation\\WhatsappProject.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for (int i=1; ; i++) 
		{
			Row row = sheet.getRow(i);
			
			if (row == null) 
			{
				break;
			}
			
			// To Fetch the Data From the Excel Sheet
			String phoneNum = new BigDecimal(row.getCell(0).toString()).toString();
			String message = row.getCell(1).toString();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			// To Identify the Search bar
			WebElement search_bar = driver.findElement(By.xpath("//div[@title='Search input textbox']"));
			Thread.sleep(5000);
			search_bar.sendKeys(phoneNum);
			search_bar.sendKeys(Keys.ENTER);
			Thread.sleep(10000);
			
			// To Identify the message bar
			WebElement message_bar = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text']"));
			Thread.sleep(10000);
			message_bar.sendKeys(message);
			message_bar.sendKeys(Keys.ENTER);
			
			System.out.println(phoneNum);
			System.out.println(message);
	
		}	
	}
}
