package Atividade_02;

public class Corp extends Taxa{
	protected double worker;
	//Construtor Pessoa Jurídica
	public Corp(String name, double renda, int worker) {
		super(name,renda);
		this.worker=worker;
	}
	
	//Override Específico no Abstrato
	public double payment() {
		if(worker>10) {
			this.renda=this.renda*0.14;
		}
		else{
			this.renda=this.renda*0.16;
		}
		return this.renda;
	}
}
