package app;

import java.util.ArrayList;
import java.util.Random;

import util.Algoritmos;

public class Principal {
	
	static Random NUM_RANDOM;

	public static void main(String[] args) {
		
		
		//1:
		
		ArrayList <Integer> numeros = new ArrayList <>();
		NUM_RANDOM=new Random();
		
		for(int i=0;i<5;i++) {
			numeros.add(NUM_RANDOM.nextInt(1, 11));
		}
		
		//2:
		ArrayList <Integer> resultadoFibonacci  = new ArrayList <>(); 
		for(int i=0; i<numeros.size();i++) {
			resultadoFibonacci.add(Algoritmos.fibonacci(numeros.get(i)));
		}
		
		//3:
		ArrayList <Integer> resultadoFactorial  = new ArrayList <>();
		for(int i=0; i<numeros.size();i++) {
			resultadoFactorial.add(Algoritmos.factorial(numeros.get(i)));
		}
		
		//4:
		ArrayList <Boolean> resultadoPrimos  = new ArrayList <>();
		for(int i=0; i<numeros.size();i++) {
			resultadoPrimos.add(Algoritmos.esPrimo(numeros.get(i)));
		}
		
		
		
		
		
		

	}

}
