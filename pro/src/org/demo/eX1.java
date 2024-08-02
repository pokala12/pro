package org.demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eX1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	 
		//To open the browser
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		//To delete cookies
		driver.manage().deleteAllCookies();
		//To set the size of the window
		Dimension d = new Dimension(500, 100);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		//To set the position of the window
		Point p = new Point(100, 250);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		//To maximize the window
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
	}

}
