package br.com.rotation;

import java.util.Scanner;

public class fibonacciSequencia{
	public static void main(String[] args) {
		Scanner interage = new Scanner(System.in);
			System.out.print("Qual o Numero: ");
				int numero = interage.nextInt();
				
	int primeiro = 0, segundo = 1, proximo;
		boolean pertence = false;
	        while (segundo <= numero) {if (segundo == numero) {pertence = true; break;}
	        	proximo = primeiro + segundo;
	        		primeiro = segundo;
	        			segundo = proximo;
 }
    if (pertence) {
	            System.out.println(numero + " E da sequencia de Fibonacci.");
    	} else {
    			System.out.println(numero + " Nao é da sequencia de Fibonacci.");
    	}
    				interage.close();
	}
	
}


