package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.helpers.Helpers;

public class PagesCart {
	
	private WebDriver driver;
	private By placeOrderButton;
	private By nameInput;
	private By CountryInput;
	private By CityInput;
	private By CreditCardInput;
	private By MonthInput;
	private By YearInput;
	private By purchaseButton;
	
	
	//Constructor PagesCart
			public PagesCart(WebDriver driver) {
				this.driver = driver;
				placeOrderButton = By.xpath("//*/button[contains(string(),'Place Order')]");
				
				nameInput        = By.id("name");
				CountryInput     = By.id("country");
				CityInput        = By.id("city");
				CreditCardInput  = By.id("card");
				MonthInput       = By.id("month");
				YearInput        = By.id("year");
				purchaseButton   = By.xpath("//*/button[contains(string(),'Purchase')]");

				
			}//Fin Constructor PagesCart

	
	
	public void ordenaLaOrden(String nombre, String pais, String ciudad, String tarjeta, String mes, String anio) {
		
		Helpers helper = new Helpers();
		driver.findElement(placeOrderButton).click();
		helper.sleepSeconds(5);
		driver.findElement(nameInput).sendKeys(nombre);
		driver.findElement(CountryInput).sendKeys(pais);
		driver.findElement(CityInput).sendKeys(ciudad);
		driver.findElement(CreditCardInput).sendKeys(tarjeta);
		driver.findElement(MonthInput).sendKeys(mes);
		driver.findElement(YearInput).sendKeys(anio);
		helper.sleepSeconds(1);
		driver.findElement(purchaseButton).click();
		
		
	}
	
	
	
}
