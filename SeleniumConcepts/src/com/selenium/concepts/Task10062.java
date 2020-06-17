package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10062 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabarish\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	
		WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
		Signin.click();
		Thread.sleep(2000);

		
		WebElement Email = driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[1]"));
		Email.sendKeys("sabare@gmail.com");
		Thread.sleep(2000);
		
		WebElement Createbut = driver.findElement(By.id("SubmitCreate"));
		Createbut.click();
		Thread.sleep(2000);
		
		WebElement Gender = driver.findElement(By.id("id_gender1"));
		Gender.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
