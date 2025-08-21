package Atividade_32;

public class Conta {
	private int number;
	private String holder;
	private double limit;
	private double saldo;
	
	//construtor
	public Conta(int id, String nome,double saldo, double limit) {
		this.number=id;
		this.holder=nome;
		this.saldo=saldo;
		this.limit=limit;
	}
	
	public void getsaldo() {
		System.out.println("Novo Saldo: "+saldo);
	}
	
	public void sacar(double saque) throws Exception {
		if(saque>limit) {
			throw new Exception("Erro de Saque: O Saque ultrapassa o limite");
		}
		else if(saque>saldo){
			throw new Exception("Erro de Saque: Saldo Insuficiente");
		}
		else if(saque<=0) {
			throw new Exception("Erro de Saque: Valor de Saque Inválido");
		}
		this.saldo=saldo-saque;
		getsaldo();
	}
}
