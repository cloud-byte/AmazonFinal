package com.deloitte.test.amazon.page.home;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.deloitte.test.amazon.configuracion.Configuracion;
public class AmazonHome {
	/*Configuracion conf = new Configuracion();
	WebDriver driver = conf.getDriver();
	JavascriptExecutor js = conf.getJs();*/
	
	//public  void verMain() {
		
	//}
	public void clickLogo(WebDriver driver) {
		driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']")).click();;
	}
	public void clicktodaydeals(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();
	}
	public void clickhelp(WebDriver driver) {
		driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Help')]")).click();
	}
	public void clickRegistry(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Registry')]")).click();
		//YO
	}
	public void clickGift(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
	}
	public void clickSell(WebDriver driver) {
		driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Sell')]")).click();
	}
	public void clickMyAmazon(WebDriver driver) {
		driver.findElement(By.xpath("//a[@id='nav-your-amazon']")).click();
	}
	public void clickSignIn(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	}
	public void clickReturnOrders(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(text(),'Returns')]")).click();
	}
	public void clickCart(WebDriver driver) {
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	}
	public void clickMenuLeft(WebDriver driver) {
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
	}
	public void clickLocation(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"nav-global-location-slot\"]/span/a")).click();
	}
	public void clickHoliDeals(WebDriver driver) throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='nav-imageHref']//img")).click();
	}
	public void clickDepartments(WebDriver driver) {
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
	}
	public void findBar(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Tablet");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
	}
	public void clickLanguage(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[1]/span")).click();
	}
}
// update pushed RicA
