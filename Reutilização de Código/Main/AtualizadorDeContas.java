package Main;

import Software.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	public void roda(Conta c){
		System.out.println("Saldo Anterior: " + c.getSaldo());
		c.atualiza(0.11);
		System.out.println("Saldo Atual: " + c.getSaldo());
		saldoTotal += c.getSaldo();
	}
	
	public double getSaldoTotal(){
		return saldoTotal;
		
	}
	
}
