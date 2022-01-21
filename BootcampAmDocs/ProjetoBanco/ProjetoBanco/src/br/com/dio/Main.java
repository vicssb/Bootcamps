package br.com.dio;
/**
 * Programa de um banco  simples
 * Programação Orientada a Objetos (POO) em Java
 * 
 * @author vicss
 * @version 1.0
 *
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Programa Banco.");

		Cliente vic = new Cliente("Victor");
		Conta vicCc = new	ContaCorrente(vic);
		Conta vicCp = new ContaPoupanca(vic);
		Conta vicCc2 = new	ContaCorrente(vic);
		
		Cliente adri = new Cliente("Adriana");
		Conta adriCc = new	ContaCorrente(adri);
		Conta adriCp = new ContaPoupanca(adri);
		Conta adriCp2 = new	ContaPoupanca(adri);
		
		vicCc.depositar(100,false);
		Thread.sleep(1000);
		vicCc.imprimirSaldo();
		vicCc.transferir(30, vicCp);
		Thread.sleep(1000);
		vicCp.transferir(10, vicCc2);
		Thread.sleep(1000);
		vicCc.imprimirSaldo();
		vicCp.imprimirSaldo();
		vicCc2.imprimirSaldo();
		vicCc.transferir(33, adriCp);
		Thread.sleep(1000);
		
		adriCc.depositar(250, false);
		Thread.sleep(1000);
		adriCc.sacar(40, false);
		Thread.sleep(1000);
		adriCc.transferir(600, adriCp2);
		adriCp2.transferir(100, adriCp);
		adriCc.imprimirSaldo();
		adriCp.imprimirSaldo();
		adriCp2.imprimirSaldo();
		
		vicCc.imprimirExtrato();
		vicCc2.imprimirExtrato();
		vicCp.imprimirExtrato();
		
		adriCc.imprimirExtrato();
		adriCp.imprimirExtrato();
		adriCp2.imprimirExtrato();
	

		
		System.out.println("Fim.");
	}

}
