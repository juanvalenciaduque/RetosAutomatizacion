package com.Ebay.test.pom;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ScreenshotsHighlight{
	private static Driver IDriver = new Driver();
	static int c=1;
	static ArrayList<String> Reportes = new ArrayList<String>();
	String file = "C:\\Users\\SEMILLERO05\\eclipse-workspace\\ProyectoEbay\\EvidenciaEbay\\Reporte\\Reporte.pdf";
	
	
	
	public void Screenshot(String Prueba) throws IOException, DocumentException {

	File src=((TakesScreenshot)IDriver.getDriver()).getScreenshotAs(OutputType.FILE);      
	try 
	{			
		String png = c+"."+Prueba+".png";
		Reportes.add(png);
		String imagen = "C:\\Users\\SEMILLERO05\\eclipse-workspace\\ProyectoEbay\\EvidenciaEbay\\"+png;
		FileUtils.copyFile(src, new File(imagen));
		c=c+1;		
	}
			catch(Exception e)
			{		        				
			}
	}	
	
	
	
	public void HighlightCart(WebElement Product) {
	    if (IDriver.getDriver() instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)IDriver.getDriver()).executeScript("arguments[0].style.border='3px solid green'", Product);	        
	    }
	}
	
	
public void createPdf() throws DocumentException, IOException {

		Document document = new Document(PageSize.LETTER);
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));			
			
		writer.setStrictImageSequence(true);

		document.open();
		for (int i = 0; i < Reportes.size(); i++) {

			Image image = Image.getInstance("C:\\Users\\SEMILLERO05\\eclipse-workspace\\ProyectoEbay\\EvidenciaEbay\\"+Reportes.get(i));

			image.scaleToFit(500, 500);

			
			document.add(new Paragraph(Reportes.get(i)));
			document.add(new Paragraph("\n"+"\n"));
			document.add(image);
			document.newPage();
			
		}
		document.close();
	} 
}
