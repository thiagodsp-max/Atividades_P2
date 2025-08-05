package 2025-07-29;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Insira os dados do produto:");
		//
		System.out.println("Nome:");
		String name=read.nextLine();
		System.out.println("Preço:");
		double price=read.nextDouble();
		System.out.println("Quantidade:");
		int unity=read.nextInt();
		//
		Produto prod=new Produto(name, price, unity);
		prod.imprimir();
		System.out.printf("Total: R$%.2f",prod.lucro());
		//
		System.out.println("O estoque recebeu mais:");
		int more=read.nextInt();
		prod.estocar(more);
		prod.imprimir();
		System.out.printf("Total: R$%.2f",prod.lucro());
		
		read.close();
	}

}
