package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.helpers.Helpers;

public class PagesIndex {
	
	private WebDriver driver;
	private By registrarClic;
	private By usernameField;
	private By paswordField;
	private By registerButton;
	private By carritoComprasClic;
	private By loginInText;
	private By signInButton;
	private By ingresarClic;
	private By userInLoginField;
	private By passInLoginField;
	private By acercaDeNosotrosClic;
	private By ingredoNuevoContactoClic;
	private By ingresoNuevoContactoCorreoInput;
	private By ingresoNuevoContactoNombreInput;
	private By ingresoNuevoContactoMessageInput;
	private By ingredoNuevoContactoEnviarClic;
	
	
		//Constructor
		public PagesIndex(WebDriver driver) {
			this.driver    = driver;
			registrarClic  = By.xpath("//a[contains(string(),'Sign up')]");
			ingresarClic   = By.id("login2");
			usernameField  = By.id("sign-username");
			paswordField   = By.id("sign-password");
			userInLoginField = By.id("loginusername");
			passInLoginField = By.id("loginpassword");
			registerButton   = By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary");
			signInButton     = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
			carritoComprasClic   = By.xpath("//a[contains(string(),'Cart')]");
			loginInText          = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
			acercaDeNosotrosClic = By.xpath("//a[contains(string(),'About us')]");
			ingredoNuevoContactoClic         = By.xpath("//a[contains(string(),'Contact')]");
			ingresoNuevoContactoCorreoInput  = By.id("recipient-email");
			ingresoNuevoContactoNombreInput  = By.id("recipient-name");
			ingresoNuevoContactoMessageInput = By.id("message-text");
			ingredoNuevoContactoEnviarClic   = By.xpath("//button[contains(string(),'Send message')]");
			
			
		}
		
		// Metodo ingresar nuevo contacto
		public void ingresonNuevoContacto(String correo, String nombre, String mensaje) {
			driver.findElement(ingredoNuevoContactoClic).click();
			Helpers helper = new Helpers();
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
			driver.findElement(ingresoNuevoContactoCorreoInput).sendKeys(correo);
			driver.findElement(ingresoNuevoContactoNombreInput).sendKeys(nombre);
			driver.findElement(ingresoNuevoContactoMessageInput).sendKeys(mensaje);
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
			driver.findElement(ingredoNuevoContactoEnviarClic).click();
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		} // Fin metodo ingresar nuevo contacto
		
		
		
		
		//Metodo acerca de nosotros
		public void acercaDeNosotros() {
			driver.findElement(acercaDeNosotrosClic).click();
			Helpers helper = new Helpers();
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		}//Fin Metodo acerca de nosotros
		
		
		//Metodo salir Login
		public void salirLogin() {
			
		}//Salir Metodo salir Login
		
		
		// Metodo ingresar Login
		public void ingresoLogin(String usuario, String contrasena) {
			driver.findElement(ingresarClic).click();
			Helpers helper = new Helpers();
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
			driver.findElement(userInLoginField).sendKeys(usuario);
			driver.findElement(passInLoginField).sendKeys(contrasena);
			driver.findElement(loginInText).click();
		} // Fin Metodo ingresar Login
		
		
		
		//Metodo buscar Xpath
		public void buscarXpath() {
			driver.findElement(loginInText).getAccessibleName();
		}//Fin metodo buscar Xpath
		
		
		
		//Metodo registrar un usuario
		public void entrarRegistrarse(String usuario, String password) {
			driver.findElement(registrarClic).click();
			Helpers helper = new Helpers();
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
			driver.findElement(usernameField).sendKeys(usuario);
			driver.findElement(paswordField).sendKeys(password);
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
			driver.findElement(registerButton).click();
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	     }//Salir Metodo registrar un usuario
	
	
	
	
		// Metodo entrar carrito de compras
		public void entrarCarritoCompras() {
			
			driver.findElement(carritoComprasClic).click();
			Helpers helper = new Helpers();
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
			
		}//Fin Metodo entrar carrito de compras
	
	
	
	
	
	
	
	
	
	
	

}
