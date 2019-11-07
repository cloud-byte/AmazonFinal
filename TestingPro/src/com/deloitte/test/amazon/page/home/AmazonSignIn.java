package com.deloitte.test.amazon.page.home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AmazonSignIn{
	private WebDriver driver; 
	
	//
	public AmazonSignIn(WebDriver driver) {
		this.driver = driver;
	}
	
	public void InputEmail(String email) {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(email);
	}
	public void ClickContinue() {
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	public void getFail() {
		String a = driver.findElement(By.xpath("//div[@id='auth-error-message-box']//div[@class='a-box-inner a-alert-container']")).getText();
		System.out.println(a);
	}
	public void clickCreateAccount() {
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']	")).click();
	}
	public void RegisterForm(int noElement,String Data)
	{
		
		//jerrys update
		List<WebElement> myElements = driver.findElements(By.xpath("//input[@id]"));
		System.out.println(myElements.get(noElement).getText());
		
		if(noElement== 4) {
        myElements.get(noElement).click();
        }
		else {
	    myElements.get(noElement).sendKeys(Data);	
		}
	
	//input[@id='ap_customer_name']
	
	
	
}
}