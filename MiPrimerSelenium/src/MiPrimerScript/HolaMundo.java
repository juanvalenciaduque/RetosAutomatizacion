package MiPrimerScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class HolaMundo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com.uy");
		driver.findElement(By.name("q")).sendKeys("Selenium Screenshot java");
		driver.findElement(By.name("btnK")).submit();
		driver.manage().window().maximize();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:/selenium/Captura1.png"));
		} catch (IOException e) {
		}
	}
}
