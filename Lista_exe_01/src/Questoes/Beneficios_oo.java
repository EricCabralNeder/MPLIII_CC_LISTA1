package Questoes;

import javax.swing.JOptionPane;

public class Beneficios_oo {
	
	private String texto;
	
	public Beneficios_oo(){
		this.texto = texto;
	}
	
	public void ler(){
		JOptionPane.showMessageDialog(null,"                       Defina e exemplifique os benefícios da Orientação a Objetos \n\n\n"
			                              +"Os benefícios da Orientação a Objetos: Informalmente um objeto representa uma entidade,\n"
				                          +"tanto física quanto conceitual ou de software. EXEMPLO: Entidade Física: caminhão, carro,\n"
				                          +"Entidade Conceitual: processo químico, matrícula,Entidade de Software: lista encadeada,\n"
				                          +"arquivo etc. Reaproveitamento de codigo e facil manutencao");
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	
}
