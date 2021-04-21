package techbee.poa.main;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import techbee.poa.basePages.*;

public class project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/dev/Webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		HomePage ebay = new HomePage(driver);
		
		ebay.connectHome();
		
		Thread.sleep(1000);
		
		ebay.advancedSearch();
		
	}
}
