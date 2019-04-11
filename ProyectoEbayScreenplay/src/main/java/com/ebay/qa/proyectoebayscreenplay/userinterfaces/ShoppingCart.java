package com.ebay.qa.proyectoebayscreenplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCart extends PageObject {	
	
	public static final By PRODUCT = By.xpath("//div[@class='grid__group details']");	
	
	public static final Target PRODUCT_FINAL = Target.the("Amount of products")
            .located(By.xpath("//span[@class='BOLD']"));
	
	public static final Target DELETE_FROM_CART = Target.the("Delete from cart")
            .located(By.xpath("//span[2]//button[1]"));	
}
