package com.prasanthi.SeleniumTests;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFormLocators {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("santhigtv@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Tester2020");
		driver.findElement(By.xpath("//input[starts-with(@id,'u_0_')]")).submit();
		driver.navigate().refresh();
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		
	    
//		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(20))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(NoSuchElementException.class);
//		wait.until((driver)->driver.findElement(By.id("userNavigationLabel")));
		
	}

}
