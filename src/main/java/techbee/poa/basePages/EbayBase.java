package techbee.poa.basePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayBase {
	
	private WebDriver driver;
	
	
	// Constructor
	public EbayBase(WebDriver d) {
		driver = d;
	}
	
	// Header Methods
	
	public void signin() {
		WebElement ele = driver.findElement(By.linkText("Sign in"));
		ele.click();
	}
	
	public void dailyDeals() {
		WebElement ele = driver.findElement(By.linkText("Daily Deals"));
		ele.click();
	}
	
	public void brandOutlet() {
		WebElement ele = driver.findElement(By.linkText("Brand Outlet"));
		ele.click();
	}
	
	public void helpContact() {
		WebElement ele = driver.findElement(By.linkText("Help & Contact"));
		ele.click();
	}
	
	public void sell() {
		WebElement ele = driver.findElement(By.linkText("Sell"));
		ele.click();
	}
	
	public void Watchlist() {
		WebElement ele = driver.findElement(By.linkText("Watchlist"));
		ele.click();
	}
	
	public void myEbay() {
		WebElement ele = driver.findElement(By.linkText("My eBay"));
		ele.click();
	}
	
	public void notifications() {
		WebElement ele = driver.findElement(By.id("gh-Alerts-i"));
		ele.click();
	}
	
	public void clickShoppingCart() {
		WebElement ele = driver.findElement(By.className("gh-cart-icon"));
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
