package Tests;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Selenium4WebElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		
		driver.get("https://trytestingthis.netlify.app/");

	/*	//Get element tag name, css, text and so on
		WebElement elemnt = driver.findElement(By.xpath("//input[@id = 'a']"));
		System.out.println("Element Text is : " + elemnt.getText());
		System.out.println("Element tag  is : " + elemnt.getTagName());
		System.out.println("Element Color is : " + elemnt.getCssValue("color"));
	*/
		
	/*	//check element is enabled , selected or not
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		WebElement element = driver.findElement(By.xpath("(//input[@type ='checkbox'])[2]"));
		System.out.println("Element is enabled ? "+element.isEnabled());
		System.out.println("Element is selected ? " +element.isSelected());

	*/	
		
	/*	    // Relative Locators example 
			WebElement element = driver.findElement(By.id("fname"));
			driver.findElement(RelativeLocator.with(By.tagName("input")).below(element)).sendKeys("Elakkad");
			
			// Get the list of items in the the list by find elements 
			List <WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
			
			//as long as there is a web element in the options list, print its text 
			for ( WebElement element1 : options)
			{
			System.out.println(element1.getText());	
			}
	*/
		
	/*	//find element from inside another element section(finds element within element) .. BUT WORKS WRONG !!!!
		WebElement element2 = driver.findElement(By.id("owc"));
		element2.findElement(By.xpath("//option[@value = 'option 1']")).click();
		
	*/

	/*	driver.navigate().to("http://google.com");
		
		// press reject all button
		driver.findElement(By.id("W0wltc")).click();
		
		//Keys.ENTER => to press enter after writing this text 
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("How to get software tester job", Keys.ENTER);
	*/
		
	/*
		// find an active element attributes ( Active element is the element Iam using currently in my app in some action )
		driver.navigate().to("http://google.com");	
		// press reject all button
		driver.findElement(By.id("W0wltc")).click();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Basma Beautiful Hand Writing Pictures");
		Thread.sleep(3000);
		String attribute = driver.switchTo().activeElement().getAttribute("title");
		System.out.println("Title is " + attribute);
	*/
		driver.close();
		
	}
}
