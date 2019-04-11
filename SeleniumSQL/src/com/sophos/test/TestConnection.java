package com.sophos.test;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TestConnection {

	public static void main(String[] args) throws IOException {
		Conexion conexion = new Conexion();
		Connection cn = null;
		ResultSet rs = null;
		Statement stm = null;
		Statement stm1 = null;

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			cn = conexion.conectar();
			stm = (Statement) cn.createStatement();
			stm1 = (Statement) cn.createStatement();
			rs = stm.executeQuery("SELECT *  FROM validar");

			while (rs.next()) {
				String Nombre = rs.getString(1);
				System.out.println("Nombre: " + Nombre);
				driver.get("https://www.google.com.uy");
				driver.manage().window().maximize();
				driver.findElement(By.name("q")).sendKeys(Nombre);
				driver.findElement(By.name("btnK")).submit();

				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				try {
					WebDriverWait wait = new WebDriverWait(driver, 2);
					wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(Nombre)));
					FileUtils.copyFile(src, new File(
							"C:\\Users\\SEMILLERO05\\eclipse-workspace\\MySQL\\Evidencia\\" + Nombre + ".png"));
					System.out.println("Encontrado");
					stm1.executeUpdate("UPDATE validar SET Nombre='" + Nombre + "',Estado='Encontrando' WHERE Nombre='"
							+ Nombre + "';");
				} catch (RuntimeException e) {
					FileUtils.copyFile(src, new File("C:\\Users\\SEMILLERO05\\eclipse-workspace\\MySQL\\Evidencia\\"
							+ Nombre + "_NoEncontrado.png"));
					System.out.println("No Encontrado");
					stm1.executeUpdate("UPDATE validar SET Nombre='" + Nombre
							+ "',Estado='No Encontrado' WHERE Nombre='" + Nombre + "';");
				}
			}
			driver.quit();
		} catch (SQLException e) {
			System.out.println("Salio");
		}

	}
}
