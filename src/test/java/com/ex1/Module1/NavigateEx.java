package com.ex1.Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Navigate To
		driver.navigate().to("http://www.youtube.com");
		Thread.sleep(2000);
		
		//Back
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//Refresh
		driver.navigate().refresh();
		
		//Browser window close
		Thread.sleep(2000);
		driver.close();
	}

}
