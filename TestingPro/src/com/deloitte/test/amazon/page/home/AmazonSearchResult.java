package com.deloitte.test.amazon.page.home;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AmazonSearchResult {
	
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private WebDriver driver;
	
	public AmazonSearchResult(WebDriver driver){
		this.driver = driver;
	}
	public WebDriver getDriver() {
		return (WebDriver) driver;
	}
	public void clickWebElement(int noElement){
		List<WebElement> myElements = driver.findElements(By.xpath("//a[@class='nav_a']"));
		LOGGER.log(Level.INFO, (myElements.get(noElement).getText()));
        myElements.get(noElement).click();
	}
	public void clickElementOne() {
		driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//img[@class='s-image']")).click();
	}
	public void clickElementTwo() {
		driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=1']//img[@class='s-image']")).click();
	}
	public void clickElementThree() {
		driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=2']//img[@class='s-image']")).click();
	}
	public void clickElementFour() {
		driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=3']//img[@class='s-image']")).click();
	}
	public void clickBrandFilter(int indexElement) {
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//li[@class='a-spacing-micro']//i["+indexElement+"]")).click();
	}
	public void clickBrandFilterHtc() {
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//li[@class='a-spacing-micro']//i[1]")).click();
	}
	public void clickBrandFilterHyper() {
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//li[@class='a-spacing-micro']//i[3]")).click();
	}
	public void clickBrandFilterOculus() {
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//li[@class='a-spacing-micro']//i[2]")).click();
	}
	public void clickBrandFilterFovitec() {
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//li[@class='a-spacing-micro']//i[4]")).click();
	}
	public void clickPriceFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_36')]["+indexElement+"]//a[@class='a-link-normal s-navigation-item']")).click();
	}
	public void clickDisplaySizeFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_size_browse-bin')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickTechnologyFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_feature_nineteen_browse-bin')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickConnectivityTypeSizeFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_feature_four_browse-bin')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickSOFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_operating_system_browse-bin')]["+indexElement+"]//a[@class='a-link-normal s-navigation-item']")).click();
	}
	public void clickFlashMemoryFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_feature_nine_browse-bin')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickFeatureKeywordsFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_feature_keywords_browse-bin')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickRamFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_feature_five_browse-bin')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickWeightFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_size_two_browse-vebin')]["+indexElement+"]//a[@class='a-link-normal s-navigation-item']")).click();
	}
	public void clickConditionFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_condition-type')]["+indexElement+"]//a[@class='a-link-normal s-navigation-item']")).click();
	}
	public void clickNewUpcomingFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_date')]["+indexElement+"]//a[@class='a-link-normal s-navigation-item']")).click();
	}
	public void clickGLobalStoreFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_global_store_origin_marketplace')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickSellerFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_6')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickAvailabilityFilter(int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_availability')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public String  getDescription() {
			return  driver.findElement(By.xpath("//div[@id='productDescription_feature_div']//div[@id='productDescription_feature_div'] | //div[@id='productDescription']")).getText();
	}	
}