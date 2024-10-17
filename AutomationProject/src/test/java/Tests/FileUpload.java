package Tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {

	@Test
		public static void testUpload() throws IOException, Exception
		{
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.file.io/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[@aria-label = 'Consent']")).click();
			driver.findElement(By.xpath("//label[@for = 'upload-button']")).click();
			
			Runtime.getRuntime().exec("D:/AutoITFiles/File1.exe");
			
			Thread.sleep(15000);
			
			driver.close();
			

		}
}
