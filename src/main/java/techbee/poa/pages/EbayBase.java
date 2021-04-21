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
	
	public void sell() {
		WebElement ele = driver.findElement(By.linkText("Sell"));
		ele.click();
	}
	
	public void watchlist() {
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
	
	public void shoppingCart() {
		WebElement ele = driver.findElement(By.className("gh-cart-icon"));
		ele.click();
	}
	
	// Footer methods
	
	public void aboutEbay() {
		WebElement ele = driver.findElement(By.linkText("About eBay"));
		ele.click();
	}
	
	public void announcments() {
		WebElement ele = driver.findElement(By.linkText("Announcements"));
		ele.click();
	}
	
	public void community() {
		WebElement ele = driver.findElement(By.linkText("Community"));
		ele.click();
	}
	
	public void securityCenter() {
		WebElement ele = driver.findElement(By.linkText("Security center"));
		ele.click();
	}
	
	public void sellerCenter() {
		WebElement ele = driver.findElement(By.linkText("Seller Center"));
		ele.click();
	}
	
	public void policies() {
		WebElement ele = driver.findElement(By.linkText("Policies"));
		ele.click();
	}
	
	public void affiliates() {
		WebElement ele = driver.findElement(By.linkText("Affiliates"));
		ele.click();
	}
	
	public void helpAndContact() {
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
