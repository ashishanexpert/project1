// This program shows the modification of the password


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Test1 {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	 
	  
	  
	 
	  driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@value='1']")).click();
	  driver.findElement(By.xpath("//input[@value='2']")).click();
	  driver.findElement(By.xpath("//input[@value='3']")).click();
	  driver.findElement(By.xpath("//input[@value='4']")).click();
	  driver.findElement(By.xpath("//input[@value='Submit']")).click();
	   
	  driver.findElement(By.xpath("//span[text()='Personal']")).click();
	  driver.findElement(By.xpath("//span[text()='Change Password']")).click();
	  driver.findElement(By.name("oldPassword")).sendKeys("1234");
	  driver.findElement(By.name("newPassword")).sendKeys("12345");
	  driver.findElement(By.name("newPasswordConfirmation")).sendKeys("12345");
	  driver.findElement(By.className("button")).click();
	  
	  String expTitle= "The password was modified";
	  Alert alert = driver.switchTo().alert();
	  String actual = alert.getText();
	  assertEquals(actual,expTitle);
	  System.out.println(actual);
	 	  
	  
  }
  
  @AfterMethod
  public void afterMethod()
  {
	 // String expTitle= "Password Modified";
	  //Alert alert = driver.switchTo().alert();
	  //String actual = alert.getText();
	 // assertEquals(actual, expTitle);
	   
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 driver.get("http://localhost:8585/do/login");
	 
  }

 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	 //driver.close();
  }

}
