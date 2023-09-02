package com.facebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestNgDataProviderAnnotation {

	/*@Test
	
	public void filePractice() {
		
		File f = new File("C:\\Users\\91928\\Downloads");
		
	//	System.out.println("File path is"+f.getPath());
		
		System.out.println(f.listFiles());
	File [] Files  =	f.listFiles();
	
	for(int i=0;i<Files.length;i++) {
		System.out.println(Files[i].getName());
	}*/
	
	WebDriver driver ;
	
	@BeforeClass
	
	public void setEnv() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@DataProvider
	public Object[][] dataSet() throws Exception{
		/*
		 * File src = new File(
		 * "C:\\Users\\91928\\vikas-workspace\\seleniumMavenproject\\object_repo.properties"
		 * );
		 * 
		 * FileInputStream fis = new FileInputStream(src);
		 * 
		 * Properties pro = new Properties(); pro.load(fis);
		 */
		
		Object arr[][]= new Object[3][2];
		
		arr[0][0]="Email_1";
		arr[0][1]="Password_1";
		
		arr[1][0]="Email_2";
		arr[1][1]="Password_2";
		
		arr[2][0]="Email_3";
		arr[2][1]="Password_3";
		
		return arr;
		
	}
	
	@Test(dataProvider ="dataSet")
	
	public void enterData(String userName ,String Password) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).clear();
		
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(userName);
		
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(Password);
		
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Test Case passed");
		
	}
		
	
	
	}

