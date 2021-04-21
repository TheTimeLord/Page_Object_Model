package techbee.poa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends EbayBase {
	public ProductsPage(WebDriver d) {
		super(d);
	}
	
	public void allListings() {
		WebElement ele = driver.findElement(By.linkText("All Listings"));
		ele.click();
	}
	
	public void acceptsOffers() {
		WebElement ele = driver.findElement(By.linkText("Accepts Offers"));
		ele.click();
	}
	
	public void auction() {
		WebElement ele = driver.findElement(By.linkText("Auction"));
		ele.click();
	}
	
	public void buyItNow() {
		WebElement ele = driver.findElement(By.linkText("Buy It Now"));
		ele.click();
	}
	
	public String getPrice(int index) {
		List<WebElement> elements = driver.findElements(By.className("s-item__price"));
		return elements.get(index).getText();
	}
	
	public void selectProduct(int index) {
		List<WebElement> elements = driver.findElements(By.className("s-item__link"));
		elements.get(index).click();
	}
}
