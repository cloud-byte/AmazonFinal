package com.deloitte.test.amazon.tests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.deloitte.test.amazon.configuracion.Configuracion;
import com.deloitte.test.amazon.page.home.AmazonFooter2;
import com.deloitte.test.amazon.page.home.AmazonHome;
public class Test1Amazon {
	static AmazonHome ama = new AmazonHome();
	static AmazonFooter2 amaft2 = new AmazonFooter2();
	
	public static void main (String [] args) throws InterruptedException {
		Configuracion conf = new Configuracion();
		WebDriver driver = conf.getDriver();
		JavascriptExecutor js = conf.getJs();
		
		
	
		
		
	}

}
