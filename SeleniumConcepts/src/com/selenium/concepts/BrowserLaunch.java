package com.selenium.concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabarish\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("abc.gmail.com");
	
	WebElement passw = driver.findElement(By.name("pass"));	
	passw.sendKeys("123456");
	
	WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
	login.click();
	
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File srcFile=ts.getScreenshotAs(OutputType.FILE);
	File desFile= new File("C:\\Users\\Sabarish\\eclipse-workspace\\SeleniumConcepts\\Screenshot.Test.png");
	FileUtils.copyFile(srcFile, desFile);
	
	
	
	
	
	}
	
	
}
