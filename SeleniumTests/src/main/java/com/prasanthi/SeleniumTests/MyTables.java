package com.prasanthi.SeleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyTables {

	public static void main(String[] args) {
		WebDriver driver = new MyDriver().getDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		WebElement table2 = driver.findElement(By.cssSelector("#table2"));
		int rows = table2.findElements(By.cssSelector("#table2>tbody>tr")).size();
		List<WebElement> rowspresent = table2.findElements(By.cssSelector("#table2>tbody>tr"));
		for (WebElement row : rowspresent) {
			row.findElement(By.cssSelector("td:nth-of-type(5)")).getText();
			System.out.println(row.findElement(By.cssSelector("td:nth-of-type(5)")).getText());
			System.out.println(row.findElement(By.cssSelector("td:nth-of-type(1)")).getText() + " "
					+ row.findElement(By.cssSelector("td:nth-of-type(2)")).getText());

		}

//			String text = driver.findElement(By.cssSelector("#td:nth-of-type(5)")).getText();
//			System.out.println(text);
//			
//		}
	}

}
