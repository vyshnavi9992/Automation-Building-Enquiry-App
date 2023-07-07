package ishaHomes_Pages;
import ishaHomes_Utilities.DriverSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class ContactUs extends DriverSetup{
	

   
	 //Finding Contact us link and Clicked
	 public static WebElement findContactUs() throws InterruptedException{
		 
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 
		 String contact="//*[@id='menu-item-8538']/a";
         WebElement contactUs = driver.findElement(By.xpath(contact));
		 contactUs.click();
		
		 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 System.out.println("\n navigated to the <contact us> in More menu");
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  
		  return contactUs;
		 }
	 

}
