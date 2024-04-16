package util;

public abstract class Algoritmos {
	
	/**
	 * Devuelve el numero de fibonacci
	 * @param numero	el numero del indice que queremos obtener de la secuencia fibonacci
	 * @return			el numero fibonacci del indice pasado
	 */
	
	public static int fibonacci(int num) {
		int num1=0, num2=1, aux, numFinal=0;
		
		if(num==0) {
			numFinal=num1;
		}
		else if(num==1) {
			numFinal=num2;
		}
		else{
			for(int i=2;i<=num;i++) {
				aux=num2;
				num2+=num1;
				num1=aux;
				
				numFinal=num2;
			}	
			
		}
                
                return numFinal;
    }
	
	
	/**
	 * Devuelve el numero factorial
	 * 
	 * @param numero	el numero al que queremos calcularle el factorial
	 * @return			el resultado factorial del numero pasado
	 */
	public static int factorial(int num) {
		
		int numFinal=1;
		
		for(int i=2;i<=num;i++) {
			numFinal*=i;
		}
		
		return numFinal;
		
	}
	
	
	/**
	 * Devuelve si el numero pasado es primo, con true o false.
	 * 
	 * @param numero	el numero que se quiere comprobar si es primo
	 * @return			true si el numero es primo, false si el numero no es primo
	 */
	public static boolean esPrimo(int num) {
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
		
	}

}
