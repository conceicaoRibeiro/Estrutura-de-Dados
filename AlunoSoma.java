package aluno;

public class AlunoSoma {
	
	public static void main(String[]args){
	                                                                                                                                                                                                                       
	Aluno a = new Aluno("Filipe", 40);
	Aluno b = new Aluno("Giseli", 35);
	
	Aluno c = a.soma(b);
   
	System.out.println(c.getNome());
	System.out.println(c.getIdade());
	
	}
}










