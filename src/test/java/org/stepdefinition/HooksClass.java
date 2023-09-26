package org.stepdefinition;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	
	@Before
	public void Before() {

		 chromebrowser();
	      urllaunch("https://rahulshettyacademy.com/seleniumPractise/#/");
	      maximize();
	      implicitywait(10);
	      System.out.println(new Date());
	}
	@After
	public void After(Scenario sc) throws IOException {

		if (sc.isFailed()) {
			screenshotwithbyte(sc);
			
		}
		
		quit();
	}
}
