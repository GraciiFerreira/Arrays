package ArrayJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int soma, diferenca;
		
		int[][] N1 = {{4, 6}};
		int[][] N2 = {{4, 6}};
		
		for (int i = 0; i < 1; i++) {
			for (int x = 0; x < 2; x++) {
				System.out.println("Matriz N1 [" + i + "][" + x + "]" + "é:" + N1[i][x]);
				}	
			} for (int i = 0; i < 1; i++) {
				for (int x = 0; x < 2; x++) {
					System.out.println("Matriz N2 [" + i + "][" + x + "]" + "é:" + N2[i][x]);
				}
			}
			for (int i = 0; i < 1; i++) {
				for (int x = 0; x < 2; x++) {			
					if (N1[i][x] == N2[i][x]) {
					
						soma = N1[i][x] + N2[i][x];
															
						int [][] M1 = {{soma, soma}};
						
						System.out.println("Matriz M1 [" + i + "][" + x + "]" + "é:" + M1[i][x]);
					}
				}		
			}
			for (int i = 0; i < 1; i++) {
				for (int x = 0; x < 2; x++) {			
					if (N1[i][x] == N2[i][x]) {
										
						diferenca = N1[i][x] - N2[i][x];
						
						int [] [] M2 = {{diferenca, diferenca}};
						
						System.out.println("Matriz M2 [" + i + "][" + x + "]" + "é:" + M2[i][x]);
				}
			}
		}
	}

}
