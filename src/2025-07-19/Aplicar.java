package Atividade_02;
import java.util.Scanner;

public class Aplicar {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		System.out.println("Insira o número de pagadores:");
		int vezes=ler.nextInt();
		ler.nextLine(); //A próxima linha do Enter é lida, deixando o scan limpo
		
		double arrecadar=0;
		//Loop para repetir o número de iterações
		System.out.println("Taxas Pagas:\n");
		for(int v=0; v<vezes; v++) {
			System.out.println("Pagador de taxa #"+(v+1)+":");
			
			System.out.println("Pessoa Física ou Jurídica (f/j):");
			String tipo=ler.nextLine();
			
			System.out.println("Nome:");
			String name=ler.nextLine();
			System.out.println("Salário Anual:");
			double renda=ler.nextDouble();
			Taxa payer=null;
			
			//Ramificar a pessoa
			if(tipo.equals("f")) {
				System.out.println("Gastos em Saúde:");
				double gasto=ler.nextDouble();
				payer=new Human(name,renda,gasto);
			}
			else if(tipo.equals("j")) {
				System.out.println("Nº de Empregados:");
				int salar=ler.nextInt();
				payer=new Corp(name,renda,salar);
			}
			ler.nextLine();
			double imposto = payer.payment();
			System.out.printf("%s: R$%.2f\n",name,imposto);
			arrecadar=arrecadar+imposto;
		}
		
		System.out.printf("Taxa Total: R$%.2f",arrecadar);
		ler.close();
	}

}
