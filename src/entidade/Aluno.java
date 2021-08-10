package entidade;
// Ctrl + Shift + C comenta a linha automaticamente
// shift + alt + F identa o código
// Alt + INSERT faz com que voce consiga fazer o Getter e Setter la de baixo
public class Aluno {

    //quem sao e quantos sao os tipos prmitivos em java
    private String nome; //Valor default de uma classe é null sempre!! BTW o default do bool é False
    private String idade;
    private String telefone;
    private float salario; //começa com letra minuscula o tipo primitivo em java 
    //double salario, float aceita até 9 digitos e double aceita o dobro do float
    private String logradouro;
    private String numero;
    private String bairro;
    private long cpf; //long é o int so que pra numero maior, tipo o double do float
    //o private na variavel serve para acessar ela em outro arquivo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    
}
//variaveis dentro da classe são chamadas de variaveis de instância

