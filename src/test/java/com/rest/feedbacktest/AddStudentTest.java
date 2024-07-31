package com.sahana.feedbacktest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddStudentTest {
	WebDriver driver = new ChromeDriver();

	@Test
	public void test() {
		driver.get("http://localhost:3000/createemp");
		driver.findElement(By.name("name")).sendKeys("mega");
		driver.findElement(By.name("dept")).sendKeys("cse");
		driver.findElement(By.name("batch")).sendKeys("2024");
		driver.findElement(By.name("lid")).click();
		{
			WebElement dropdown = driver.findElement(By.name("lid"));
			dropdown.findElement(By.xpath("//option[. = '4']")).click();
		}
		driver.findElement(By.id("submit")).submit();
	}

}
