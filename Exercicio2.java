package ArrayJava;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int somaTotal = 0;
		double media, soma = 0;
		int[] valor = new int[10];
		
		for (int i = 0; i < valor.length; i++) {
			
			System.out.println("Digite o "+(i+1)+"° valor:");
			
			valor[i]= leia.nextInt();
			
		} for (int i = 0; i < valor.length; i++) {
			
			System.out.println("O " +(i+1)+ "° valor é: "+valor[i]);
			
		} 
		
		Arrays.sort(valor);
		
		int maior = valor[valor.length-1];
		
		for (int i = 0; i< valor.length; i++) {
				soma = valor[i] + soma;
				
			if (valor[i] == maior) {
				somaTotal = somaTotal + 1;
			}
			
		}
		
			media = soma/valor.length;
		
		System.out.println("\nA média dos valores é: " +media);
		System.out.println ("A quantidade de vezes que o número (" + maior + ") apareceu foi " +somaTotal);
	}

}
