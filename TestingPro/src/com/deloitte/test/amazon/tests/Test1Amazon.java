package com.deloitte.test.amazon.tests;
import org.openqa.selenium.JavascriptExecutor;
import com.deloitte.test.amazon.configuracion.Configuracion;
import com.deloitte.test.amazon.page.home.AmazonFooter;
import com.deloitte.test.amazon.page.home.AmazonHome;
import com.deloitte.test.amazon.page.home.AmazonSignIn;

import java.util.logging.Logger;
public class Test1Amazon {
	//static AmazonHome ama = new AmazonHome(null);
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main (String [] args) throws InterruptedException {		
		Configuracion cnf = new Configuracion();
		JavascriptExecutor js = cnf.getJs();
		AmazonFooter amaFt = new AmazonFooter(cnf.getDriver());
		AmazonHome amaHome = new AmazonHome(amaFt.getDriver());
		AmazonSignIn amaSign = new AmazonSignIn(amaFt.getDriver());
		amaHome.clickSignIn();
		amaSign.InputEmail("Fernanflo1222@gmail.com");
		amaSign.ClickContinue();
		amaSign.getFail();
		amaSign.clickCreateAccount();
		amaSign.RegisterForm(0, "Richy");
		amaSign.RegisterForm(1, "Richy1222@gmail.com");
		amaSign.RegisterForm(2, "Richy2323");
		amaSign.RegisterForm(3, "Richy2323");
		amaSign.RegisterForm(4, "Yoh");
		
		
		
	}

}