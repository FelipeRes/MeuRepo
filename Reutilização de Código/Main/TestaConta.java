package Main;

import Software.Conta;
import Software.ContaCorrente;
import Software.ContaPoupanca;

public class TestaConta {
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente();
		ContaCorrente corrente = new ContaCorrente();
		ContaPoupanca poupanca = new ContaPoupanca();
		
		Conta conta2 = new ContaCorrente();
		Conta corrente2 = new ContaCorrente();
		Conta poupanca2 = new ContaPoupanca();
		
		conta.deposita(1000);
		corrente.deposita(1000);
		poupanca.deposita(1000);
		
		conta2.deposita(1000);
		corrente2.deposita(1000);
		poupanca2.deposita(1000);
		
		/*.atualiza(0.1);
		corrente.atualiza(0.1);
		poupanca.atualiza(0.1);
		
		conta2.atualiza(0.1);
		corrente2.atualiza(0.1);
		poupanca2.atualiza(0.1);*/
		
		System.out.println(conta.getSaldo());
		System.out.println(corrente.getSaldo());
		System.out.println(poupanca.getSaldo());
		
		System.out.println(conta2.getSaldo());
		System.out.println(corrente2.getSaldo());
		System.out.println(poupanca2.getSaldo());
		
		System.out.println("ATIVIDADE 7========================================");
		
		AtualizadorDeContas atualizadorDeContas = new AtualizadorDeContas(0.1);
		/*atualizadorDeContas.roda(conta);
		atualizadorDeContas.roda(corrente);
		atualizadorDeContas.roda(poupanca);*/
		
		System.out.println("Saldo Total: " + atualizadorDeContas.getSaldoTotal());
		
		System.out.println("ATIVIDADE 10========================================");
		Banco banco = new Banco();
		banco.adicionaConta(conta);
		banco.adicionaConta(conta2);
		banco.adicionaConta(poupanca);
		banco.adicionaConta(poupanca2);
		banco.adicionaConta(corrente);
		banco.adicionaConta(corrente2);
		
		for(int i = 0; i< banco.pegaTotalDeContas(); i++){
			atualizadorDeContas.roda(banco.pegaConta(i));
		}
		
		
		
	}
}
