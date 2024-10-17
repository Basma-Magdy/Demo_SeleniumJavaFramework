package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import Pages.GoogleSearchPage;

public class ExtentReportWithTestNG {

	ExtentReports extent;
	
	@BeforeSuite
	public void SetUp() {
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("TestNGExtentReport.html");
		
		extent = new ExtentReports();
		extent.attachReporter(html);
		
	}
	@Test
	public void test1()
	{
		
		ExtentTest test = extent.createTest("Google Search TestNG");
		
		WebDriver driver = new ChromeDriver(); 
	    GoogleSearchPage GooSearObj = new GoogleSearchPage(driver);
	    
		test.info("Test Started");
		
		//Go to Google website
		driver.get("http://google.com");
		
		//Make the window full maximised
		driver.manage().window().maximize();
		
		//Click reject all for the cookies appeared page
		GooSearObj.RejectAll_Button();
		test.pass("RejectAll_Button");

		
		//Search for data
		GooSearObj.TextBoxSearch("Why Life is so hard ?");
		test.pass("TextBoxSearch");

		 //Press the search button
		 GooSearObj.ClickSearchButton();
		test.pass("ClickSearchButton");
		
		//Wait for 1.5 sec.
		//Thread.sleep(1500);
		driver.close();
		test.pass("Closed the browser");
		test.info("Test Completed");
		
	}
	
	
	@AfterSuite
	public void TearDown() {
		extent.flush();
			
	}
}
