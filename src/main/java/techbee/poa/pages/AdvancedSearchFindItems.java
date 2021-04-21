package techbee.poa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearchFindItems extends AdvancedSearch {
	public AdvancedSearchFindItems(WebDriver d) {
		super(d);
	}
	
	public void search() {
		WebElement button = driver.findElement(By.id("searchBtnLowerLnk"));
		button.click();
	}
	
	public void includeKeywords(String keywords, int order) {
		WebElement textbox = driver.findElement(By.id("_nkw"));
		textbox.sendKeys(keywords);
		
		Select orderType = new Select(driver.findElement(By.id("_in_kw")));
		orderType.selectByIndex(order);
	}
	
	public void excludeKeywords(String keywords) {
		WebElement textbox = driver.findElement(By.id("_ex_kw"));
		textbox.sendKeys(keywords);
	}
	
	public void category(String cat) {
		Select category = new Select(driver.findElement(By.id("e1-1")));
		category.selectByVisibleText(cat);
	}
	
	public void searchIncluding(boolean titleDesc, boolean compList, boolean soldList) {
		WebElement box1 = driver.findElement(By.id("LH_TitleDesc"));
		WebElement box2 = driver.findElement(By.id("LH_Complete"));
		WebElement box3 = driver.findElement(By.id("LH_Sold"));
		
		if(titleDesc)
			box1.click();
		if(compList)
			box2.click();
		if(soldList)
			box3.click();
	}
	
	
	
}
