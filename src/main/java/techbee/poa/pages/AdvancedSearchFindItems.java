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

		box.click();
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
		
		box.click();
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
	
	public void itemsListedAsLots() {
		WebElement box = driver.findElement(By.id("LH_Lots"));
		box.click();
	}
	
	public void saleItems() {
		WebElement box = driver.findElement(By.id("LH_SaleItems"));
		box.click();
	}
	
	public void bestOffer() {
		WebElement box = driver.findElement(By.id("LH_BO"));
		box.click();
	}
	
	public void ebayForCharity() {
		WebElement box = driver.findElement(By.id("LH_Charity"));
		box.click();
	}
	
	public void freeShipping() {
		WebElement box = driver.findElement(By.id("LH_FS"));
		box.click();
	}
	
	public void localPickup() {
		WebElement box = driver.findElement(By.id("LH_LPickup"));
		box.click();
	}
	
	public void locationDistance(int dist, Integer zip) {
		WebElement button = driver.findElement(By.id("LH_Located"));
		Select chooseDist = new Select(driver.findElement(By.name("_sadis")));
		WebElement zipBox = driver.findElement(By.name("_stpos"));
		
		button.click();
		chooseDist.selectByIndex(dist);
		zipBox.sendKeys(zip.toString());
	}
	
	public void preffetedLocation(int location) {
		WebElement button = driver.findElement(By.id("LH_PrefLocRadio"));
		Select locationChoice = new Select(driver.findElement(By.id("_sargnSelect")));
		
		button.click();
		locationChoice.selectByIndex(location);
	}
	
	public void locatedIn(String country) {
		WebElement button = driver.findElement(By.id("LH_LocatedInRadio"));
		Select countryChoice = new Select(driver.findElement(By.name("_salic")));
		
		button.click();
		countryChoice.selectByVisibleText(country);
	}
	
	public void specificSellers(boolean include, String seller) {
		WebElement button1 = driver.findElement(By.id("_fss"));
		WebElement button2 = driver.findElement(By.id("LH_SpecificSeller_id"));
		Select inclExcl = new Select(driver.findElement(By.id("_saslop")));
		WebElement textbox = driver.findElement(By.id("_sasl"));
		
		button1.click();
		button2.click();
		if(include)
			inclExcl.selectByIndex(0);
		else
			inclExcl.selectByIndex(1);
		textbox.sendKeys(seller);
	}
	
	public void savedSeller() {
		WebElement button1 = driver.findElement(By.id("_fss"));
		WebElement button2 = driver.findElement(By.id("LH_FavSellers_id"));
		button1.click();
		button2.click();
	}
	
	public void sellerEbay() {
		WebElement button1 = driver.findElement(By.id("_fss"));
		WebElement button2 = driver.findElement(By.id("LH_SellerWithStore_id"));
		button1.click();
		button2.click();
	}
	
	public void sortBy(int choice) {
		Select match = new Select(driver.findElement(By.id("LH_SORT_BY")));
		match.selectByIndex(choice);
	}
	
	public void viewResults(int choice) {
		Select match = new Select(driver.findElement(By.id("LH_VIEW_RESULTS_AS")));
		match.selectByIndex(choice);
	}
	
	public void resultsPerPage(int choice) {
		Select match = new Select(driver.findElement(By.id("LH_IPP")));
		match.selectByIndex(choice);
	}
	
	public void clearOptions() {
		WebElement ele = driver.findElement(By.linkText("Clear options"));
		ele.click();
	}
}
