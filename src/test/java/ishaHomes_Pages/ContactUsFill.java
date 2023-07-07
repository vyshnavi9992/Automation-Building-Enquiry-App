package ishaHomes_Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import ishaHomes_Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ishaHomes_Utilities.AccessProperty;

public class ContactUsFill extends DriverSetup {

	
	 //finding and filling ContactUs Details in form
	 public static WebElement  findSubmitContactUsDetails() throws InterruptedException {
		
		   String name="//input[@name=\"sell_do[form][lead][name]\"]";
		    String email="//input[@name=\"sell_do[form][lead][email]\"]";	
		    String phone="//input[@name=\"sell_do[form][lead][phone]\"]";
		    
		   		   
		       driver.findElement(By.xpath(name)).sendKeys(AccessProperty.getName());
			   driver.findElement(By.xpath(email)).sendKeys(AccessProperty.getEmail());
			   driver.findElement(By.xpath(phone)).sendKeys(AccessProperty.getPhoneNumber());
			   
			  
			 //Extracting Number of projects From Drop Down Field
			   
			   System.out.println("\n Entered the necessary text fields in the given form and Selected the project from the field Successfully");
			  
			   Select drp = new Select(driver.findElement(By.name("sell_do[form][lead][project_id]")));
			   List<WebElement> dd = drp.getOptions();
			   System.out.println("*************************************************");
			   System.out.println("Extracted Number of Available Projects: "+dd.size());
			   int i=1;
			   for (int j = 0; j < dd.size(); j++) {
				  
			        System.out.println(i+")"+dd.get(j).getText());
                   i++;
			    }
			   
			   
			   
			    WebElement select= driver.findElement(By.name("sell_do[form][lead][project_id]"));
			    Select se= new Select(select);
				 se.selectByVisibleText("Common");
				 WebElement selectedOption = se.getFirstSelectedOption();
				 System.out.println("*************************************************");
				 System.out.println("Selected Project:\n"+ selectedOption.getText());
				
				driver.findElement(By.className("btn")).click();
				System.out.println("\n Submitted Mandatory fields successfully");
				Thread.sleep(9000); //page load Time  not working properly because of this site has too Busy sometimes 
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			return null;
			
		
	 }
	
	
}
