package com.ebay.qa.proyectoebayscreenplay.exceptions;

public class WrongSelection extends AssertionError
{

	public static final String WRONG_SELECTION= "El producto seleccionado es incorrecto";

	public WrongSelection(String message, Throwable cause) {
		super(message, cause);			
	}
}