package br.com.dio;

public interface IConta {
	
	void transferir(double valor, Conta contaDestino);

	void imprimirSaldo();

	void imprimirExtrato();
	
	void depositar(double valor, boolean trasf);

	void sacar(double valor, boolean trasf);
	
	
	
}
