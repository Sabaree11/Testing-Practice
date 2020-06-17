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

public class Browserpract {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sabarish\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("Tamil Songs");
		
		
		
		WebElement Searchbut = driver.findElement(By.id("search-icon-legacy"));
		Searchbut.click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File desFile= new File("C:\\Users\\Sabarish\\eclipse-workspace\\SeleniumConcepts\\Screenshot.png");
		FileUtils.copyFile(srcFile, desFile);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
