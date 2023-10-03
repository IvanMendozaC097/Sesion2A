package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {

	private int value1, value2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
		value1 = 5;
		value2 = 3;		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void testSuma() {
		int valorEsperado = 8;
		int valorObtenido = Calculadora.suma(value1, value2);
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	void testResta() {
		int valorEsperado = 2;
		int valorObtenido = Calculadora.resta(value1, value2);
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	void testMultiplica() {
		int valorEsperado = 15;
		int valorObtenido = Calculadora.multiplica(value1, value2);
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	void testDivide() {
		int valorEsperado = 1;
		int valorObtenido = Calculadora.divide(value1, value2);
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	void testDivideCero() {
		int valorEsperado = -1;
		int valorObtenido = Calculadora.divide(value1, 0);
		assertEquals(valorEsperado, valorObtenido);
	}

}
