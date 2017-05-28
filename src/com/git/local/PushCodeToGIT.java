package com.git.local;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PushCodeToGIT {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\AutomationSoftwares\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
	}

}
