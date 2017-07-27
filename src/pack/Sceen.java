package pack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sceen
{
	  WebDriver driver;
	  
	@BeforeClass
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dlc\\Downloads\\seleniumlib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		  
		
	}
	
	@Test(description="register facebook")
	public void login() throws IOException
	{
		driver.get("file:///C:/Users/dlc/Desktop/ff/file.html");
		Reporter.log("facebook started");
		
		driver.findElement(By.xpath(".//*[@id='1']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\dlc\\Desktop\\ff\\File1.exe");
		
		 Utility.capture(driver, "same page");
	}
	

	

}
