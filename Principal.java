package aluno;

public class Principal {


		
		public static void main (String[]args){
		
			Lista l =new Lista();
		
		l.insere_inicio(25);
		l.insere_inicio(82);
		l.insere_inicio(93);
		l.insere_final(65);
		l.localizar(25);
		//l.remover_inicio();
		l.remover_fim();
		
		String lista_s =l.listar();
		
		System.out.println(lista_s);
		}
}



