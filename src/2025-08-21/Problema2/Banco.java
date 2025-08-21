package Atividade_32;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) throws Exception{
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Insira os dados da conta:\n");
		System.out.print("Número:");
		int id=ler.nextInt();
		ler.nextLine();
		System.out.print("Dono:");
		String name=ler.nextLine();
		System.out.print("Saldo Atual:");
		double saldo=ler.nextDouble();
		System.out.print("Limite de Saque:");
		double limit=ler.nextDouble();
		//Ativar o método de sacar dinheiro
		Bancario conta =new Bancario(id,name,saldo,limit);
		System.out.print("Insira o valor do saque:");
		double amount=ler.nextDouble();
		conta.sacar(amount);
		
		ler.close();
	}
}
