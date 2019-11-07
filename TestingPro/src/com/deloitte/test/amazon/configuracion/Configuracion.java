package com.deloitte.test.amazon.configuracion;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuracion {
	private WebDriver driver;
	public JavascriptExecutor getJs() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}
	public WebDriver getDriver() {
		return config();
	}
	private WebDriver config() {
		String path = System.getProperty("user.home");
		String chromeDriverPath= path+"\\Documents\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	    return driver;
	}
}
