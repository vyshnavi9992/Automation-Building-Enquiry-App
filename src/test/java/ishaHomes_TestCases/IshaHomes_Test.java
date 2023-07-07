package ishaHomes_TestCases;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import ishaHomes_Pages.AllMethods_Invoking_IshaHomes;

public class IshaHomes_Test {
	

public static void main(String args[]) throws InterruptedException  {
	
	
	AllMethods_Invoking_IshaHomes i=new AllMethods_Invoking_IshaHomes();
	
	
	//All Methods Calling in Main Class By creating object for AllMethods_Invoking_IshaHomes.java class
			//Launching Chrome Browser
		    i.getWebDriver();
		    
		    //print console output in text file
			  try {
					System.setOut(new PrintStream(new FileOutputStream("Output_Console\\output.txt")));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

		    i.closeAlert();		    
		    i.findContact();		    
            i.fillContact();
		    i.navigatedToBuyVilla();
		    i.closeAlert1();
		    i.extractAreaandCityGreaterThan10units();
		    i.propertyPossessionStatus();
		    i.exitBrowser();
		    
		    //Launching FireFox Browser
		    i.getWebDriver1();
		    
		    //print console output in text file
			  try {
					System.setOut(new PrintStream(new FileOutputStream("Output_Console\\output.txt")));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

		    i.closeAlert();		    
		    i.findContact();		    
            i.fillContact();
		    i.navigatedToBuyVilla();
		    i.closeAlert1();
		    i.extractAreaandCityGreaterThan10units();
		    i.propertyPossessionStatus();
		    i.exitBrowser();
		  
		    
		  
	}

}
