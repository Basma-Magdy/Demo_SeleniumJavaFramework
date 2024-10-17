package Tests;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Configuration.ConfigurationClass;
import Logging.Log4jDemo;
import Pages.GoogleSearchPage;

public class GoogleSearchTest 
{	
	/* define headless browser */
	ChromeOptions options = new ChromeOptions(); 
	static WebDriver driver;
	public static String browser;
	
	//static Logger logger = LogManager.getLogger(Log4jDemo.class);


	@BeforeTest
	public void  SetUpTest() {

		ConfigurationClass.setProperties();
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		/* make browser headless without a gui , we can search for the chrome options list of arguments so we can add lots of options
		 *  to chrome gui otherthan headless // or from desired capabilities of chrome browser*/
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
		driver = new FirefoxDriver();
		}
		
	}

	
	
	@Test
	public static void GoogleSearch() {
		try {
			GoogleSearchPage GooSearObj = new GoogleSearchPage(driver);
			By LinkLocator = By.partialLinkText("10 Reasons Why Life Is so Hard");
			
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//logger.info("Test Started");
			
			
			/* implicit wait Example, wait if you can't find any element locator before arising the exception */
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.get("http://google.com");
			//driver.manage().window().maximize();
			GooSearObj.RejectAll_Button();
			GooSearObj.TextBoxSearch("Why Life is so hard ?");
			GooSearObj.ClickSearchButton();
			
			
			/* explicit wait Example, wait until the condition is met ( link is clicked) */ 
			WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement LinkElement = explicitwait.until(ExpectedConditions.elementToBeClickable(LinkLocator));
			LinkElement.click();
		
			

			/* FLuent wait example, like explicit but we can choose the polling time and the exception to ignore */
			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
											.withTimeout(Duration.ofSeconds(10))
											.pollingEvery(Duration.ofSeconds(1))
											.ignoring(NoSuchElementException.class);
											
							
		
			fluentWait.until(ExpectedConditions.elementToBeSelected(By.id("abcd")));

			//Wait for 1.5 sec.
			//Thread.sleep(1500);
			
			//driver.findElement(By.id("abcd")).click();
			//logger.warn("This is a warning message");
		}
		catch(Exception exp)
		{

			System.out.println("I'm inside catch" + exp.getMessage());

		}
	}

	@Ignore
	@Test
	public static void GoogleSearch2() throws Exception {

		//GoogleSearchPage GooSearObj = new GoogleSearchPage(driver);

		//Go to Google website
		driver.get("http://youtube.com");

		//Make the window full maximised
		driver.manage().window().maximize();

		//Click reject all for the cookies appeared page
		//GooSearObj.RejectAll_Button();


		//Search for data
		//GooSearObj.TextBoxSearch("Hi Hi Hi ChatGPT ?");

		//Press the search button
		//GooSearObj.ClickSearchButton();


		//Wait for 1.5 sec.
		Thread.sleep(1500);
	}

	@AfterTest
	public void TearDownTest()
	{
		ConfigurationClass.setProperties();
		//close browser
		driver.close();
		
	}
}
