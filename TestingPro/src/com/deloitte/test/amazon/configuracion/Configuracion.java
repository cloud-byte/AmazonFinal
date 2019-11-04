package com.deloitte.test.amazon.configuracion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuracion {

	private static  JavascriptExecutor js = null;
	private static  WebDriver driver = null;
	
	public  JavascriptExecutor getJs() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}


	public  WebDriver getDriver() {
		return config();
		}
	
	private WebDriver config() {
		
		

		String path = System.getProperty("user.home");
		String chromeDriverPath= path+"\\Documents\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	    return driver;
		
	
	}
	
	
	
	

	
	
	    

}
