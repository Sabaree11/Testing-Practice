package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browprac {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sabarish\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);

		
		WebElement email = driver.findElement(By.name("username"));
		email.sendKeys("abc@gmail.com");
		Thread.sleep(3000);

		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("123454");
		Thread.sleep(3000);

		WebElement login = driver.findElement(By.xpath("(//button[contains(@class,'sqdOP ')])[2]"));
		login.click();
		
		
		

	
	
	
	
	
	
	
	
	
	
	}
}
