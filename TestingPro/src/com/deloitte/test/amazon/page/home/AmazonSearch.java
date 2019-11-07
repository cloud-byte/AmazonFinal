package com.deloitte.test.amazon.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
public class AmazonSearch {
	private WebDriver driver; 
	public AmazonSearch(WebDriver driver) {
		this.driver = driver;
	}
	public void clickFilterCheckBox(int noElement)
	{
		List<WebElement> myElements = driver.findElements(By.xpath("//li[starts-with(@id,'p_')]//i[@class='a-icon a-icon-checkbox']"));
		//li[starts-with(@id,'p_')]//i[@class='a-icon a-icon-checkbox']CHECKBOS
		//li[starts-with(@id,'n/')]//a[@class='a-link-normal s-navigation-item'] DEPARTAMENTOS		
		//li[starts-with(@id,'p_')]//a[@class='a-link-normal s-navigation-item']
		//*[@class='a-icon a-icon-checkbox' or @class='a-link-normal s-navigation-item']	
		System.out.println(myElements.get(noElement).getText());
        myElements.get(noElement).click();
	}
	public void clickElementResult(int indexElement) {
		driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index="+indexElement+"']//img[@class='s-image']")).click();
	}
	public String  getDescription() {
		String texto = "";
		try { //no todos los articulos tienen el mismo id en el div de descripcion
			texto = driver.findElement(By.xpath("//div[@id='productDescription_feature_div']//div[@id='productDescription_feature_div']")).getText();
		} catch (Exception e) {
			texto = driver.findElement(By.xpath("//div[@id='productDescription']")).getText();
		}
		return texto;
	} 
}
