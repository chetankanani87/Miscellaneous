package com.ex1.Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {
		try {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.ca/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
