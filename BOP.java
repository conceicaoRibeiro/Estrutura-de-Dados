package aluno;

public class BOP {
	
	public static void main(String[]args){
		
		int[] v= new int [10];
		int elemento_busca=77;
		int achou= -1;
		
		for(int i=0; i<10;i++){
			if(v[i]==elemento_busca){
				achou = i;
			}
		} if(achou !=-1){
			System.out.println("Encontado na posicao" +achou);
		
		}else{
			System.out.println("Não encontrado no vetor");
		}
   }
}