package com.sahana.feedbacktest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class leavetest {

	WebDriver driver = new ChromeDriver();
	@Test
	public void test() {
		driver.get("http://localhost:3000/create");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("type")).sendKeys("stomach ache");
		//driver.findElement(By.name("password")).sendKeys("Aravind200317$");
		driver.findElement(By.id("btn-ty")).submit();
	}

}
