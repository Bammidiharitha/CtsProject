package com.Pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckCart {
	WebDriver driver;
	// inspecting the elements in page
	By Myaccount=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By Email=By.id("input-email");
	By password=By.id("input-password");
	By loginbtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	By cart=By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span");
	By item=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a");
	By product=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a");
	
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
	
	public void check() 
	{
		// performing actions on the elements
		driver.findElement(Myaccount).click();
		WebElement link =driver.findElement(Myaccount); 
		WebElement link2=driver.findElement(login);
		Actions action = new Actions(driver);
		action.moveToElement(link);
		action.moveToElement(link2).click().perform();
		driver.findElement(Email).sendKeys("bammidiharitha11@gmail.com");
		driver.findElement(password).sendKeys("Haritha@05");
		driver.findElement(loginbtn).click();
		driver.findElement(cart).click();
	}
	public void assert1() {
		
		String item1= driver.findElement(item).getText();
		driver.navigate().to("https://demo.opencart.com/index.php?route=product/category&path=24");
		String product1=driver.findElement(product).getText();
	 Assert.assertEquals(item1, product1); // assertEquals  compares the actual and expected value
	 driver.close();
		
	}
}
