package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class testAlgoritmo {

	@Test
	void testFibonacci(){
		double numEsperado = 55;
		double numObtenido= Algoritmos.fibonacci(10);
		assertEquals(numEsperado, numObtenido);
		
	}
	
	@Test
	void testFactorial(){
		double numEsperado = 120;
		double numObtenido= Algoritmos.factorial(5);
		assertEquals(numEsperado, numObtenido);
		
	}
	
	@Test
	void testEsPrimo(){
		boolean valorEsperado = true;
		boolean valorObtenido= Algoritmos.esPrimo(17);
		assertEquals(valorEsperado, valorObtenido);
		
	}

}
