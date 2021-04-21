package techbee.poa.testPages;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import techbee.poa.pages.HomePage;

public class TestHomePage {
	
	private static WebDriver driver = null;
	private static HomePage home = null;
	
	@Before
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "/dev/Webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		home = new HomePage(driver);
	}
	
	@Test
	public void testClickSaved() {
		home.connectHome();
		home.clickSaved();
		driver.close();
	}
	
	@Test
	public void testClickMotors() {
		home.connectHome();
		home.clickMotors();
		assertEquals("https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickFashion() {
		home.connectHome();
		home.clickFashion();
		assertEquals("https://www.ebay.com/b/Fashion/bn_7000259856", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickElectronics() {
		home.connectHome();
		home.clickElectronics();
		assertEquals("https://www.ebay.com/b/Electronics/bn_7000259124", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickCollectiblesAndArt() {
		home.connectHome();
		home.clickCollectiblesAndArt();
		assertEquals("https://www.ebay.com/b/Collectibles-Art/bn_7000259855", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickHomeAndGarden() {
		home.connectHome();
		home.clickHomeAndGarden();
		assertEquals("https://www.ebay.com/b/Home-Garden/11700/bn_1853126", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickSportingGoods() {
		home.connectHome();
		home.clickSportingGoods();
		assertEquals("https://www.ebay.com/b/Sporting-Goods/888/bn_1865031", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickToys() {
		home.connectHome();
		home.clickToys();
		assertEquals("https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void clickBusinessAndIndustrial() {
		home.connectHome();
		home.clickBusinessAndIndustrial();
		assertEquals("https://www.ebay.com/b/Business-Industrial/12576/bn_1853744", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickMusic() {
		home.connectHome();
		home.clickMusic();
		assertEquals("https://www.ebay.com/b/Music/bn_7000710860", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testClickDeals() {
		home.connectHome();
		home.clickDeals();
		assertEquals("https://www.ebay.com/deals", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testExpandMotors() {
		home.connectHome();
		home.expandMotors("Classics");
		assertEquals("https://www.ebay.com/b/Classics/bn_7005623268", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testExpandFashion() {
		home.connectHome();
		home.expandFashion("Watches");
		assertEquals("https://www.ebay.com/b/Watches-Parts-Accessories/260324/bn_2408535", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testExpandElectronics() {
		home.connectHome();
		home.expandElectronics("Laptops");
		assertEquals("https://www.ebay.com/b/Laptops-Netbooks/175672/bn_1648276", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testExpandCollectiblesAndArt() {
		home.connectHome();
		home.expandCollectiblesAndArt("Stamps");
		assertEquals("https://www.ebay.com/b/Stamps/260/bn_1865095", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testExpandHomeAndGarden() {
		home.connectHome();
		home.expandHomeAndGarden("Bedding");
		assertEquals("https://www.ebay.com/b/Bedding/20444/bn_1864382", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testExpandSportingGoods() {
		home.connectHome();
		home.expandSportingGoods("Archery");
		assertEquals("https://www.ebay.com/b/Archery-Equipment/20835/bn_1971493", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testExpandToys() {
		home.connectHome();
		home.expandToys("Collectible Card Games");
		assertEquals("https://www.ebay.com/b/Collectible-Card-Games-Accessories/2536/bn_1852210", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testExpandBusinessAndIndustrial() {
		home.connectHome();
		home.expandBusinessAndIndustrial("Dental");
		assertEquals("https://www.ebay.com/b/Dental/bn_7115058704", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testExpandMusic() {
		home.connectHome();
		home.expandMusic("All Instruments");
		assertEquals("https://www.ebay.com/b/Musical-Instruments-Gear/619/bn_1865601", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testExpandDeals() {
		home.connectHome();
		home.expandDeals("Travel Deals");
		assertEquals("https://www.ebay.com/deals/other-deals/luggage-travel", driver.getCurrentUrl());
		driver.close();
	}
	
	//TODO: Fix daily deals
/*
	@Test
	public void testTodaysDeals() {
		home.connectHome();
		home.todaysDeals();
		driver.close();
	}
*/	
	@Test
	public void testAdvancedSearch() {
		home.connectHome();
		home.advancedSearch();
		assertEquals("https://www.ebay.com/sch/ebayadvsearch", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testSearch() {
		home.connectHome();
		home.search("iphone");
		assertEquals("https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=iphone&_sacat=0", driver.getCurrentUrl());
		
		home.connectHome();
		home.search("iphone", "Art");
		assertEquals("https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=iphone&_sacat=550", driver.getCurrentUrl());
		driver.close();
	}
}
