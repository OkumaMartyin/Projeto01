package util;


public class GeradorUtil {
   public double gerarSalario(){
       int numero = (int) (Math.random()*100); //ta forçando a ser inteiro
       return numero;
   }
   
    public static void main(String[] args) {
      GeradorUtil objetoDessaClasse = new GeradorUtil();
        System.out.println("Salario: "+objetoDessaClasse.gerarSalario());
    }
}
