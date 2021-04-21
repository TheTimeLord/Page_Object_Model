package techbee.poa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearch extends EbayBase {
	
	public AdvancedSearch(WebDriver d) {
		super(d);
	}
	
	public void clickFindItems() {
		WebElement ele = driver.findElement(By.linkText("Find items"));
		ele.click();
	}
	
	public void clickOnEbayMotors() {
		WebElement ele = driver.findElement(By.linkText("On eBay Motors"));
		ele.click();
	}
	
	public void clickBySeller() {
		WebElement ele = driver.findElement(By.linkText("By seller"));
		ele.click();
	}
	
	public void clickByItemNumber() {
		WebElement ele = driver.findElement(By.linkText("By item number"));
		ele.click();
	}
	
	public void clickItemsInStores() {
		WebElement ele = driver.findElement(By.linkText("Items in stores"));
		ele.click();
	}
	
	public void clickFindStores() {
		WebElement ele = driver.findElement(By.linkText("Find Stores"));
		ele.click();
	}
	
}
