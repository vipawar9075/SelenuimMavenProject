package Automation;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatTestng {
	
	
	@DataProvider
	public Object[][] sendData (){
		
		Object array[][] = new Object[2][2];
		
		array[0][0] = "Vikas Pawar";
		array[0][1] ="chrome";
		
		return array ;
	}

	
	@Test(dataProvider ="sendData")
		
		public void login (String userName , String BrowserName ) throws IOException {
		
		DesiredCapabilities cap = null ;
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
			
		RemoteWebDriver driver = new RemoteWebDriver( new URL("http://localhost:8080/wd/hub") , cap);
		
			driver.get("https://web.whatsapp.com/");
		}
		}
	}

