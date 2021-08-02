package teste;

import aula_01.Aluno;
import javax.swing.JOptionPane;

public class TesteAluno {
    //psvm double tab faz com que o void se complete de uma vez só
    public static void main(String[] args) {
        Aluno aluno = new Aluno(); //o new é chamado de construtor 
        aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
        aluno.setSobrenome(JOptionPane.showInputDialog("Digite o sobrenome do aluno: "));
        aluno.setIdade(JOptionPane.showInputDialog("Digite a idade do aluno: "));
        aluno.setTelefone(JOptionPane.showInputDialog("Digite o telefone do aluno: "));
        aluno.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o salario: ")));
        
        System.out.println("Nome " + aluno.getNome());
        System.out.println("Sobrenome " + aluno.getSobrenome());
        System.out.println("Idade " + aluno.getIdade());
        System.out.println("Telefone " + aluno.getTelefone());
        System.out.println("Salario " + aluno.getSalario());
//        aluno.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario: ")); // modo mais profissa pra converter e printar valor
//        aluno.cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF: "));
//        JOptionPane.showMessageDialog(null, "Nome: " + aluno.nome
//                + " " + aluno.sobrenome + "\nIdade: " + aluno.idade + "\nSalario: " + aluno.salario
//                + "\nCPF: " + aluno.cpf);//printa uma janela com o conteudo//o processo de juntar uma string com uma variavel e formar uma frase se chama Contatenar
//    
    }
}
