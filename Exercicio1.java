package ArrayJava;

import java.util.Scanner;

import java.util.Arrays;


public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 	int posicao = 5, maiorValor =0;
			int [] pontuacao = new int [posicao];
			
			
			for(int i = 0; i < pontuacao.length; i++) {
				System.out.println("Digite a pontuação do aluno: ");
				pontuacao[i] = leia.nextInt();
			}		
			for(int i = 0; i < pontuacao.length; i +=1) {
				if(pontuacao[i] > maiorValor) {
					maiorValor = pontuacao[i];
				}
				System.out.println("A pontuacao da atividade " + (i+1) + " é: " + pontuacao[i]);		
			}		
			System.out.println("A maior pontuacao é: " + maiorValor);
		}

	
}
