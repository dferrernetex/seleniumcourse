package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import webdriver.Calculadora;

public class CalculadoraTest {
	// Se ejecuta solo cuando se inicia la clase
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Calculadora.launchDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Calculadora.closeDriver();
	}

	// Se ejecuta antes de cada test
	@Before
	public void setUp() throws Exception {
		Calculadora.clearOperations();
	}

	@After
	public void tearDown() throws Exception {
	}

	//TODO probar 2 sumas y 2 restas
	
	@Test
	public void testSuma2y2Igual4() {
		String result = Calculadora.suma(2, 2);
		assertEquals("4", result);
	}
	
	@Test
	public void testSuma33y33Igual66() {
		String result = Calculadora.suma(33, 33);
		assertEquals("66", result);
	}
	
	@Test
	public void testResta6menos3Igual3() {
		String result = Calculadora.resta(6, 3);
		assertEquals("3", result);
	}
	
	@Test
	public void testResta33menos22Igual11() {
		String result = Calculadora.resta(33, 22);
		assertEquals("11", result);
	}

}
