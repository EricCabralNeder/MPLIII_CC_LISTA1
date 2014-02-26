package Folha_de_pagamento;

import java.util.regex.*;

import javax.swing.JOptionPane;

public class FolhaDePagamento {

	private int saida = 0;
	private String entrada = "";

	public FolhaDePagamento() {
		this.entrada = entrada;
		this.saida = saida;
	}
	
	public int teste(String entrada) {
		int calc=0;
		String n[] = entrada.split("[a-zA-Z]");

		for (int i = 0; i < n.length; i++) {
			if (!n[i].isEmpty()) {
		    calc += Integer.valueOf(n[i]);	
			}	
		}	
		return calc ;
	}

	public int getSaida() {
		return saida;
	}

	public void setSaida(int saida) {
		this.saida = saida;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
}


