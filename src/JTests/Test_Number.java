package JTests;

import static org.junit.Assert.*;

import org.junit.Test;

import metodo.Division;


public class Test_Number {

	
	
	//@Test
	public void testNumber() {
		try{
			Division division = new Division();
			division.realizarDivision("3", "hola");
			fail("Se ejecutara una excepcion");
			
		}catch(NumberFormatException e){
			System.err.println("No se pueden dividir caracteres");
		}
	}
	
	//@Test
	public void testArithmetic(){
		try{
			Division division = new Division();
			division.realizarDivision("3", "0");
			fail("Se ejecutara una excepcion");
		}catch(ArithmeticException ex){
			System.err.println("El denominador no puede ser 0");
		}
	}

}
