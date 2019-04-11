package co.com.googleutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private WebDriver driver;
	
		public Driver(WebDriver driver) {
				this.driver = driver;
	}


	public WebDriver InicializarDriver(String Page) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get(Page);
	    driver.manage().window().maximize();
        return driver;
    	}
	

	
	
	
}
