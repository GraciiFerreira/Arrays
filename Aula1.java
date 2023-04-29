package ArrayJava;

import java.util.Scanner; 

public class Aula1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numAlunos = 5;
		double[] notaAlunos = new double[numAlunos];
		
		for(int i = 0; i<numAlunos;++i) {
			System.out.println("Insira a nota do " +(i+1) + "° Aluno:");
			notaAlunos[i] = leia.nextDouble();
	
		}
		
		for(int i = 0;i<numAlunos;++i) {
			System.out.println("->"+ notaAlunos[i]);
			
		}
	}
}
	
