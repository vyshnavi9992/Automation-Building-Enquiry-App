package ishaHomes_Utilities;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverSetup {

	public static WebDriver driver=null;
	
	static String url=AccessProperty.getUrl();
	
	// launching Google chrome
	public static WebDriver launchChrome() throws InterruptedException  {
		 
		String chromeDriverPath = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get(url);
			  
	    driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
			
		return driver;
			
	}
	
	//Launching FireFox browser
	 public static WebDriver launchFireFox() throws InterruptedException {
		
		 WebDriverManager.firefoxdriver().setup(); //using WebDriver Manager its another type to create WebDriver
	    	driver = new FirefoxDriver();
	    	 driver.manage().window().maximize();
	    	 driver.get(url);
	    	 
	    	 driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
	    	
			return driver;
	 }
	 
	 
	//Dynamically Calling the browsers
	 
}