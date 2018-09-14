package com.ex1.Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		
		//Get Title
		System.out.println("Title is: " + driver.getTitle());
		//Get Current Url
		System.out.println("Current URL is: "+ driver.getCurrentUrl());
		//Get Page Source
		System.out.println("Page Source: " + driver.getPageSource());
		//Difference Between Close and Quit
		//driver.close();
		//driver.quit();
	}

}
