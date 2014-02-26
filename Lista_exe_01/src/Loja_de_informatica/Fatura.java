package Loja_de_informatica;

import javax.swing.JOptionPane;

public class Fatura {
	
	private String numero;
	private String descricao;
	private int quantidadeComprada;
	private double precoPorIten;
	private double valor;
	
	
	public double calculaFatura(int valor, double valor1){	
		double result = (double)(valor * valor1);
		
		return result;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public double getPrecoPorIten() {
		return precoPorIten;
	}

	public void setPrecoPorIten(double precoPorIten) {
		if(precoPorIten < 0){
			this.precoPorIten =0.0;
		}
		else
		this.precoPorIten = precoPorIten;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	

}
