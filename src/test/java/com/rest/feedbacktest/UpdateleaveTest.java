package com.sahana.feedbacktest;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

public class UpdateleaveTest {
	private WebDriver driver;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void updateleave() {
		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1056, 808));
		driver.findElement(By.linkText("Leave view")).click();
		driver.findElement(By.linkText("update")).click();
		driver.findElement(By.name("type")).click();
		driver.findElement(By.name("type")).sendKeys("festival days");
		driver.findElement(By.cssSelector(".btn")).click();
	}
}