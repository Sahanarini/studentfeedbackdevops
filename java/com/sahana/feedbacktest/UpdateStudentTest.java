package com.sahana.feedbacktest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UpdateStudentTest {
	WebDriver driver = new ChromeDriver();

	@Test
	public void test() {
		driver.get("http://localhost:3000/updateemp/1");
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("koyal");
		driver.findElement(By.name("batch")).clear();
		driver.findElement(By.name("batch")).sendKeys("2024");
		driver.findElement(By.id("btn-update")).submit();
	}

}
