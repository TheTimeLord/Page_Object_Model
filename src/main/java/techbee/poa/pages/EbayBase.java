package techbee.poa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EbayBase {
	
	protected WebDriver driver;
	protected Actions builder;
	
	// Constructor
	public EbayBase(WebDriver d) {
		driver = d;
		builder = new Actions(d);
		driver.manage().window().maximize();
	}
	
	// Header Methods
	
	public void clickSignin() {
		WebElement ele = driver.findElement(By.linkText("Sign in"));
		ele.click();
	}
	
	public void clickDailyDeals() {
		WebElement ele = driver.findElement(By.linkText("Daily Deals"));
		ele.click();
	}
	
	public void clickBrandOutlet() {
		WebElement ele = driver.findElement(By.linkText("Brand Outlet"));
		ele.click();
	}
	
	public void clickSell() {
		WebElement ele = driver.findElement(By.linkText("Sell"));
		ele.click();
	}
	
	public void clickWatchlist() {
		WebElement ele = driver.findElement(By.linkText("Watchlist"));
		ele.click();
	}
	
	public void clickMyEbay() {
		WebElement ele = driver.findElement(By.linkText("My eBay"));
		ele.click();
	}
	
	public void clickNotifications() {
		WebElement ele = driver.findElement(By.id("gh-Alerts-i"));
		ele.click();
	}
	
	public void clickShoppingCart() {
		WebElement ele = driver.findElement(By.className("gh-cart-icon"));
		ele.click();
	}
	
	// Footer methods
	public void clickAboutEbay() {
		WebElement ele = driver.findElement(By.linkText("About Ebay"));
		ele.click();
	}
	
	public void clickAnnouncments() {
		WebElement ele = driver.findElement(By.linkText("Announcements"));
		ele.click();
	}
	
	public void clickCommunity() {
		WebElement ele = driver.findElement(By.linkText("Community"));
		ele.click();
	}
	
	public void clickSecurity() {
		WebElement ele = driver.findElement(By.linkText("Security"));
		ele.click();
	}
	
	public void clickSellerCenter() {
		WebElement ele = driver.findElement(By.linkText("Seller Center"));
		ele.click();
	}
	
	public void clickPolicies() {
		WebElement ele = driver.findElement(By.linkText("Policies"));
		ele.click();
	}
	
	public void clickAffiliates() {
		WebElement ele = driver.findElement(By.linkText("Affiliates"));
		ele.click();
	}
	
	public void clickHelpAndContact() {
		WebElement ele = driver.findElement(By.linkText("Help & Contact"));
		ele.click();
	}
	
	// Extra methods
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void connectHome() {
		driver.get("https://www.ebay.com");
	}
}
