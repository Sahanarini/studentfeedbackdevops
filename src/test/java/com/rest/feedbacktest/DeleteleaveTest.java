package com.sahana.feedbacktest;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
public class DeleteleaveTest {
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
public void deleteleave() {
 driver.get("http://localhost:3000/");
 driver.manage().window().setSize(new Dimension(1051, 806));
 driver.findElement(By.linkText("Leave view")).click();
 driver.findElement(By.id("delete-btn")).click();
 driver.switchTo().alert().accept();
}
}

