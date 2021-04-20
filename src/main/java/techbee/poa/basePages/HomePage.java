package techbee.poa.basePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends EbayBase {
	public HomePage(WebDriver d) {
		super(d);
	}
	
	// Click Methods
	
/*
	public void clickHome() {
		WebElement ele = driver.findElement(By.linkText("Home"));
		ele.click();
	}
*/
	
	public void clickSaved() {
		WebElement ele = driver.findElement(By.linkText("Saved"));
		ele.click();
	}
	
	public void clickMotors() {
		WebElement ele = driver.findElement(By.linkText("Motors"));
		ele.click();
	}
	
	public void clickFashion() {
		WebElement ele = driver.findElement(By.linkText("Fashion"));
		ele.click();
	}
	
	public void clickElectronics() {
		WebElement ele = driver.findElement(By.linkText("Electronics"));
		ele.click();
	}
	
	public void clickCollectiblesAndArt() {
		WebElement ele = driver.findElement(By.linkText("Collectibles & Art"));
		ele.click();
	}
	
	public void clickHomeAndGarden() {
		WebElement ele = driver.findElement(By.linkText("Home & Garden"));
		ele.click();
	}
	
	public void clickSportingGoods() {
		WebElement ele = driver.findElement(By.linkText("Sporting Goods"));
		ele.click();
	}
	
	public void clickToys() {
		WebElement ele = driver.findElement(By.linkText("Toys"));
		ele.click();
	}
	
	public void clickBusinessAndIndustrial() {
		WebElement ele = driver.findElement(By.linkText("Business & Industrial"));
		ele.click();
	}
	
	public void clickMusic() {
		WebElement ele = driver.findElement(By.linkText("Music"));
		ele.click();
	}
	
	public void clickDeals() {
		WebElement ele = driver.findElement(By.linkText("Deals"));
		ele.click();
	}
	
	// Expand Methods
	
	public void expandMotors(String selection) {
		WebElement menu = driver.findElement(By.linkText("Motors"));
		builder.moveToElement(menu).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(selection)));
		WebElement menuOption = driver.findElement(By.linkText(selection));
		menuOption.click();
	}
	
	public void expandFashion() {
		
	}

	public void expandElectronics() {
	
	}
	
	public void expandCollectiblesAndArt() {
		
	}
	
	public void expandHomeAndGarden() {
		
	}
	
	public void expandSportingGoods() {
		
	}
	
	public void expandToys() {
		
	}
	
	public void expandBusinessAndIndustrial() {
		
	}
	
	public void expandMusic() {
		
	}
	
	public void expandDeals() {
		
	}
}
