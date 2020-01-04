package com.prasanthi.SeleniumTests;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class windowAlerts {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		MyDriver myDriver = new MyDriver();
		WebDriver driver = myDriver.getDriver();
		/*
		 * to handle alerts
		 * driver.get("http://demo.guru99.com/test/delete_customer.php");
		 * driver.findElement(By.name("cusid")).sendKeys("12345");
		 * driver.findElement(By.name("submit")).click(); //
		 * System.out.println(driver.switchTo().alert().getText()); Alert alert =
		 * driver.switchTo().alert(); alert.accept();
		 * System.out.println(driver.switchTo().alert().getText());
		 */
		/* to handle mutiple widows */
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		String mainwindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iter = windowHandles.iterator();
		while (iter.hasNext()) {
			String childwindow = iter.next();
			if (!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();

			}

		}
		driver.switchTo().window(mainwindow);
		driver.close();

	}

}
