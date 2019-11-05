package com.deloitte.test.amazon.page.home;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.deloitte.test.amazon.configuracion.Configuracion;
public class AmazonFooter1 {
	/*Configuracion conf = new Configuracion();
	WebDriver driver = conf.getDriver();
	JavascriptExecutor js = conf.getJs();*/
	
	//public  void verMain() {
		
	//}
	
	//Get to Know Us

	public void clickCareers(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();
	}
	public void clickBlog(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();

	}
	public void clickAboutAmazon(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'About Amazon')]")).click();

	}
	public void clickInvestorRelations(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Investor Relations')]")).click();

	}
	public void clickAmazonDevices(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Amazon Devices')]")).click();

	}
	public void clickAmazonTours(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Amazon Tours')]")).click();

	}
	
	//Make Money with Us
	public void clickSellOnAmazon(WebDriver driver) {
		driver.findElement(By.xpath("//li[@class='nav_first']//a[@class='nav_a'][contains(text(),'Sell on Amazon')]")).click();

	}
	public void clickSellYourServicesOnAmazon(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Sell Your Services on Amazon')]")).click();

	}
	public void clickSellOnAmazonBusiness(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Sell on Amazon Business')]")).click();

	}
	public void clickSellYourAppsOnAmazon(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Sell Your Apps on Amazon')]")).click();

	}
	public void clickBecomeAnAffiliate(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Become an Affiliate')]")).click();

	}
	public void clickAdvertiseYourProducts(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Advertise Your Products')]")).click();

	}
	public void clickSelfPublishWithUs(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Self-Publish with Us')]")).click();

	}
	public void clickSeeMore(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'See More')]")).click();

	}
	
	//Amazon Payment Products
	public void clickAmazonBusinessCard(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Amazon Business Card')]")).click();

	}
	public void clickShopWithPoints(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Shop with Points')]")).click();

	}
	public void clickReloadYourBalance(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Reload Your Balance')]")).click();

	}
	public void clickAmazonCurrencyConverter(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Amazon Currency Converter')]")).click();

	}
	
	//Let Us Help You
	public void clickYourAccount(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Your Account')]")).click();

	}
	public void clickOrders(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Your Orders')]")).click();

	}
	public void clickShippingRatesPolicies(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Shipping Rates & Policies')]")).click();

	}
	public void clickReturnsReplacements(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Returns & Replacements')]")).click();

	}
	public void clickManageYourContentAndDevices(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Manage Your Content and Devices')]")).click();

	}
	public void clickAmazonAssistant(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Amazon Assistant')]")).click();

	}
	public void clickHelp(WebDriver driver) {
		driver.findElement(By.xpath("//a[@class='nav_a'][contains(text(),'Help')]")).click();

	}
}
