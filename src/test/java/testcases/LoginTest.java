package testcases;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import FPage.HomePage;



public class LoginTest extends Base {
	
	@Test
	public  void loginFailureTest() {
		
		HomePage login = new HomePage ();
		
		login.loginPage("xyz@abc.com", "Abc@12345");
		
		WebElement errorMsg = driver.findElement(By.className("content-sub-heading"));
		String actualMsg = errorMsg.getText();
		String expMsg = "Log in to continue learning";
		
		Assert.assertEquals(actualMsg, expMsg);
		
	}
	
	@Test
	public  void loginSuccessTest () {
		
		HomePage login = new HomePage ();
		
		login.loginPage("tipyana@rocketmail.com", "Mwakapiso7");
	}
	
	@Test
	@Parameters({"email","password1"})
	public void parameterTest(String emailValue, String password) {
		
		HomePage login = new HomePage ();
		login.loginPage(emailValue,password);
	}
	
	@Test
	public void ExternalDataTest() {
		
		String emailValue = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		HomePage login = new HomePage();
		login.loginPage(emailValue,password);		
	}

	
}
