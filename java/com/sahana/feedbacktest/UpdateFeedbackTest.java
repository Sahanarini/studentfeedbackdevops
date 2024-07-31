package com.sahana.feedbacktest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateFeedbackTest {


	WebDriver driver = new ChromeDriver();

	@Test
	public void test() {
		driver.get("http://localhost:3000/update/5");
		driver.findElement(By.name("comment")).clear();
		driver.findElement(By.name("comment")).sendKeys("very good");
		driver.findElement(By.id("btn-update")).submit();
	}
}
