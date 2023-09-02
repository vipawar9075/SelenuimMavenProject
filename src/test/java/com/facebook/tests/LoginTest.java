package com.facebook.tests;

import org.testng.annotations.Test;
import com.facebook.pages.LoginPage;

public class LoginTest {
	
	/*@Test
	public void  loginTest() throws Exception {
		LoginPage lp = new LoginPage();
		lp.clickEmailOrPhone();
		lp.enterUsername();
		lp.clickPassword();
		lp.enterPassword();
		lp.clickLoginButton();
		
	}*/
	@Test
	public void ValidateLogin() {
		LoginPage lp = new LoginPage();
		lp.clickEmailOrPhone();
		lp.enterUsername();
		lp.clickPassword();
		lp.enterPassword();
		lp.clickLoginButton();
	
	}

	
	
}
