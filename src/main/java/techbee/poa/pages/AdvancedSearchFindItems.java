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
	
	public void price(Integer lower, Integer upper) {
		WebElement box = driver.findElement(By.id("_mPrRngCbx"));
		WebElement textbox1 = driver.findElement(By.name("_udlo"));
		WebElement textbox2 = driver.findElement(By.name("_udhi"));

		textbox1.sendKeys(lower.toString());
		textbox2.sendKeys(upper.toString());
	}
	
	public void buyingFormats(boolean auction, boolean now, boolean ads) {
		WebElement box1 = driver.findElement(By.id("LH_Auction"));
		WebElement box2 = driver.findElement(By.id("LH_BIN"));
		WebElement box3 = driver.findElement(By.id("LH_CAds"));
		
		if(auction)
			box1.click();
		if(now)
			box2.click();
		if(ads)
			box3.click();
	}
	
	public void condition(boolean isNew, boolean used, boolean unk) {
		WebElement box1 = driver.findElement(By.id("LH_ItemConditionNew"));
		WebElement box2 = driver.findElement(By.id("LH_ItemConditionUsed"));
		WebElement box3 = driver.findElement(By.id("LH_ItemConditionNS"));
		
		if(isNew)
			box1.click();
		if(used)
			box2.click();
		if(unk)
			box3.click();
	}
	
	public void listings(int timeframe, int time) {
		WebElement box = driver.findElement(By.name("LH_Time"));
		Select timeWindow = new Select(driver.findElement(By.name("_ftrt")));
		Select timeAmount = new Select(driver.findElement(By.name("_ftrv")));
		
		timeWindow.selectByIndex(timeframe);
		timeAmount.selectByIndex(time);
	}
	
	public void numBids(Integer lower, Integer upper) {
		WebElement box = driver.findElement(By.name("LH_NOB"));
		WebElement textbox1 = driver.findElement(By.name("_sabdlo"));
		WebElement textbox2 = driver.findElement(By.name("_sabdhi"));

		box.click();
		textbox1.sendKeys(lower.toString());
		textbox2.sendKeys(upper.toString());
	}
	
	public void multiListing(Integer lower, Integer upper) {
		WebElement box = driver.findElement(By.name("LH_MIL"));
		WebElement textbox1 = driver.findElement(By.name("_samilow"));
		WebElement textbox2 = driver.findElement(By.name("_samihi"));

		box.click();
		textbox1.sendKeys(lower.toString());
		textbox2.sendKeys(upper.toString());
	}
	
	// TODO: finish methods
	
	
}
