package br.com.miriam.empresa;

public class Gerente extends Funcionario {
    protected double bonus;

    public Gerente(String nome, String cpf, String cargo, double salario, double bonus){
        super(nome, cpf, cargo, salario);
        this.bonus = bonus;
    }

    public double calcularSalario(){
        return salario + bonus;
    }
}
