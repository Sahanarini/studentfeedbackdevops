package com.sahana.feedbacktest;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class AddStudentFailureTest {
	WebDriver driver = new ChromeDriver();
	@Test
	public void addProd() throws
	InterruptedException{
		driver.get("http://localhost:3000/createemp");
		driver.findElement(By.name("name")).sendKeys("");
		driver.findElement(By.name("dept")).sendKeys("cse");
		driver.findElement(By.name("batch")).sendKeys("2024");
		driver.findElement(By.id("submit")).submit();
		Alert alert = driver.switchTo().alert(); // switch to alert
		String alertMessage = driver.switchTo().alert().getText(); // capture alert message
		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(5000);
		alert.accept();
	}
 
}
