package MiPrimerScript;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HolaMundo {

	static XSSFWorkbook worbook;

	public static void main(String[] args) throws IOException {

		String rutaArchivo = "C:\\Users\\SEMILLERO05\\Desktop\\Nombres.xlsx";
		String hoja = "Hoja1";

		try (FileInputStream file = new FileInputStream(new File(rutaArchivo))) {
			worbook = new XSSFWorkbook(file);
			XSSFSheet sheet = worbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			Row row;
			File file1 = new File(rutaArchivo);
			while (rowIterator.hasNext()) {

				row = rowIterator.next();

				Iterator<Cell> cellIterator = row.cellIterator();
				Cell cell;
				while (cellIterator.hasNext()) {
					cell = cellIterator.next();

					System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
					WebDriver driver = new InternetExplorerDriver();
					driver.get("http://www.google.com.uy");
					driver.findElement(By.name("q")).sendKeys(cell.getStringCellValue());
					driver.findElement(By.name("btnK")).submit();

					File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

					try {
						WebDriverWait wait = new WebDriverWait(driver, 5);
						wait.until(
								ExpectedConditions.elementToBeClickable(By.partialLinkText(cell.getStringCellValue())));
						FileUtils.copyFile(src,
								new File("C:\\Selenium\\Evidencia\\" + cell.getStringCellValue() + ".png"));
						row.createCell(1).setCellValue("Encontrado");

					} catch (RuntimeException e) {
						FileUtils.copyFile(src, new File("C:\\Selenium\\Evidencia\\error.png"));
						row.createCell(1).setCellValue("No Encontrado");

					}
					System.out.print(cell.getStringCellValue() + "");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.getMessage();
		}
		FileOutputStream File1 = new FileOutputStream("C:\\Users\\SEMILLERO05\\Desktop\\Nombres.xlsx");

		worbook.write(File1);

	}

}
