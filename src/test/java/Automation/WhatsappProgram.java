package Automation;

import java.awt.image.BufferedImage;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import javax.imageio.ImageIO;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.common.HybridBinarizer;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WhatsappProgram extends WhatsappProgram2 {


WebDriver driver ;
		
			//String baseUrl = "https://web.whatsapp.com/";
		//	driver.get(baseUrl);
baseUrl;

			WebDriverWait wt = new WebDriverWait(driver, 40);

			WebElement SearchBar = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p)[1]")));

			String a[] = { "9284512547" }; // Here name of the user should be unique

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
}
