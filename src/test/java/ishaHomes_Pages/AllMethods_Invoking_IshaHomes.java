
package ishaHomes_Pages;
import ishaHomes_Utilities.DriverSetup;
import ishaHomes_Utilities.CloseAlertBoxes;

import ishaHomes_Pages.ContactUs;
import ishaHomes_Utilities.QuitBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AllMethods_Invoking_IshaHomes {
	
	static WebDriver driver;
	static WebElement element;
	
 
	public WebDriver getWebDriver() throws InterruptedException  {
	
		return driver=DriverSetup.launchChrome();
	}
	
	public WebDriver getWebDriver1() throws InterruptedException  {
		
		return driver=DriverSetup.launchFireFox();
	}
	
	
	public WebElement closeAlert() throws InterruptedException {
		return element=CloseAlertBoxes.closeAlertBox();
	}
	
	public WebElement findContact() throws InterruptedException{

		return element=ContactUs.findContactUs();
	}
	
	
	
	public WebElement fillContact() throws InterruptedException {
		return element=ContactUsFill.findSubmitContactUsDetails();
	}
	
	
	public WebElement navigatedToBuyVilla() throws InterruptedException {
		System.out.println("\n Navigated to Buy Villas ");
		return element=NavigateToBuyVilla.navigateToBuyVillas();
		
	}
	
	public WebElement closeAlert1() throws InterruptedException {
		return element=CloseAlertBoxes.closeAlertBox1();
	}

	public WebElement extractAreaandCityGreaterThan10units() throws InterruptedException {
		return element=Extract_Area_and_City.extractArea_city();
	}

	public WebElement propertyPossessionStatus() throws InterruptedException {
		return element=ValidatePossessionDate.validatePossessionDateAndPropertyStatus();
	}

	public void exitBrowser() {
		QuitBrowser qs=new QuitBrowser();
		qs.closeDriver();
	}
	
	
}
