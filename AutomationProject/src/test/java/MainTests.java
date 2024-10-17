import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainTests {
/*
	public static void main(String[] args) throws Throwable {
		
		GoogleSearch();
		}
		
		public static void GoogleSearch() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/");
		//Go to Google website
		driver.get("http://google.com");
		
		//Make the window full maximized
		driver.manage().window().maximize();
		
		//Click reject all for the cookies appeared page
		driver.findElement(By.xpath("//button[@id='W0wltc']")).click();
		
		
		//WebElement SearchBar = driver.findElement(By.id("APjFqb"));
		//SearchBar.sendKeys("Why Life is so hard ?");
		
		//Find the Search bar and search for "Why Life is so hard ?"
		driver.findElement(By.id("APjFqb")).sendKeys("Why Life is so hard ?");
		
		// Search for the input tags in the page and save them in list then print this list size
		 List<WebElement> InputsList=driver.findElements(By.xpath("//input"));
		 int InputsListSize=InputsList.size();
		 System.out.println("InputsListSize is : " + InputsListSize);
		
		 //Press the search button then wair for 3 sec.
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(1500);
		
		//close browser
		driver.close();
		
	}
		*/
}
