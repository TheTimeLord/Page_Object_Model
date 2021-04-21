package techbee.poa.testPages;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import techbee.poa.pages.ProductsPage;

public class TestProductsPage {
	private static WebDriver driver = null;
	private static ProductsPage product = null;
	
	@Before
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "/dev/Webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		product = new ProductsPage(driver);
	}
	
	@Test
	public void testAllListings() {
		driver.get("https://www.ebay.com/sch/i.html?_from=R40&_nkw=markers&_sacat=0&rt=nc&LH_BO=1");
		product.allListings();
		driver.close();
	}
	
	@Test
	public void testAcceptsOffers() {
		driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=markers&_sacat=0");
		product.acceptsOffers();
		driver.close();
	}
	
	@Test
	public void testAuction() {
		driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=markers&_sacat=0");
		product.auction();
		driver.close();
	}
	
	@Test
	public void testBuyItNow() {
		driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=markers&_sacat=0");
		product.buyItNow();
		driver.close();
	}
	
	@Test
	public void testGetPrice() {
		driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=markers&_sacat=0");
		assertEquals("$21.79", product.getPrice(0));
		driver.close();
	}
	
	@Test
	public void testSelectProduct() {
		driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=markers&_sacat=0");
		product.selectProduct(0);
		driver.close();
	}
}
