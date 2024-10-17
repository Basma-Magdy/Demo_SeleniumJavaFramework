package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestingPage {
	
	
 WebDriver driver1 = null;
	
	By UserName_locator = By.xpath("//input[@name='username']");
	By Password_locator = By.xpath("//input[@name='password']");
	By LoginButton_Locator = By.xpath("//input[@value='Log In']");
	
	public TestingPage(WebDriver driver) {
		this.driver1 = driver;
	}

	
	
	//Find the user name Method and provide it with data
	public void loginUsername( String userName) {
	
		driver1.findElement(UserName_locator).sendKeys(userName);
	}
	
	
	//Find the user name Method and provide it with data
	public void loginPassword( String password) {
	
		driver1.findElement(Password_locator).sendKeys(password);
	}
	
	//Find the Search Button Method
	public void ClickLoginButton() {
		
	    driver1.findElement(LoginButton_Locator).click();
	}

	

}
