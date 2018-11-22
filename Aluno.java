package aluno;

public class Aluno {

	String nome;
	int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Aluno(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
		
	}
	//metodo soma do tipo aluno, recebe como parâmetro calc,o Aluno que está ao lado do calc é um objeto.
	
	    Aluno soma(Aluno calc){
		
		 String s1= this.nome + calc.getNome(); // soma dos nomes
		  int s2= this.idade+calc.getIdade(); //soma das idades
		  return new Aluno(s1,s2);   //retorno do objeto aluno,que foi instanciado nesse método
		 
		  
		  
	 }		
	
	/* public Aluno soma(Aluno calc){
		 return new Aluno(this.nome + calc.getNome(),this.idade + calc.getIdade());
	 }*/
	
 }
	

