package ArrayJava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

	    int linha = 3, coluna = 3, somaMatriz = 0, somaDiagonal=0;
	    int [][] x = new int [linha][coluna];

	    for(int i = 0; i < linha; i += 1){
	    	for(int y = 0; y < coluna; y += 1){
	    		System.out.println("Entre com a linha "+i+" da coluna "+y+" da matriz N1: ");
				  x[i][y] = leia.nextInt();
	      
				  somaMatriz += x[i][y];

	        if(i == y) {
	        	
	        	somaDiagonal += x[i][y];
	        }
	      }
	    }

	    System.out.println("A soma da matriz é: " + somaMatriz);
	    System.out.println("A soma soma da Diagonal é: " + somaDiagonal);  
	  }
	
	}

