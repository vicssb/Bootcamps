package br.com.dio;

public class ContaCorrente extends Conta {


	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirSaldo() {
		System.out.println("\n=== Saldo da Conta Corrente ===");
		super.imprimirInfosComuns();
		if (this.saldo < 0) {
			System.out.println("*** Saldo negativo ***");
		}
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	@Override
	public void depositar(double valor, boolean trasf) {
		super.depositar(valor, trasf);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n=== Extrato da Conta Corrente numero: "+numero+" ===");
		super.imprimirInfosComuns();		
		extrato();
	}
	

}
