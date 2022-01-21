package br.com.dio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void depositar(double valor, boolean trasf) {
		super.depositar(valor, trasf);
	}

	@Override
	public void imprimirSaldo() {
		System.out.println("\n=== Saldo da Conta Poupanca ===");
		super.imprimirInfosComuns();		
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public void imprimirExtrato() {
		for (Iterator iterator = extrato.iterator(); iterator.hasNext();) {
			Operacao operacao = (Operacao) iterator.next();
			DateFormat dateFormat = new SimpleDateFormat("* dd-MM-yyyy hh:mm:ss");  
			System.out.println(dateFormat.format(operacao.getData())+" - "+
							operacao.getTipo()+" - "+operacao.getValor());
			
		}
	}
	
}
