package step_definition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class modify_profile {
	WebDriver driver;
	
	@Given("^Click on profile icon and click change button and clear the address textbox$")
	public void click_on_profile_icon_and_click_change_button_and_clear_the_address_textbox() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			
		
	}

	@When("^Enter the valid credentials in the address textbox$")
	public void enter_the_valid_credentials_in_the_address_textbox() throws Throwable {
		 driver.get("http://localhost:8585/do/login");
		 driver.findElement(By.id("cyclosUsername")).sendKeys("Nikki");
		  driver.findElement(By.xpath("//input[@value='1']")).click();
		  driver.findElement(By.xpath("//input[@value='2']")).click();
		  driver.findElement(By.xpath("//input[@value='3']")).click();
		  driver.findElement(By.xpath("//input[@value='4']")).click();
		  driver.findElement(By.xpath("//input[@value='5']")).click();
		  
		  driver.findElement(By.xpath("//input[@value='Submit']")).click();
		  
		  driver.findElement(By.xpath("//span[text()='Personal']")).click();
		 
		  driver.findElement(By.xpath("//span[text()='Profile']")).click();
		  driver.findElement(By.id("modifyButton")).click();
		  driver.findElement(By.xpath("//input[@fieldname='address']")).clear();
		  //driver.findElement(By.className("large InputBoxEnabled")).clear();
		  driver.findElement(By.xpath("//input[@fieldname='address']")).sendKeys("hyderabad");
		  driver.findElement(By.id("saveButton")).click();
		 
	    
	}

	@Then("^Click on submit button and ok button on popup window$")
	public void click_on_submit_button_and_ok_button_on_popup_window() throws Throwable {
		
		 Alert alert = driver.switchTo().alert();
		 String exp="Profile modified";
		  String act= alert.getText();
		  Assert.assertEquals(exp, act);
		  System.out.println(act);
		  alert.accept();
		
		  
				  
	   
	}



}
