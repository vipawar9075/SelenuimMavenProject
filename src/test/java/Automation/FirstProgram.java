package Automation;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
	
	WebDriver  driver =new ChromeDriver();
	
	driver.get("https://ekyc.aliceblueonline.com/otp-validate");
	


	}

}
