package com.prasanthi.SeleniumTests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new MyDriver().getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/windows");
		String mainwindow = driver.getWindowHandle();
		WebElement link = driver.findElement(By.linkText("Click Here"));
		link.click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iter = handles.iterator();
		while(iter.hasNext())
		{
			String childwindow = iter.next();
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				String msgtext = driver.findElement(By.xpath("/html/body/div/h3")).getText();
				System.out.println(msgtext);
				driver.close();
			}
		}
		driver.switchTo().window(mainwindow);
		WebElement linktext = driver.findElement(By.linkText("Elemental Selenium"));
		if(linktext.getText().equalsIgnoreCase("Elemental Selenium"))
		{
			System.out.println("Back in Main window!");
		}
//		System.out.println(linktext.getText());
	}

}
