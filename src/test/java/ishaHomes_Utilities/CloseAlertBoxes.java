package ishaHomes_Utilities;

import java.util.concurrent.TimeUnit;
import ishaHomes_Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloseAlertBoxes extends DriverSetup {
	
	//This Below Code is use to close the Pop up box or alert box only	
	 
	 public static WebElement closeAlertBox() throws InterruptedException {
		 
	   String alertBoxClose="//*[@id='spu-12957']/span[1]";
	   Thread.sleep(4000);
	   driver.findElement(By.xpath(alertBoxClose)).click();

	   WebDriverWait wait = new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='menu-item-8538']/a")));
	return null;
	
}

	 
public static WebElement closeAlertBox1() throws InterruptedException {
	 String alertBoxClose="//*[@id=\"livchat_close\"]/font";
	
	   driver.findElement(By.xpath(alertBoxClose)).click();
	 
	   WebDriverWait wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div[2]/p[2]")));
		 
	return null;
}




}
