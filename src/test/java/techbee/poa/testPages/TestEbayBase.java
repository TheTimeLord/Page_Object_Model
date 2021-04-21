package techbee.poa.testPages;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import techbee.poa.pages.EbayBase;

public class TestEbayBase {

	private static WebDriver driver = null;
	private static EbayBase ebay = null;
	
	@Before
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "/dev/Webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		ebay = new EbayBase(driver);
	}
	
	@Test
	public void testConnect() {
		ebay.connectHome();
		driver.close();
	}
	
	@Test
	public void testSignin() {
		ebay.connectHome();
		ebay.signin();
		driver.close();
	}
	
	@Test
	public void testDailyDeals() {
		ebay.connectHome();
		ebay.dailyDeals();
		assertEquals("https://www.ebay.com/deals", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testBrandOutlet() {
		ebay.connectHome();
		ebay.brandOutlet();
		assertEquals("https://www.ebay.com/b/Brand-Outlet/bn_7115532402", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testSell() {
		ebay.connectHome();
		ebay.sell();
		assertEquals("https://www.ebay.com/sl/sell", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testWatchList() {
		ebay.connectHome();
		ebay.watchlist();
		driver.close();
	}
	
	@Test
	public void testMyEbay() {
		ebay.connectHome();
		ebay.myEbay();
		driver.close();
	}
	
	@Test
	public void testNotifications() {
		ebay.connectHome();
		ebay.notifications();
		driver.close();
	}
	
	@Test
	public void testShoppingCart() {
		ebay.connectHome();
		ebay.shoppingCart();
		assertEquals("https://cart.ebay.com/", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testAboutEbay() {
		ebay.connectHome();
		ebay.aboutEbay();
		assertEquals("https://www.ebayinc.com/", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testAnnouncements() {
		ebay.connectHome();
		ebay.announcments();
		assertEquals("https://community.ebay.com/t5/Announcements/bg-p/Announcements", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testCommunity() {
		ebay.connectHome();
		ebay.community();
		assertEquals("https://community.ebay.com/", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testSecurityCenter() {
		ebay.connectHome();
		ebay.securityCenter();
		assertEquals("https://pages.ebay.com/securitycenter/index.html", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testSellerCenter() {
		ebay.connectHome();
		ebay.sellerCenter();
		assertEquals("https://pages.ebay.com/seller-center/index.html?utm_source=gf&utm_medium=onsite", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testPolicies() {
		ebay.connectHome();
		ebay.policies();
		assertEquals("https://www.ebay.com/help/policies/default/ebays-rules-policies?id=4205", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testAffiliates() {
		ebay.connectHome();
		ebay.affiliates();
		assertEquals("https://partnernetwork.ebay.com/", driver.getCurrentUrl());
		driver.close();
	}
	
	@Test
	public void testHelpAndContact() {
		ebay.connectHome();
		ebay.helpAndContact();
		assertEquals("https://www.ebay.com/help/home", driver.getCurrentUrl());
		driver.close();
	}
}
	
