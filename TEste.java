package aluno;

public class TEste {

	 public static int pot2(int n){
   	  if(n==0){
   		  return 1;
   	  }else{
   		  return 2*pot2(n-1);
   	  }
   	
   }  

       public static void main(String[]args){
       int resultado= pot2(9);
       System.out.println(resultado);
    }

 }

     