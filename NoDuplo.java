package aluno;

public class NoDuplo {
	
	int info1;
	NoDuplo ant;
	NoDuplo prox;
	int info;
	public NoDuplo(int n){
		
		info = n;
		prox = null;
		ant = null;
	}
}
