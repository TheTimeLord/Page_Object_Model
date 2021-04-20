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
	
	public void expandFashion(String selection) {
		WebElement menu = driver.findElement(By.linkText("Fashion"));
		builder.moveToElement(menu).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(selection)));
		WebElement menuOption = driver.findElement(By.linkText(selection));
		menuOption.click();
	}

	public void expandElectronics(String selection) {
		WebElement menu = driver.findElement(By.linkText("Electronics"));
		builder.moveToElement(menu).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(selection)));
		WebElement menuOption = driver.findElement(By.linkText(selection));
		menuOption.click();
	}
	
	public void expandCollectiblesAndArt(String selection) {
		WebElement menu = driver.findElement(By.linkText("Collectibles & Art"));
		builder.moveToElement(menu).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(selection)));
		WebElement menuOption = driver.findElement(By.linkText(selection));
		menuOption.click();
	}
	
	public void expandHomeAndGarden(String selection) {
		WebElement menu = driver.findElement(By.linkText("Home & Garden"));
		builder.moveToElement(menu).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(selection)));
		WebElement menuOption = driver.findElement(By.linkText(selection));
		menuOption.click();
	}
	
	public void expandSportingGoods(String selection) {
		WebElement menu = driver.findElement(By.linkText("Sporting Goods"));
		builder.moveToElement(menu).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(selection)));
		WebElement menuOption = driver.findElement(By.linkText(selection));
		menuOption.click();
	}
	
	public void expandToys(String selection) {
		WebElement menu = driver.findElement(By.linkText("Toys"));
		builder.moveToElement(menu).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(selection)));
		WebElement menuOption = driver.findElement(By.linkText(selection));
		menuOption.click();
	}
	
	public void expandBusinessAndIndustrial(String selection) {
		WebElement menu = driver.findElement(By.linkText("Business & Industrial"));
		builder.moveToElement(menu).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(selection)));
		WebElement menuOption = driver.findElement(By.linkText(selection));
		menuOption.click();
	}
	
	public void expandMusic(String selection) {
		WebElement menu = driver.findElement(By.linkText("Music"));
		builder.moveToElement(menu).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(selection)));
		WebElement menuOption = driver.findElement(By.linkText(selection));
		menuOption.click();
	}
	
	public void expandDeals(String selection) {
		WebElement menu = driver.findElement(By.linkText("Deals"));
		builder.moveToElement(menu).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(selection)));
		WebElement menuOption = driver.findElement(By.linkText(selection));
		menuOption.click();
	}
}
