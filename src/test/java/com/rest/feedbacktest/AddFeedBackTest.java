package com.sahana.feedbacktest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddFeedBackTest {

	WebDriver driver = new ChromeDriver();

	@Test
	public void test() {
		driver.get("http://localhost:3000/create");
		driver.findElement(By.name("comment")).sendKeys("very bad");
		driver.findElement(By.id("btn-ty")).submit();
	}

}
