package br.com.rotation;

public class sequenciaLogica {
	
	    public static void main(String[] args) {
	        int atual = 1;
	        for (int i = 0; i < 4; i++) {
	            System.out.print(atual + ", ");
	            atual += 2;
	        }
	        System.out.println(atual);
	    
System.out.println();
	 
	    
	        int proximoNumero = 2;
	        for (int i = 1; i < 7; i++) {
	            System.out.print(proximoNumero + ", ");
	            	proximoNumero *= 2;
	        }
	        	System.out.println(proximoNumero);
	        System.out.println();
	    
	        
	 
	        int n = 8; 
	        for (int i = 0; i < n; i++) {int elevado = i * i;
	                System.out.print(elevado + " ");
	        }	       
	        System.out.println();
	                int maximoGerado = 5;
	                int numeroInicia = 2; 
	                for (int i = 0; i < maximoGerado; i++) {
	                    int acao = numeroInicia * numeroInicia;
	                    System.out.print(acao + " ");
	                 numeroInicia += 2; }
	              
	        System.out.println();
	                int maximoValor = 7;  
	                int primeiro = 1;
	                int segundo = 1;
	                System.out.print(primeiro + " " + segundo + " "); 
	                for (int i = 2; i < maximoValor; i++) {
	                    int current = primeiro + segundo;
	                    System.out.print(current + " ");
	                    primeiro = segundo;
	                    segundo = current;
	                }
	            }
	        }
	    

       
    
	



