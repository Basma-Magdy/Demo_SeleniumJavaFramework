package Configuration;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Tests.GoogleSearchTest;
import Tests.TestingTestCases;

public class ConfigurationClass {
	
	 // object of properties class
	static Properties prop = new Properties();
	
	// get the path of the current project
	static String projectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		
		getProperties();
		setProperties();
		getProperties();

	}
	
		public static void getProperties() {
		
			try {
			
			//get the properties file called config.properties
			InputStream input = new FileInputStream(projectPath +"/src/test/java/Configuration/config.properties");
			
			// load the properties file
			prop.load(input);
			
			//get values from properties file
			String browser = prop.getProperty("browser");
			GoogleSearchTest.browser = browser;
			//TestingTestCases.browser= browser;
			
			//System.out.println("browser is : "+browser);
			}
			
			catch(Exception exp)
			{	
				System.out.println("Message is :"+ exp.getMessage());
				System.out.println("Message is :"+ exp.getCause());
			}
			
		}
		
		public static void setProperties() {
			
			try {
			//Set the properties file called config.properties
			OutputStream output = new FileOutputStream(projectPath +"/src/test/java/Configuration/config.properties");
			
			// set the field called browser with value chrome
			prop.setProperty("browser", "chrome");
			
			//store this data in the output file specified 
			prop.store(output, null);
			
			prop.setProperty("result", "pass");

			GoogleSearchTest.browser = prop.getProperty("browser");
			
			}catch(Exception exp)
			{	
				System.out.println("Message is :"+ exp.getMessage());
				System.out.println("Message is :"+ exp.getCause());
			}
		
		}
}
