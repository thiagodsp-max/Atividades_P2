package 2025-07-29;

public class Produto {
	//Declarar variáveis
	String nome;
	int stock;
	double valor;
	//Construtor
	public Produto(String nome, double valor, int stock) {
		this.nome=nome;
		this.valor=valor;
		this.stock=stock;
	}
	//Outros Métodos
	public void estocar(int add) {
		this.stock=this.stock + add;
	}
	public double lucro() {
		return this.stock*this.valor;
	}
	public void imprimir() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Preço: R$"+this.valor);
		System.out.println("Quantidade: "+this.stock);
	}
}
