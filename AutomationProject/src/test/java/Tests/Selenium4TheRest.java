package Tests;

import java.time.Duration;
import java.util.List;
import java.util.ResourceBundle.Control;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Selenium4TheRest {
	public static void main(String[] args) throws InterruptedException {
	
		//Set the Page load strategy .. Default is NORMAL, can be set to EAGER or NONE
	/*	ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	*/
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
			
		
	/*	//Drop Down Menu 
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.findElement(By.id("cookieChoiceDismiss")).click();	

		WebElement menu = driver.findElement(By.name("Month"));

		WebElement dropDown = driver.findElement(By.name("country"));

		Actions action = new Actions(driver);
		
		Select selectObj = new Select(dropDown);
		
		Select menuselectObj = new Select(menu);
		
	/*	// Get and save Drop Down menu in a list
		
		// this method find the whole options in the list using the Select object
		List<WebElement> allAvailableOptions = selectObj.getOptions();
		
		// this method find the whole options in the list using the webdriver object
		//List<WebElement> allAvailableOptions2 =  driver.findElements(By.name("country"));
		
		action.scrollToElement(menu).perform();
		
		for (WebElement option : allAvailableOptions)
		{
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("United Kingdom"))
				option.click();
		}
		
		Thread.sleep(1000);
	
	*/
		
	/*	// DropDown Option Selection
		
		selectObj.selectByIndex(1);
		Thread.sleep(1000);

		selectObj.selectByValue("EG");
		Thread.sleep(1000);

		selectObj.selectByVisibleText("United Kingdom");
		Thread.sleep(1000);
	*/
	
	/*	// Deselect an option from dropDown menu
		
		menuselectObj.selectByValue("Feb");
		Thread.sleep(1000);
		
		menuselectObj.selectByIndex(5);
		Thread.sleep(1000);


		menuselectObj.selectByVisibleText("October");
		Thread.sleep(1000);

		menuselectObj.deselectByVisibleText("October");
		Thread.sleep(1000);
		
	*/
		
	/*	//Mouse Actions
		//Move the mouse cursor to an element, click and hold, scroll, right click (contextClick), release the cursor from the element
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		driver.findElement(By.id("cookieChoiceDismiss")).click();		
		
		WebElement boxA = driver.findElement(By.xpath("//li[text()='A']"));
		WebElement boxD = driver.findElement(By.xpath("//li[text()='D']"));
		WebElement boxL = driver.findElement(By.xpath("//li[text()='L']"));

		Actions action = new Actions(driver);
		action.scrollToElement(boxL).perform();
		
		action.contextClick(boxL);
		action.doubleClick();

		
		action.moveToElement(boxA).clickAndHold();
		action.moveToElement(boxD).release().perform();
		Thread.sleep(1000);
	*/
	
			
	/*	//Drag and Drop Mouse Action Example
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		driver.findElement(By.id("cookieChoiceDismiss")).click();	

		WebElement srcElement = driver.findElement(By.id("draggable"));	
		WebElement desElement = driver.findElement(By.id("droppable"));	

		Actions action = new Actions(driver);
		action.dragAndDrop(srcElement, desElement);
		action.perform();
		
	*/	
		
	/*	//Keyboard Actions
		//Pressing a keyboard key through keydown() function
		
		driver.get("https://www.google.com/");
		
		// press reject all button
		driver.findElement(By.id("W0wltc")).click();
		
   		Actions action = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
		
		Thread.sleep(1000);
		
		// the 3 methods are correct by trials
		Action keydown = action.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydown.perform();
		
		Actions keydown2 = action.keyDown(Keys.CONTROL).sendKeys("a");
		keydown2.perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("a").perform();
		
		Thread.sleep(1000);
    */
		
		
	/*	//Releasing a Key through KeyUP() function,, and clearing the text
		Actions action = new Actions(driver);
		
		WebElement searchText = driver.findElement(By.name("q"));
		
		action.keyDown(Keys.SHIFT).sendKeys(searchText, "selenium").perform();
		
		action.keyDown(Keys.SPACE).keyUp(Keys.SHIFT).sendKeys(searchText, "selenium").perform();

		Thread.sleep(2000);

		// clear the search box text
		searchText.clear();
		
		Thread.sleep(2000);
	*/
		
		
	/*  //ALERTS JS 
		//JavaScript Alerts Check data Test Case
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(1000);
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		
		if(driver.getPageSource().contains("You successfully clicked an alert"))
		{
			System.out.println("JS Alert Test is Successful");
			System.out.println("=================================");
		}
		
		else
		{	
			System.out.println("JS Alert Test is failed");
		}
		
		
		// JAvaScript Alerts Confirming the dismess and accepting of alert
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(1000);
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		
		if(driver.getPageSource().contains("You clicked: Cancel"))
		{
			System.out.println("Alert Confirm Test is Successful");
			System.out.println("=================================");
		}
		
		else
		{	
			System.out.println("Alert Confirm Test is failed");
		}
		
		

		// JAvaScript Alerts Prompt with entering data
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(1000);
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Basma");
		alert3.accept();
		
		
		if(driver.getPageSource().contains("You entered: Basma"))
		{
			System.out.println("Alert Prompt Test is Successful");
			System.out.println("=================================");
		}
		
		else
		{	
			System.out.println("Alert Prompt Test is failed");
		}
	
		*/
		//driver.close();
		//driver.quit();
		
	}
}
