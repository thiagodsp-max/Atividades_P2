package Atividade_02;

public abstract class Taxa {
	//Atributos Gerais
	protected String nome;
	protected double renda;
	//Construtor da Classe Geral
	public Taxa(String nome,double income) {
		this.nome=nome;
		this.renda=income;
	}
	
	//Método Abstrato para ser sobrescrito pelos Filhos
	public abstract double payment();
}
