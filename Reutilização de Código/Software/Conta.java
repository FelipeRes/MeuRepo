package Software;

public interface Conta {
	public void deposita(double valor);
	public void saca(double valor);
	public double getSaldo();
	abstract public void atualiza(double taxa);
}
