package util;


public class GeradorUtil {  
    
    //devolve o valor string conforme a quantidade de número solicitado
   public static String gerarNumero(int qtd){
       String senha = "";
       int numero;
       for (int i = 0; i < qtd; i++) {
           numero = (int)(Math.random() * 10);
           senha += numero;
       }
       return senha;
   } 
     
   public double gerarSalario(){
       int numero = (int) (Math.random()*100); //ta forçando a ser inteiro
       return numero;
   }
   
     public static String gerarCPF(){
       return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + "-" + gerarNumero(2);
   }
   
    public static void main(String[] args) {
      GeradorUtil objetoDessaClasse = new GeradorUtil();
      String cpf = GeradorUtil.gerarCPF();
      System.out.println("CPF " + cpf);
    }
}
