package Main;

import Software.Conta;

public class Banco {
	private final int CONTASMAX = 10;
	Conta[] contas = new Conta[10];
	private int numeroContas = 0;

	public void adicionaConta(Conta c){
		if(numeroContas < CONTASMAX){
			contas[numeroContas] = c;
			numeroContas ++;
		}else{
			System.out.println("Contas chegaram ao limite");
		}
	}
	
	public Conta pegaConta(int x){
		return contas[x];
	}
	
	public int pegaTotalDeContas(){
		return numeroContas;
	}
}
