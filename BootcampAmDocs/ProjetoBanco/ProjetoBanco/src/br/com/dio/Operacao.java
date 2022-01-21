package br.com.dio;

import java.util.Date;

public class Operacao {
	
	String tipo;
	double valor;
	Date data = new Date();
	
	
	/*
	 * public Operacao() { //tipo=""; //valor=0;
	 * 
	 * }
	 */

	public Operacao(String tipoString, double valor) {
		this.tipo = tipoString;
		this.valor = valor;
		//this.data = UnknownError()
	}

	public Operacao() {
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipoString) {
		this.tipo = tipoString;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
