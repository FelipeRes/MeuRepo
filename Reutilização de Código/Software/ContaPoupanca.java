package Software;

public class ContaPoupanca implements Conta {
	private double saldo;

	@Override
	public void atualiza(double taxa){
		this.saldo	+= 	this.saldo * taxa*3;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
		
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
}
