package com.rameshsoft.job.jobhardwork;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WdmProgs {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = WebDriverManager.chromedriver().create();
		List<WebDriver> list = WebDriverManager.chromedriver().create(5);
		
		for(WebDriver webDriver : list)
		{
			webDriver.get("https://www.google.com");
			Thread.sleep(2000);
			webDriver.close();
		}
		System.out.println("java");
		
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.gmail.com");
		
		WebElement un = driver.findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("rameshsoft.9177791456");
		
		Thread.sleep(5000);
		driver.close();
		
		*/
		
		
		
		
		
	}
	
}
