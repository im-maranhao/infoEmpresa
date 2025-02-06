package br.com.miriam.empresa;

public class Funcionario{
    protected  String nome;
    protected  String cpf;
    protected  String cargo;
    protected  double salario;


    public Funcionario(String nome, String cpf, String cargo, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double calcularSalario(){
        return salario;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário de R$: " + calcularSalario());
    }
}
