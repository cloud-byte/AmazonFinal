package com.deloitte.test.amazon.tests;
import org.openqa.selenium.JavascriptExecutor;
import com.deloitte.test.amazon.configuracion.Configuracion;
import com.deloitte.test.amazon.page.home.AmazonFooter;
import com.deloitte.test.amazon.page.home.AmazonHome;
import com.deloitte.test.amazon.page.home.AmazonSignIn;
import com.deloitte.test.amazon.page.home.AmazonSearchResult;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Test1Amazon {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main (String [] args) throws InterruptedException {	
		
		LOGGER.log(Level.INFO, "Starting testcase 1");
		Configuracion cnf = new Configuracion();
		JavascriptExecutor js = cnf.getJs();

		AmazonHome amaHome = new AmazonHome(cnf.getDriver());
		AmazonSearchResult amaSearch = new AmazonSearchResult(amaHome.getDriver());
		
		amaHome.findBar("htc-vive");
		amaSearch.clickElement(4);
		LOGGER.log(Level.INFO, amaSearch.getDescription());
		LOGGER.log(Level.INFO, "Testcase 1 finished");
		
	}

}