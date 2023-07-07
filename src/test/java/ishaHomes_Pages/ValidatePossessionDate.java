package ishaHomes_Pages;

import java.io.IOException;
import ishaHomes_Utilities.CloseAlertBoxes;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ishaHomes_Utilities.DriverSetup;
import ishaHomes_Utilities.ScreenShot;
public class ValidatePossessionDate extends DriverSetup {

	//Validating project is for resale then possession start date should be before December month of the current year.
	//else if it is for sale then verify whether possession date contains "Ready to move in" text.

	
	
	public static WebElement  validatePossessionDateAndPropertyStatus() throws InterruptedException {
		  
		 ScreenShot sshot=new ScreenShot();
		 
		//Button ViewDetils xpaths
		 // String temp="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div[2]/div/a[2]";
		  String temp1="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/div/a[2]";
		  String temp2="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/a[2]";
		  String temp3="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[4]/div/div/div[2]/div/a[2]";
		 
		//availability xpaths
		 String x1="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div[2]/p[3]";
		 String x2="/html/body/div[2]/div[3]/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/h5";
		 String x3="/html/body/div[2]/div[3]/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/h5";
		 String x4="/html/body/div[2]/div[3]/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/h5";

		 
		//Screenshots variables 
	     String ss1="All-Propertys_Status";
		
		 String ss2="Property_2_Possession_Date";
		 
		 String ss3="Property_3_Possession_Date";
			
		 String ss4="Property_4_Possession_Date";
		  
		 driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		    WebElement unitwise1 = driver.findElement(By.xpath(x1));
		    String s1=unitwise1.getText();
		   
		   String str="Resale";
		   String poess="Possession: Ready to Move in";
		   String str1="Completed";
		  
		   if(s1.equalsIgnoreCase(poess)){
			   
			   System.out.println("***********************************\n");
			   System.out.println("Validating Property Status Whether its Ready To Move in (or) Resale \n"); 
			   JavascriptExecutor jse = (JavascriptExecutor)driver;
			   jse.executeScript("window.scrollBy(0,583)");				  
			   driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			   
			   try {
					sshot.takeScreenshot(driver, ss1);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   
			   System.out.println("1) Status: "+s1);
			   System.out.println("\nThis Property is Ready To Move In So There is No Possession Date");
		   }
		   else {
			   System.out.println("\n Resale properties are completed Test Cases Failed  ");
		   }
			 
		   
		   
		   
		   WebElement ss=driver.findElement(By.xpath(temp1));
			  
			  JavascriptExecutor jse = (JavascriptExecutor)driver;
			  jse.executeScript("window.scrollBy(0,580)");
			 jse.executeScript("arguments[0].click()", ss);
			 
			 WebDriverWait wait = new WebDriverWait(driver,30);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"about\"]/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/h5")));
			 
		   WebElement unitwise2 = driver.findElement(By.xpath(x2));
		   String s2=unitwise2.getText();
		   
		   jse.executeScript("window.scrollBy(0,580)");
		   WebElement a= driver.findElement(By.xpath("//*[@id=\"about\"]/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/h5"));
		   if(s2.equalsIgnoreCase(str)) {
			   
			System.out.println("\n");
			try {
				sshot.takeScreenshot(driver, ss2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("2) Status: "+s2);
			System.out.println("   Possession Start Date: "+a.getText());
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"about\"]/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/h5")));
			
			driver.navigate().back();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		else {
			   System.out.println("\n Resale properties are completed Test Cases Failed  ");
		     }
		
		  
		   
		   
		   
		   WebElement vs=driver.findElement(By.xpath(temp2));
			  
			  JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			  jse1.executeScript("window.scrollBy(0,580)");
			 jse1.executeScript("arguments[0].click()", vs);
			 
			 WebDriverWait wait1 = new WebDriverWait(driver,30);
			 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"about\"]/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/h5")));
			 
		   WebElement unitwise3 = driver.findElement(By.xpath(x3));
		   String s3=unitwise3.getText();
		   
		   jse1.executeScript("window.scrollBy(0,580)");
		   WebElement a1= driver.findElement(By.xpath("//*[@id=\"about\"]/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/h5"));
		   
		   if(s3.equalsIgnoreCase(str1)) {
			   
			System.out.println("\n");
			try {
				sshot.takeScreenshot(driver, ss3);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("3) Status: "+s3);
			System.out.println("   Possession Start Date: "+a1.getText());
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"about\"]/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/h5")));
			
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		else {
			   System.out.println("\n Resale properties are completed Test Cases Failed  ");
		     }
		  
		   
		   
		   
		   
		   WebElement vs1=driver.findElement(By.xpath(temp3));
			  
			  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			  jse2.executeScript("window.scrollBy(0,580)");
			 jse2.executeScript("arguments[0].click()", vs1);
			 
			 WebDriverWait wait2= new WebDriverWait(driver,30);
			 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"about\"]/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/h5")));
			 
		   WebElement unitwise4 = driver.findElement(By.xpath(x4));
		   String s4=unitwise4.getText();
		   
		   jse2.executeScript("window.scrollBy(0,580)");
		   WebElement a2= driver.findElement(By.xpath("//*[@id=\"about\"]/div/div/div/div/div[2]/div/div/div[1]/div/div[2]/h5"));
		   if(s4.equalsIgnoreCase(str)) {
			   
			System.out.println("\n");
			try {
				sshot.takeScreenshot(driver, ss4);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("4) Status: "+s4);
			System.out.println("   Possession Start Date: "+a2.getText());
			
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		else {
			   System.out.println("\n Resale properties are completed Test Cases Failed  ");
		     } 
		   
		   
		   
		   
		   System.out.println("\n All Property Status fetched successfully Test Cases are Passed"); 
			  
	
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			 return null;
	 
	 }
	 
}
