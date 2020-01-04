package com.prasanthi.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException {
       
		MyDriver mydriver = new MyDriver();
		WebDriver driver = mydriver.getDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		Select month = new Select(driver.findElement(By.id("month")));
	month.selectByVisibleText("Apr");
		month.selectByIndex(3);
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(4);
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByIndex(5);
		Thread.sleep(5000);
		

	}
}
