package com.deloitte.test.amazon.tests;
import org.openqa.selenium.JavascriptExecutor;
import com.deloitte.test.amazon.configuracion.Configuracion;
import com.deloitte.test.amazon.page.home.AmazonFooter;
import java.util.logging.Logger;
public class Test1Amazon {
	//static AmazonHome ama = new AmazonHome(null);
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main (String [] args) throws InterruptedException {		
		Configuracion cnf = new Configuracion();
		JavascriptExecutor js = cnf.getJs();
		AmazonFooter amaHome = new AmazonFooter(cnf.getDriver());
		amaHome.clickWebElement(2);
	}

}