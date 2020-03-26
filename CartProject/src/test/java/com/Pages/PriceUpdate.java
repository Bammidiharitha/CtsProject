package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PriceUpdate {
	WebDriver driver;
	// inspecting elements in the application
	By Myaccount=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By Email=By.id("input-email");
	By password=By.id("input-password");
	By loginbtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	By cart=By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span");
	By Quantity=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input");
	By button=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]");
	
	public void url(String browser) //  launching the application using multiple browsers
	{ 
			if(browser.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\CartProject\\Driver\\chromedriver.exe\\");
				driver = new ChromeDriver(); // to launch the application in chrome browser
			}
			else
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "E:\\Eclipse\\CartProject\\Driver\\geckodriver.exe\\");
				driver = new FirefoxDriver(); // to launch the application in firefox browser
			}
		driver.manage().window().maximize();  // maximizes the browser
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); // providing waiting time
		
	}
	public void homepage() //using webdriver get visting the testing website
	{
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
	}
	
	public void actions() 
	{
		driver.findElement(Myaccount).click();
		WebElement link =driver.findElement(Myaccount); 
		WebElement link2=driver.findElement(login);
		Actions action = new Actions(driver); // actions class to perform mouse actions
		action.moveToElement(link); 
		action.moveToElement(link2).click().perform();
		driver.findElement(Email).sendKeys("bammidiharitha11@gmail.com");
		driver.findElement(password).sendKeys("Haritha@05");
		driver.findElement(loginbtn).click();
		driver.findElement(cart).click();

}
	public void Screenshot(String path) throws IOException{
		TakesScreenshot ts =((TakesScreenshot)driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(path));
	}
	public void incquan() throws InterruptedException {
		driver.findElement(Quantity).clear();
		driver.findElement(Quantity).sendKeys("2");
		driver.findElement(button).click();
		Thread.sleep(1000); // waiting time
		driver.close(); // closing the driver
	}
	
}