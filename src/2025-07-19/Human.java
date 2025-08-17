package Atividade_02;

public class Human extends Taxa {
	protected double saude;
	//Construtor Pessoa Física
	public Human(String name, double renda, double saude) {
		super(name,renda);
		this.saude=saude;
	}
	
	//Override Específico no Abstrato
	public double payment() {
		if(renda<20000.00) {
			this.renda=this.renda*0.15;
		}
		else {
			this.renda=this.renda*0.25;
		}
		if(this.saude>0) {
			this.saude=this.saude*0.5;
			this.renda=this.renda-this.saude;
		}
		return this.renda;
	}
}
