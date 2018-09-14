package com.ex1.Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		
		WebElement textBox;
		//Locate By Id
		textBox = driver.findElement(By.id("lst-ib"));
		textBox.sendKeys("Prince Patel");
		
		//Locate By Name
		/*textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("Prince Patel");*/
		
		//Locate By Class
		/*textBox = driver.findElement(By.className("gsfi"));
		textBox.sendKeys("Prince Patel");*/
		
		//Locate By Tag Name
		/*List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(int i = 0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}*/
		
		//Locate By Link Text
		//driver.findElement(By.linkText("Gmail")).click();
		
		//Locate By Partial Link Text
		//driver.findElement(By.partialLinkText("Gmail")).click();
		
		//Locate By Css
		/*textBox = driver.findElement(By.cssSelector("input#lst-ib"));
		textBox.sendKeys("Chetan Kanani");*/
		
		//Locate By XPath
		/*textBox = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		textBox.sendKeys("Chetan Kanani");*/		
		
		Thread.sleep(2000);
		driver.close();
	}

}
