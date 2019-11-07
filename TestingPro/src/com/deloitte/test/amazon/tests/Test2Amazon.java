package com.deloitte.test.amazon.tests;
import com.deloitte.test.amazon.configuracion.Configuracion;
import com.deloitte.test.amazon.page.home.AmazonHome;

import java.util.logging.Logger;
public class Test2Amazon {
	//static AmazonHome ama = new AmazonHome(null);
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main (String [] args) throws InterruptedException {	
		
		System.out.println("Starting testcase 1");
		Configuracion cnf = new Configuracion();
		
		AmazonHome amaHome = new AmazonHome(cnf.getDriver());
		amaHome.loginUser();
	}

}