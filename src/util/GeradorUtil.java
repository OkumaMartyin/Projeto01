package util;

public class GeradorUtil {

    //devolve o valor string conforme a quantidade de número solicitado
    public static String gerarNumero(int qtd) {
        String senha = "";
        int numero;
        for (int i = 0; i < qtd; i++) {
            numero = (int) (Math.random() * 10);
            senha += numero;
        }
        return senha;
    }

    public double gerarSalario() {
        int numero = (int) (Math.random() * 100); //ta forçando a ser inteiro
        return numero;
    }

    public static String gerarCPF() {
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + "-" + gerarNumero(2);
    }

    public static String gerarCNPJ() {
        return gerarNumero(2) + "." + gerarNumero(3) + "." + gerarNumero(3) + "/" + gerarNumero(4) + "-" + gerarNumero(2);
    }

    public static String gerarTelFix() {
        return "(48)3" + gerarNumero(3) + "-" + gerarNumero(4);
    }

    public static String gerarCelular() {
        return "(48)9" + gerarNumero(3) + "-" + gerarNumero(4);
    }

    public static String gerarCEP() {
        return gerarNumero(5) + "-" + gerarNumero(3);
    }

    public String gerarNome() {
        String[] nomes = {"Martao", "Silvio", "Maria Eugenia", "Pedro",
            "Carlos dos Santos", "Vinicius", "Tânia mt gatinhaa", "Tati", "Tonio",
            "Chico", "Gigio", "Samira", "Mariele", "William", "Hugo", "Otavio",
            "Ana", "Bolsonaro", "Lula", "Marisa"};
        int tamanhoLista = nomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        return nomes[indice] + " "+ gerarSobrenome();
    }
     private String gerarSobrenome() {
        String[] sobrenomes = {"Muuuito gato", "Silva", "Eugenia", "Mota",
            "dos Santos", "Abravanel", "Gostosa", "Safadinha", "Pirocudo",
            "Bucetuda", "Cu de engole pica", "22cm de fimose", "Lenhador",
            "Mestre de obra", "Maconha!", "Cavalos", "Luiza", "Petista", "PSDB", "Kegler"};
        int tamanhoLista = sobrenomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        return sobrenomes[indice];
    }

    public static void main(String[] args) {
        GeradorUtil util = new GeradorUtil();
        String cpf = util.gerarCPF();
        String cnpj = util.gerarCNPJ();
        String telefoneFixo = util.gerarTelFix();
        String telefoneCelular = util.gerarCelular();
        String cep = util.gerarCEP();
        String nome = util.gerarNome();
        
        System.out.println("CPF " + cpf);
        System.out.println("CNPJ " + cnpj);
        System.out.println("Telefone Fixo:  " + telefoneFixo);
        System.out.println("Telefone Celular:  " + telefoneCelular);
        System.out.println("CEP  " + cep);
        System.out.println("Nome:  " + nome);
    }

}
