package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.GoogleSearchPage;

public class ExtentReport_DesiredCapabilities {
	
	public static void main(String[] args) {
	
			DesiredCapabilities props = new DesiredCapabilities();			
	
			WebDriver driver = new ChromeDriver();
			
		    GoogleSearchPage GooSearObj = new GoogleSearchPage(driver);

		    
		    ExtentHtmlReporter html = new ExtentHtmlReporter("ExtentReport.html");
		
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(html);

			ExtentTest test = extent.createTest("Google Search Test");
			
			String browsername = props.getBrowserVersion();
			System.out.print("the browser name is : " + browsername);
			
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
				test.fail("ClickSearchButton");
				
				//Wait for 1.5 sec.
				//Thread.sleep(1500);
				driver.close();
				test.pass("Closed the browser");
				test.info("Test Completed");
				
				extent.flush();
		}
	}	

