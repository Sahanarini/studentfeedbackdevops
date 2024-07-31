package com.sahana.feedbacktest;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddFeedbackFailureTest {

	WebDriver driver = new ChromeDriver();
	 
	@Test
	public void addProd() throws
	InterruptedException{
		driver.get("http://localhost:3000/create");
		driver.findElement(By.name("comment")).sendKeys("");
		driver.findElement(By.id("btn-ty")).submit();
		Alert alert = driver.switchTo().alert(); // switch to alert
		String alertMessage = driver.switchTo().alert().getText(); // capture alert message
		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(5000);
		alert.accept();
	}

}

