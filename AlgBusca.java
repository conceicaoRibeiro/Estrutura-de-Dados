package aluno;

import java.util.Scanner;

public class AlgBusca {

	public static void main(String [] args){
		
		
		Scanner in= new Scanner(System.in);
		
		int vetor[]= new int [10];
		int num;
		for(int i =0; i< vetor.length;i++){
			System.out.println("Digite um valor para a posicao : " +i);
			vetor[i]= in.nextInt();
		}
		System.out.println("Digite um valor para procurar no vetor");
		num=in.nextInt();
		
		for(int i = 0; i< vetor.length;i++){
			
			if(vetor[i]== num){
				
				System.out.println("O indice do numero digitado eh : " +i);
			}else if(i==vetor.length-1){
				
				System.out.println("Numero nao encontrado no vetor");
			}
		}	
		
	}
	
	
	
}



