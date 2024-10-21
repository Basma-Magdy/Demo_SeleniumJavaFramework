package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Configuration.ConfigurationClass;
import Pages.TestingPage;
import Utilities.DataDrivenProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


//add listener in the class only if i don't add it to the testng.xml file
//@Listeners(listener.TestNGListener.class)

//add a group at the class level which assigns this group to the whole tests inside the class
//@Test(groups = "allClassTests" )
//@Ignore
public class TestingTestCases {

	WebDriver driver = null;
	
	
    @Parameters({"BrowserName", "Myname"})
	@BeforeTest(groups = "sanity")
	public void  SetUpTest(String BrowserName, @Optional("Basma") String MyName) {

    	ConfigurationClass.getProperties();

		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}

		if(BrowserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		System.out.println("My name is : " + MyName );

		System.out.println("Browser is : " + BrowserName );
		System.out.println("Thread ID is :" + Thread.currentThread().getId());

	}
    @Ignore
	@Test(groups = {"sanity", "linux.regression"}, dependsOnGroups ="windows.*" , retryAnalyzer = listener.RetryAnalyzer.class)
	public void test1() {
		
		System.out.println("This is test 1");
		Assert.assertTrue(false);  // to make test fails
	}
	
	@Test( groups = {"sanity", "smoke",  "windows.regression" })
	public void test2() {
		
		System.out.println("This is test 2");
		//throw new  SkipException("This test is skipped"); // to skip a test

	}
	
	// we can use regular expressions in the groups and its calling the xml file
	@Test(groups = "windows.regression" , dependsOnMethods = "LoginTest")
	public void test3() {
		
		System.out.println("This is test 3");
	}
	

	@Test ( dataProvider = "Test1Data" , dataProviderClass = DataDrivenProvider.class , groups = "Regression1")
	public void LoginTest(String username, String password) throws Exception
	{

		System.out.println(username + " | " + password);
		
		TestingPage orangePage = new TestingPage(driver);
		
		String Website = "https://parabank.parasoft.com/parabank/index.htm";
		
		driver.get(Website);
		driver.manage().window().maximize();
		
		orangePage.loginUsername(username);
		orangePage.loginPassword(password);
		//orangePage.ClickLoginButton();		
	
		Thread.sleep(500);
	}
  
	@AfterTest(groups = "Regression1")
	public void TearDownTest()
	{
		driver.close();
	}
}