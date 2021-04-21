package techbee.poa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchBar extends EbayBase {

	public SearchBar(WebDriver d) {
		super(d);
	}
	
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

}
