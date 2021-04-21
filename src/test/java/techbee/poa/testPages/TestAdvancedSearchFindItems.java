package techbee.poa.testPages;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import techbee.poa.pages.AdvancedSearchFindItems;

public class TestAdvancedSearchFindItems {
	private static WebDriver driver = null;
	private static AdvancedSearchFindItems ebay = null;
	
	@Before
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "/dev/Webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		ebay = new AdvancedSearchFindItems(driver);
	}
	
	@Test
	public void testKeywords() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("android", "All words, any order");
		ebay.excludeKeywords("iphone");
		ebay.category("Books");
		ebay.search();	
		driver.close();
	}
	
	@Test
	public void testSearchIncluding() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("car", "All words, any order");
		ebay.searchIncluding(2);
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testPrice() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("Optimus Prime", "Exact words, exact order");
		ebay.price(100, 300);
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testBuyingFormats() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("PS5", "Any words, any order");
		ebay.buyingFormats(true, true, false);
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testCondition() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("Black Lotus", "Exact words, exact order");
		ebay.condition(1);
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testResults() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("Lego", "Any words, any order");
		ebay.listings(0, 6);
		ebay.numBids(2, 20);
		ebay.multiListing(3, 300);
		ebay.itemsListedAsLots();
		ebay.saleItems();
		ebay.bestOffer();
		ebay.ebayForCharity();
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testShippingOptions() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("Dr. Pepper", "Any words, any order");
		ebay.freeShipping();
		ebay.localPickup();
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testLocationDistance() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("Television", "Any words, any order");
		ebay.locationDistance(6, 93923);
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testPreferredLocations() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("AMD", "Any words, any order");
		ebay.preffetedLocation(0);
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testLocatedIn() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("Cups", "Any words, any order");
		ebay.locatedIn("United States");
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testSpecificSellers() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("Bleach", "Any words, any order");
		ebay.specificSellers(true, "Billy");
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testSavedSellers() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("lightbulbs", "Any words, any order");
		ebay.savedSeller();
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testSellerEbay() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("multitool", "Any words, any order");
		ebay.sellerEbay();
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testSortBy() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("Cat", "Any words, any order");
		ebay.sortBy(4);
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testViewResults() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("shoes", "Any words, any order");
		ebay.viewResults(1);
		ebay.search();
		driver.close();
	}
	
	@Test
	public void testResultsPerPage() {
		ebay.connectAdvancedSearch();
		ebay.includeKeywords("teapot", "Any words, any order");
		ebay.resultsPerPage(3);
		ebay.search();
		driver.close();
	}
}
