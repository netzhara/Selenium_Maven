package FPage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class HomePage {
	
	WebDriver driver = testcases.Base.driver;
	ExtentTest test = testcases.Base.test;
	
	@FindBy(linkText = "Log in")
	WebElement loginLink;
	
	@FindBy(name = "user_login")
	WebElement name;
	
	@FindBy(id="password")
	WebElement id;
	
	@FindBy(name="btn_login")
	WebElement loginBtn;
	
	@FindBy(className="rememberMe")
	WebElement rememberMe;
	
	/*
	 * @FindBy(className="content-sub-heading") WebElement errorMsg;
	 */
	
	
	
	public HomePage () {
		PageFactory.initElements(driver, this);
		
	}

	public void loginPage (String emailValue, String password) {
		
		loginLink.click();
		test.log(LogStatus.PASS, "Click on Login Link","Login Link clicked successfully");
		name.sendKeys(emailValue);
		test.log(LogStatus.PASS, "Enter Email/Username","Email/Username entered was successfully");
		id.sendKeys(password);
		test.log(LogStatus.PASS, "Enter Password"," Password entered was successfully");
		rememberMe.click();
		test.log(LogStatus.PASS, "Click on remember me"," clicked successfully");
		loginBtn.click();
		test.log(LogStatus.PASS, "Click on Login buttom","Login successfully");
	}
	
}
