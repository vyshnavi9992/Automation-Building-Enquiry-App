package ishaHomes_Utilities;

import java.io.File;
import java.io.IOException;
import ishaHomes_Utilities.DriverSetup;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot extends DriverSetup {

	 //Screenshots code
	public static void takeScreenshot(WebDriver driver, String screenshotname) throws IOException {
		String screenshotPath = System.getProperty("user.dir") + "\\Screenshots";
		TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./Screenshots/"+screenshotname+".png"));
	    
	}
	     	
	     }

