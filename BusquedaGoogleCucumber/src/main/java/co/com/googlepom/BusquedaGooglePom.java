package co.com.googlepom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import co.com.googleutilities.BasePage;

public class BusquedaGooglePom {
	private By txtBuscar = By.xpath("//input[@title='Buscar']");
	private By btnBuscar = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Buscar con Google']");
	WebDriver driver;
	private BasePage basepage;

	public BusquedaGooglePom(WebDriver driver) {
		this.driver = driver;
		basepage = new BasePage(driver);
	}

	public void EscribirTexto(String IngresarBusqueda) {
		basepage.writeText(txtBuscar, IngresarBusqueda);
	}

	public void RealizarBusqueda() {
		basepage.click(btnBuscar);
	}
}
