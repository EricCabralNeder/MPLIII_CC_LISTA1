package Questoes;

import javax.swing.JOptionPane;

public class Beneficios_oo {
	
	private String texto;
	
	public Beneficios_oo(){
		this.texto = texto;
	}
	
	public void ler(){
		JOptionPane.showMessageDialog(null,"                       Defina e exemplifique os benef�cios da Orienta��o a Objetos \n\n\n"
			                              +"Os benef�cios da Orienta��o a Objetos: Informalmente um objeto representa uma entidade,\n"
				                          +"tanto f�sica quanto conceitual ou de software. EXEMPLO: Entidade F�sica: caminh�o, carro,\n"
				                          +"Entidade Conceitual: processo qu�mico, matr�cula,Entidade de Software: lista encadeada,\n"
				                          +"arquivo etc. Reaproveitamento de codigo e facil manutencao");
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	
}
