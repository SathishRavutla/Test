package com.sathish.testing.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hello {
	
	
	@Test
	public void testApp(){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/resources/chromedriver_win32.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
	}

}
