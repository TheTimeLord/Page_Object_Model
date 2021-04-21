package techbee.poa.testPages;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import techbee.poa.pages.AdvancedSearch;

public class TestAdvancedSearch {
	private static WebDriver driver = null;
	private static AdvancedSearch ebay = null;
	
	@Before
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "/dev/Webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		ebay = new AdvancedSearch(driver);
	}
	
	@Test
	public void testClickFindItems() {
		ebay.connectAdvancedSearch();
		ebay.clickFindItems();
		assertEquals("https://www.ebay.com/sch/ebayadvsearch?_sofindtype=0", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickOnEbayMotors() {
		ebay.connectAdvancedSearch();
		ebay.clickOnEbayMotors();
		assertEquals("https://www.ebay.com/sch/ebayadvsearch?_sofindtype=21", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickBySeller() {
		ebay.connectAdvancedSearch();
		ebay.clickBySeller();
		assertEquals("https://www.ebay.com/sch/ebayadvsearch?_sofindtype=0&_byseller=1#byseller", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickByItemNumber() {
		ebay.connectAdvancedSearch();
		ebay.clickByItemNumber();
		assertEquals("https://www.ebay.com/sch/ebayadvsearch?_sofindtype=4", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickItemsInStores() {
		ebay.connectAdvancedSearch();
		ebay.clickItemsInStores();
		assertEquals("https://www.ebay.com/sch/ebayadvsearch?_sofindtype=5", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickFindStores() {
		ebay.connectAdvancedSearch();
		ebay.clickFindStores();
		assertEquals("https://www.ebay.com/sch/ebayadvsearch?_sofindtype=7", driver.getCurrentUrl());
		driver.close();
	}
}
