package br.com.miriam.empresa;

public class Desenvolvedor extends Funcionario{
    protected int horaExtra;
    protected double valorHoraExtra;

    public Desenvolvedor(String nome, String cpf, String cargo, double salario, int horaExtra, double valorHoraExtra ){
        super(nome, cpf, cargo, salario);
        this.horaExtra = horaExtra;
        this.valorHoraExtra = valorHoraExtra;

    }

    public double calcularSalario(){
        return salario + (horaExtra * valorHoraExtra);
    }
}

