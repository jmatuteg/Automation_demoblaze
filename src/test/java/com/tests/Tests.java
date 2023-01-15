package com.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.helpers.Helpers;
import com.pages.PagesCart;
import com.pages.PagesIndex;

public class Tests {
	
	private WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		
		String demoblazepage = "https://www.demoblaze.com/index.html";
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(demoblazepage);
		Helpers helper = new Helpers();
		helper.sleepSeconds(5);
	}
	
	
	
	
	
	@Test(enabled=true)
	public void Registrarse() {
		PagesIndex paginaindex = new PagesIndex(driver);
		paginaindex.entrarRegistrarse("optimuz3","Systemsweb");
	}
	
	
	
	
	
	@Test(enabled=true)
	public void Carrito() {
		PagesIndex paginaindex  = new PagesIndex(driver);
		PagesCart paginacarrito = new PagesCart(driver);
		paginaindex.entrarCarritoCompras();
		paginacarrito.ordenaLaOrden("Javier Antonio Matute Gonzales", "Honduras", "Tegucigalpa MDC", "7654234890651234", "Marzo", "2027");	
	}
	
	
	
	
	@Test(enabled=true)
	public void AcercaDeNosotros() {
		PagesIndex paginaindex = new PagesIndex(driver);
		paginaindex.acercaDeNosotros();	
	}
	
	
	
	
	@Test(enabled=true)
	public void noEnviarContacto() {
		PagesIndex paginaindex = new PagesIndex(driver);
		paginaindex.ingresonNuevoContacto("jmatuteg@gmail.com", "Javier Matute", "We believe performance needs to be validated at every stage of the software development cycle and our open source compatible, massively scalable platform makes that a reality.");
		driver.switchTo().alert().dismiss();
	}
	
	
	
	@Test(enabled=true)
	public void enviarContacto() {
		PagesIndex paginaindex = new PagesIndex(driver);
		paginaindex.ingresonNuevoContacto("jmatuteg@gmail.com", "Javier Matute", "We believe performance needs to be validated at every stage of the software development cycle and our open source compatible, massively scalable platform makes that a reality.");
		driver.switchTo().alert().accept();
	}
	
	
	
	
	@Test(enabled=true)
	public void searchXPath() {
		PagesIndex paginaindex = new PagesIndex(driver);
		paginaindex.buscarXpath();
	}
	
	
	
	
	
	@Test(enabled=true)
	public void ingresarUsuarioDemoBlaze() {
		PagesIndex paginaindex = new PagesIndex(driver);
		paginaindex.ingresoLogin("jmatute@pruebaqa.com", "123qwe");
	}
	
	
	
	
	
	@AfterMethod
	public void closetProcess() {
		//driver.close();	
	}
	
	

}
