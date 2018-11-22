package aluno;

public class Lista {

private No cabeca_lista;
	
	public Lista(){
		cabeca_lista = null;
	}
	
	public void insere_inicio(int conteudo){
		
		No novo_no = new No(conteudo);
		if(cabeca_lista == null){
			
			cabeca_lista = novo_no;
		}else{
			novo_no.prox = cabeca_lista;
			cabeca_lista = novo_no;
		}
   }
	  
	public String listar(){
		No aux;
		aux=cabeca_lista;
		String lista_string=null;
		while(aux!=null){
			lista_string =lista_string+"-"+aux.info;
			aux=aux.prox;
		}
		if(lista_string == null){
			lista_string="Lista vazia";
		}
		return lista_string;
	}	
	  
	
		public void insere_final(int conteudo){
		   No novo_no=new No(conteudo);
		   if(cabeca_lista==null){
			   cabeca_lista=novo_no;
		   }else{
			   No aux;
			   aux=cabeca_lista;
			   while(aux.prox != null){
				   aux=aux.prox;
			   }
			   aux.prox=novo_no;
		   }
	   }
		
		public boolean localizar(int n){
			
			No aux= cabeca_lista;
			boolean encontrou = false;
			while((aux!= null)&& (!encontrou)){
				if(aux.info == n){
					encontrou = true;
				}
				aux=aux.prox;
			}
			 
			return encontrou;	
		}
		
		public void remover_inicio(){
			if(cabeca_lista !=null){
			cabeca_lista=cabeca_lista.prox;
			}
		}
		
		public void remover_fim(){
			
			No aux1 =cabeca_lista;
			No aux2=cabeca_lista;
			
			if(aux1.prox == null){
				
			}else if(aux1.prox == null){
				cabeca_lista = null;
			}else{
				while(aux1.prox != null){
					aux1=aux1.prox;
				}while(aux2.prox != aux1){
					aux2=aux2.prox;
				}
				aux2.prox=null;
			}						
		}
		
		public String remover_posicao(int posicao){
			
			int qtdelementos =getQtdelementos();
			No aux = cabeca_lista;
			String msg =" ";
			
			 qtdelementos = getQtdelementos();
			
			if(cabeca_lista ==null){ 
			
			 msg="Lista vazia";	
			}
			 else if(qtdelementos < posicao){
				 msg ="menos elementos do que a posicao requerida ";
			 
			
			}else if (posicao == 1 ){
				
				remover_inicio();
				
				msg="Removendo Inicio";
			
			}else if(posicao == qtdelementos){
				
				remover_fim();
				
				msg="Removido final";
			}else{
				for(int i=1; i < posicao; i++){
					aux=aux.prox;
				}
			}
          
			No aux2 = aux.prox;
           aux.prox=aux2.prox;
           return msg="Removendo meio";
			
			
		}

		public int getQtdelementos() {
			
			int qtd=0;
			
			No aux=cabeca_lista;
			
			while(aux != null){
				qtd=qtd+1;
				aux = aux.prox;
			}
			return qtd;
		}
		
}

	
	
	

