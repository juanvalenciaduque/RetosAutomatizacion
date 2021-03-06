package co.com.googleutilities;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;

import org.openqa.selenium.TakesScreenshot;

public class BasePage {
	static public WebDriver driver;
	public WebDriverWait wait;

	// Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 15);
	}

	// Wait Wrapper Method
	public void waitVisibility(By elementBy) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
	}

	// Click Method
	public void click(By elementBy) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).click();
	}

	public void submit(By elementBy) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).submit();
	}

	// Write Text
	public void writeText(By elementBy, String text) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).sendKeys(text);
	}

	// Read Text
	public String readText(By elementBy) {
		waitVisibility(elementBy);
		return driver.findElement(elementBy).getText();
	}

	// Assert
	public void assertEquals(By elementBy, String expectedText) {
		waitVisibility(elementBy);
		// Assert.assertEquals(readText(elementBy), expectedText);
	}

	public void getEvidence(String nombre) throws Exception {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/selenium/" + nombre + ".png"));
	}

	public Scenario getEvidenceOnReport(Scenario scenario, WebDriver driver) throws Exception {
		scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
		return scenario;
	}

	public static boolean explicitWait(String dato) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 1);
			wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(dato)));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void HighlightCart(WebElement Product, String px, String color) {
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='" + px + "px solid " + color + "'",
					Product);
		}
	}
}