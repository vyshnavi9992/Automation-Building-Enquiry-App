package ishaHomes_Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ishaHomes_Utilities.DriverSetup;

public class NavigateToBuyVilla  extends DriverSetup{
	 
	 //Navigating into Buy villas link after necessary details filled
	 public static WebElement  navigateToBuyVillas() throws InterruptedException {  
     String buyVillas="//*[@id=\"menu-item-12781\"]/a";
	 WebElement buyVilla = driver.findElement(By.xpath(buyVillas));
	 buyVilla.click();
	return null;
	 }

	
}
