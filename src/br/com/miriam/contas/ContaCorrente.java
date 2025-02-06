package br.com.miriam.contas;


import java.util.List;
import java.util.ArrayList;

public class ContaCorrente implements Conta, Pix {	
	private float saldo;
	private int conta;
	private List<String> historico;
	
	public ContaCorrente(int conta, float valorInicial){
		this.saldo = valorInicial;		
		this.historico = new ArrayList<>();
		String mensagem = "Conta criada com o valor: " + valorInicial;
		this.historico.add(mensagem);
	}
		
	public void transferir(int conta, float valor){
		String mensagem = "";
		if(this.conta == conta){
			System.out.println("Não pode transferir para a mesma conta");
			return;
		}
		
		if(this.saldo >= valor){					
			this.saldo = this.saldo - valor;
			mensagem = "Transferido o valor de " + valor + " para a Conta de numero: " + conta;
			this.historico.add(mensagem);
		}else{
			System.out.println("Saldo insuficiente: " + this.saldo);
		}			
	}
	
	public void depositar(int conta, float valor){
		String mensagem = "";
		
		if(this.conta != conta){
			this.saldo = this.saldo + valor;
			mensagem = "Depositado o valor de " + valor + " em sua conta.";
			this.historico.add(mensagem);
		}			
	}

	public float pix(String chavePix, float valor){
		System.out.println("Pix Conta Corrente para a chave pix: " + chavePix + ", de valor: " + valor);
		
		return valor;
	}
		
	public float getSaldo(){
		return this.saldo;
	}
	
	public List getHistorico(){
		return this.historico;
	}
}
