package com.hooks;

import com.basepage.BasePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class OrangeHrmHooks extends BasePage {
	@Before
	public void setup() {
		init();
	}
	
	@After
	public void tearDown() {
		driver.quit();
		log.info("***** WebDriver Quit *****");
	}
}
