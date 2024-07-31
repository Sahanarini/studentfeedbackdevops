package com.sahana.feedbacktest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteStudentTest {

	WebDriver driver = new ChromeDriver();

	 @Test
	  public void deletestudent() {
	    driver.get("http://localhost:3000/");
	    driver.manage().window().setSize(new Dimension(1552, 840));
	    driver.findElement(By.linkText("students")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(5) .ms-1")).click();
	    driver.switchTo().alert().accept();
	  }

}

