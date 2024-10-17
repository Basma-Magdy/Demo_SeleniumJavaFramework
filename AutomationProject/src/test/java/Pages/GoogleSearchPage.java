package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver1 = null;
	
	By TextBoxSearch_locator = By.id("APjFqb");
	By SearchButton_Locator = By.className("gNO89b");
	By RejectAllButton_Locator = By.xpath("//button[@id='W0wltc']");
	
	public GoogleSearchPage(WebDriver driver) {
		
		this.driver1 = driver;
	}
	
	
	//Find the Text Box Search bar Method
	public void TextBoxSearch(String SearchText) {
	
		driver1.findElement(TextBoxSearch_locator).sendKeys(SearchText);
	}
	
	
	//Find the Search Button Method
	public void ClickSearchButton() {
		
	    driver1.findElement(SearchButton_Locator).click();
	}

	
	// Find the Reject all button of the consent page
	
	public void RejectAll_Button() {
		
	  driver1.findElement(RejectAllButton_Locator).click();
		
	}
		
	
	
	// Search for the input tags in the page and save them in list then print this list size
	/*
	 List<WebElement> InputsList=driver.findElements(By.xpath("//input"));
	 int InputsListSize=InputsList.size();
	 System.out.println("InputsListSize is : " + InputsListSize);
*/
	
}
