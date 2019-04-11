package com.sophos.test;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;


public class ExcelJunit {
	WebDriver driver;
	FileInputStream inputStream;
	Workbook workbook;
	FileOutputStream outputStream;
	File excelFile;
	Excel operaciones;
	ArrayList<String> datos;
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver(); 
		String nombreArchivo = "Nombres.xlsx";
		String rutaArchivo = "C:\\Users\\SEMILLERO05\\Desktop\\" + nombreArchivo;
		excelFile = new File(rutaArchivo);
		inputStream= new FileInputStream(excelFile);
		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheetAt(0);
		operaciones = new Excel(sheet);
		datos = (ArrayList<String>) operaciones.listExcelData();
		
		
	}

	@After
	public void tearDown() throws Exception {
		inputStream.close();
		outputStream = new FileOutputStream(excelFile);
		workbook.write(outputStream);
		outputStream.close();
		workbook.close();
		driver.close();
	}

	@Test
	public void test() {
		try (FileInputStream file = new FileInputStream(excelFile)){
			for(int i = 0; i < operaciones.getRows()+1; i++) {
				driver.get("https://google.com.uy");
				driver.manage().window().maximize();
				String dato=datos.get(i);
				driver.findElement(By.name("q")).sendKeys(dato);
				driver.findElement(By.name("btnK")).submit();
				File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);			
				try {
					ExpectedCondition.explicitWait(driver, dato);
					FileUtils.copyFile(src, new File("C:\\Users\\SEMILLERO05\\eclipse-workspace\\ValidacionExcelGradel\\"
							+dato+".png"));
					operaciones.writeExcel(operaciones.getSheet().getRow(i), "Encontrado");			
				} catch (RuntimeException e) {
					FileUtils.copyFile(src, new File("C:\\Users\\SEMILLERO05\\eclipse-workspace\\ValidacionExcelGradel\\"
							+dato+"_ERROR.png"));
					operaciones.writeExcel(operaciones.getSheet().getRow(i), "No Encontrado");
				}
			}
		
		}catch (Exception e) {
			e.getMessage();
		}
	}
} +
