package Automation;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import com.opencsv.CSVReader;
import org.openqa.selenium.JavascriptExecutor;

public class WhatsappProgram2 {

	public static void main(String[] args) throws Exception {

		String csvFile = "C:\\Users\\91928\\vikas-workspace\\seleniumMavenproject\\testdata\\sample1.csv";
		BufferedReader br = null;
		String line = "";

		// ChromeOptions optionsBeta = new ChromeOptions();
		// optionsBeta.setBinary("C:\\Program
		// Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32 (2)\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		try {
			String baseUrl = "https://web.whatsapp.com/";
			driver.get(baseUrl);

			WebDriverWait wt = new WebDriverWait(driver, 40);

			WebElement SearchBar = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p)[1]")));

			String a[] = { " Vikas Pawar" }; // Here name of the user should be unique

			for (int i = 0; i < a.length; i++) {
				WebElement ser = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p)[1]")));
				ser.sendKeys(a[i]);

				Thread.sleep(3000);

				WebElement ClickonMatch = wt.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//span[@class='matched-text _11JPr']")));
				ClickonMatch.click();

				WebElement e = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p)[2]")));
				e.click();

				e.sendKeys("HOW ARE YOU ");

				driver.findElement(By.xpath("//span[@data-testid='send']")).click();

				Thread.sleep(2000);

			}
		} finally {

			Thread.sleep(2000);

			
			((JavascriptExecutor) driver).executeScript("window.open()");

			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));

			driver.get("https://web.whatsapp.com/");
			
			driver.findElement(By.xpath("(//span[@data-testid='menu'])[1]")).click();
			 
			List<WebElement> options = driver.findElements(By.xpath("//div[@class='iWqod _1MZM5 _2BNs3']"));
			
			// driver.findElement(By.xpath("(//div[@class='iWqod _1MZM5 _2BNs3'])[6]")).click();
			System.out.println(+options.size());
		     for (int i=0 ;i<options.size(); i++) {
		    	 
		    	 String value = options.get(i).getText();
		    	 
		    	 if(value.equals("Log out")) {
		    		 options.get(i).click();
		    	 }
		    	 
		    	     }
		     
		   //  WebElement popup = driver.findElement(By.xpath("//div[@class='cm280p3y p357zi0d tvf2evcx oq44ahr5 lb5m6g5c f8m0rgwh hblzrxh7 s7fqlky6 h1a80dm5 r219jyu0 sta02ykp gfz4du6o r7fjleex b19fvycv fe61fa5g qj4wrk6p cphhpnv8 tfm3omh7 paav9g0k']"));
		   //  driver.switchTo().frame(popup);
	
		     
		     
		     driver.findElement(By.xpath("//button[@data-testid='popup-controls-ok']")).click();
			WebDriverWait wt = new WebDriverWait(driver, 40);

			WebElement SearchBar = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p)[1]")));

			String a[] = { "+91 9284512547" }; // Here name of the user should be unique

			for (int i = 0; i < a.length; i++) {
				WebElement ser = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p)[1]")));
				ser.sendKeys(a[i]);

				Thread.sleep(3000);

				WebElement ClickonMatch = wt.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//span[@class='matched-text _11JPr']")));
				ClickonMatch.click();

				WebElement e = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p)[2]")));
				e.click();

				e.sendKeys(" I AM FINE ");

				driver.findElement(By.xpath("//span[@data-testid='send']")).click();

				Thread.sleep(2000);


		}

	}
	}
}
