package com.facebook.genericPage;

import java.io.FileInputStream;

import org.openqa.selenium.interactions.Actions;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;
	public Properties prop;
	public Properties or;

	// Constructor

	@BeforeMethod
	public void MasterPage1() throws Exception {

		// configuration Properties file

		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\Repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);

		// configuration Locators file

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\Repository\\locators.properties");
		or = new Properties();
		or.load(fs);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91928\\vikas-workspace\\seleniumMavenproject\\com.facebook.drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		}
			

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	public void click(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}

	public void enterData(String xpathkey, String testData) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(or.getProperty(testData));
	}

	public void clearData(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();
	}

	public void moveToElement(String xpathkey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathkey)))).build().perform();
	}

	public void clickListElement(String xpathkey, String testData) {
		List<WebElement> radios = driver.findElements(By.xpath(or.getProperty(xpathkey)));
		for (int i = 0; i < radios.size(); i++) {
			if (radios.get(i).getText().equalsIgnoreCase(or.getProperty(xpathkey))) {
				radios.get(i).click();
			}
		}
	}

	public void selectDropdownValue(String xpathkey, String testData1, String testData2) {
		WebElement bm = driver.findElement(By.xpath(or.getProperty(xpathkey)));
		Select month = new Select(bm);
		month.selectByVisibleText(or.getProperty(testData1));
		month.selectByValue(or.getProperty(testData2));
	}

}
