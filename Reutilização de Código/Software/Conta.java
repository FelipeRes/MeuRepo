package Software;

import Exeptions.SaldoInsuficiente;
import Exeptions.ValorNegativo;

public interface Conta {
	public void deposita(double valor);
	public void saca(double valor) throws SaldoInsuficiente, ValorNegativo;
	public double getSaldo();
	abstract public void atualiza(double taxa);
}
