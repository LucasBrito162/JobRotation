package br.com.rotation;

import java.util.Scanner;

public class construindoPrograma {

	public static void main(String[] args) {
		 Scanner interage = new Scanner(System.in);

	        System.out.print("Digite uma palavra ou frase: ");
	        String string = interage.nextLine();
	    
	     String inverterString = "";
	     	for (int i = string.length() - 1; i >= 0; i--) {
	     		inverterString += string.charAt(i);
	        }

	        System.out.println("original: " + string);
	        System.out.println("invertido: " + inverterString);

	}

}
