package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabarish\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");

	WebElement Move = driver.findElement(By.xpath("//a[@class='sf-with-ul']"));
	Actions ac= new Actions(driver);
	ac.moveToElement(Move).perform();
	Thread.sleep(2000);
	
	WebElement Tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
	Tshirt.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
