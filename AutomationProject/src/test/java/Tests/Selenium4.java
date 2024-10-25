package Tests;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import com.mongodb.client.model.geojson.Position;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().driverVersion("115").setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		// press reject all button
		driver.findElement(By.id("W0wltc")).click();
			
		driver.navigate().to("https://trytestingthis.netlify.app/");
		
		
		// if we have more than 1 window or tab we can store the original one and then switch and go to it 
	/*	String originalWindow = driver.getWindowHandle();
		driver.navigate().to("http://youtube.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	    driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);

		// to switch to the first opened tab or window or the stored one after opening more than 1 window or tab
		driver.switchTo().window(originalWindow);	*/
		
		/*driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//hard wait (Force wait) is not used in real projects 
		Thread.sleep(2000);
    */
	/*
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		
		System.out.println("Height : Width = " + height + " : " + width);
		System.out.println("Height is : " + size.getHeight());
		System.out.println("Width is : " + size.getWidth());
		
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(800, 600));
		Thread.sleep(1000);
		
		// get the position of the opened browser all over my screen
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		Point position = driver.manage().window().getPosition();
		
		System.out.println("X Axis is : " + position.getX());
		System.out.println("Y Axis is : " + position.getY());		
		
		driver.manage().window().setPosition(new Point(500, 100));
		Thread.sleep(1000);


		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.manage().window().minimize();
		Thread.sleep(1000);

		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		
	*/
		
		// Taking screenshot of the whole screen
	/*	File srcfile1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile1, new File("./image1.png"));


		//taking screenshot of specific element on the screen
		WebElement element = driver.findElement(By.id("yt-ringo2-svg_yt10"));
		File srcfile2 = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile2, new File("./image2.png"));
	*/	
		
		// to write to the console of the opened browser ,, also can click on any button using javascript
	/*	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("console.log('Hello World .. ')");
	*/
		
		
		
		//driver.close();
		driver.quit();
		
	}

}
