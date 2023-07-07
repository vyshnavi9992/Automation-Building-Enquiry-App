
package ishaHomes_Utilities;

import ishaHomes_Utilities.DriverSetup;


public class QuitBrowser extends DriverSetup {
	
	
	public void closeDriver() {
		
		driver.close();
	
		 System.out.println("\n***********************************");
		 System.out.println("\n Browser Closed Successfully");
		 
		
	 }
	 

}
