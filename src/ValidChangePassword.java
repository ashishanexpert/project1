// This script shows the execution of modification of change password sub module in the personalPage with valid details


import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;


public class ValidChangePassword {
	
	WebDriver driver;
	
  @Test
  public void changePassword() {

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

 

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("http://localhost:8585/do/login");
  }

 
}
