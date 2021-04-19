package techbee.poa.main;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import techbee.poa.basePages.*;

public class project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/dev/Webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		EbayBase ebay = new EbayBase(driver);
		
		ebay.connectHome();
		
		ebay.signin();
		Thread.sleep(1200);
		ebay.connectHome();
		
		ebay.dailyDeals();
		Thread.sleep(1200);
		ebay.connectHome();
		
	}
}
