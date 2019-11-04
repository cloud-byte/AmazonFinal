package com.deloitte.test.amazon.tests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.deloitte.test.amazon.configuracion.Configuracion;
import com.deloitte.test.amazon.page.home.AmazonHome;
public class Test1Amazon {
	static AmazonHome ama = new AmazonHome();
	
	public static void main (String [] args) throws InterruptedException {
		ama.verMain();
		
		ama.clickHoliDeals();
		
		
	}

}
