package techbee.poa.pages;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
	
	// TODO: Today's Deal, fix overloaded method
	
	public void todaysDeals() {
		WebElement ele = driver.findElement(By.linkText("Today's Deals - All With Free Shipping"));
		ele.click();
	}

/*
	public void todaysDeals(int selection) throws InterruptedException {
		WebElement itemList = driver.findElement(By.id("items_list1"));
		List<WebElement> elements = itemList.findElements(By.className("hl-image"));
		
		if(selection >= elements.size())
			selection = elements.size() - 1;
		
		// press the next button on the carousel until product is in sight
		WebElement button = driver.findElement(By.xpath("/html/body/div[6]/div[12]/div[2]/div/div/button[2]"));
		for(int i=selection; i > 5; i-=5) {
			button.click();
			Thread.sleep(200);
		}
		
		elements.get(selection).click();
	}
*/

	
	// TODO: Search, Search by Category
	
	public void search(String input) {
		WebElement searchbar = driver.findElement(By.id("gh-ac"));
		WebElement button = driver.findElement(By.id("gh-btn"));
		searchbar.sendKeys(input);
		button.click();
	}
	
	public void search(String input, String cat) {
		WebElement searchbar = driver.findElement(By.id("gh-ac"));
		WebElement button = driver.findElement(By.id("gh-btn"));
		Select category = new Select(driver.findElement(By.id("gh-cat")));
		
		category.selectByVisibleText(cat);
		searchbar.sendKeys(input);
		button.click();
	}
	
	// TODO: Sign in
	
	// TODO: Advanced Search
	
	public void advancedSearch() {
		WebElement ele = driver.findElement(By.id("gh-as-a"));
		ele.click();
	}
	
	
}
