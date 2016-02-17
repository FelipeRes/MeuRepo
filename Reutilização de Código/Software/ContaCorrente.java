package Software;

import Exeptions.SaldoInsuficiente;
import Exeptions.ValorNegativo;

public class ContaCorrente implements ContaTributavel {

	private double saldo;
	@Override
	public void atualiza(double taxa){
		this.saldo	+= 	this.saldo * taxa*2;
	}
	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}
	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public void saca(double valor) throws SaldoInsuficiente, ValorNegativo {
		if(valor < 0){
			throw new ValorNegativo("O valor que tem positivo: " + valor, valor);
		}
		if(valor > saldo){
			throw new SaldoInsuficiente("Tente sacar um valor menor");
		}else{
			this.saldo -= valor;	
		}
		
	}


	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
}
