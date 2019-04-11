package com.ebay.qa.proyectoebayscreenplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SelectedProduct extends PageObject {
	
	public static final Target AMOUNT = Target.the("Amount")
            .located(By.xpath("//input[@id='qtyTextBox']"));
	
	public static final Target ADD_TO_CART = Target.the("Add to cart")
            .located(By.xpath("//a[@id='isCartBtn_btn']"));
	
	public static final Target NAME_PRODUCT = Target.the("Name of product")
            .located(By.xpath("//h1[@id='itemTitle']"));	
}
