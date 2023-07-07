package ishaHomes_Pages;

import ishaHomes_Utilities.DriverSetup;
import ishaHomes_Utilities.CloseAlertBoxes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Extract_Area_and_City extends DriverSetup {
	
	
	 public static WebElement  extractArea_city() throws InterruptedException {
         
	      //Button ViewDetils xpaths
		  String temp="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div[2]/div/a[2]";
		  String temp1="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/div/a[2]";
		  String temp2="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/div/a[2]";
		  String temp3="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[4]/div/div/div[2]/div/a[2]";
		  
		  
		  //units xpaths
		  String x1="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div[2]/p[2]";
		  String x2="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div/div/div[2]/p[2]";
		  String x3="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[3]/div/div/div[2]/p[2]";
		  String x4="/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[4]/div/div/div[2]/p[2]";
		  
		
		  System.out.println("*************************************************");
		  System.out.println("\n Extracting the Area and city of the Villa projects which has more than 10 Units \n");
		  System.out.println("\n There are Total 4 Properties - (Kindly Note: if there is no area, then it is Apartments) \n");
		  driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		  int k=1;
		  
		  for(int i=1;i<=4;i++) {
			  
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  CloseAlertBoxes.closeAlertBox1();
			  
			  WebElement unitwise = driver.findElement(By.xpath(x1));
			   String s=unitwise.getText();
			   int units;
			   s=s.replaceAll("[^0-9]{2,}","");
			   units= Integer.parseInt(s);  
			  
			   if(units>10) {
			  
			  WebElement ss=driver.findElement(By.xpath(temp));
			  
			  JavascriptExecutor jse = ((JavascriptExecutor)driver);
			  jse.executeScript("window.scrollBy(0,600)");
			 jse.executeScript("arguments[0].click()", ss);
			 
			 WebDriverWait wait = new WebDriverWait(driver,30);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='idfSpec']")));
		
		//area
		WebElement place= driver.findElement(By.xpath("//p[@class='idfSpec']"));
		String b= place.getText();
		
		int len=b.length()/2;
		String halfString=b.substring(len);
		
		System.out.println(k+")"+"The Area is : "+halfString);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='icflocation']")));
		
		//city
	    WebElement checkIn= driver.findElement(By.xpath("//span[@class='icflocation']"));
	   String city=checkIn.getText();
	   
	   int index=0,j;
	    char[] tempo=city.toCharArray();
	    for(j=0;j<tempo.length;j++) {
	    	if(tempo[j]==' ')
	    		index=j+1;
	    }
	    char[] x=new char[tempo.length];
	    for(j=0;j<tempo.length && index < tempo.length;j++)
	    {
	    	x[j]=tempo[index++];
	    }
	  
	    System.out.println("  The City is : "+ String.copyValueOf(x));
	   
	   
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-item-12781\"]/a")));
	    
		System.out.println("\n\n");
		
		//navigate to buy villas
		NavigateToBuyVilla.navigateToBuyVillas();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    //Dynamically changing Variable Values for Buttons , xpaths
		if(i==1) {
		temp=temp1;
		x1=x2;
		 k++;
		}
		else if(i==2) {
			temp=temp2;
			x1=x3;
			 k++;
		}
		else if(i==3) {
			temp=temp3;
			x1=x4;
			 k++;
		}
		else {
			System.out.println("Test Cases are Passed Successfully, Extracting the Area and city is completed");
		}
		
			   }else {
				   System.out.println("The Property not greater than 10 Units ");
			   }
			  
			   
		  }
		 
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div[2]/p[3]")));
	
		return null;
	
}


}
