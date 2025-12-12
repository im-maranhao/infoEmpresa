package br.com.miriam;

import br.com.miriam.empresa.Funcionario;
import br.com.miriam.empresa.Gerente;
import br.com.miriam.empresa.Desenvolvedor;

public class Main {
    public static void main (String[] args){
        Funcionario funcionario = new Funcionario("Lídia Maranhão", "123.456.789-10", "Farmaceutica", 3500.00);
        Gerente gerente = new Gerente("Joeli Maranhão", "252.***.***-09", "Gerente", 4000.00, 1500.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Miriam Maranhão da Silva", "454.***.***-95", "Dev Backend Java Junior", 3500.00, 20, 50.00);
        System.out.println("\n------Informações do Funcionario------");
        funcionario.exibirInformacoes();

 System.out.println("\n------Informações do Gerente------");
        gerente.exibirInformacoes();
        System.out.println("\n------Informações do Desenvolvedor------");
        desenvolvedor.exibirInformacoes();

 System.out.println("==========Testando Hash && Equals============");

		Usuario userA = new Usuario ("Miriam", "Maranhão");
		Usuario userB = new Usuario ("Miriam", "Maranhão");
		// Usuario userB = userA;

		System.out.println(userA);
		System.out.println(userB);
		System.out.println(userA.hashCode());
		System.out.println(userB.hashCode());

		System.out.println(userA.equals(userB));
    }
}
