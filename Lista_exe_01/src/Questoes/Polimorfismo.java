package Questoes;

import javax.swing.JOptionPane;

public class Polimorfismo {

	private String texto;
	
	public Polimorfismo(){
		this.texto = texto;
	}
	
	public void ler(){
		JOptionPane.showMessageDialog(null, "                                 Defina e exemplifique Polimorfismo.\n\n\n"
				                           +"Polimorfismo: É a habilidade de variáveis terem “mais de um tipo”.\n"
				                           +"Funções são ditas polimórficas quando seus operandos podem ter mais de um tipo \n"
				                           + "EXEMPLO: voidmain(){\n"
				                           + "Elipsee;\n"
				                           + "Circuloc;\n"
				                           + "imprimir(e);\n"
				                           + "imprimir(c);\n"
				                           + "}voidimprimir(Elipseeli){....}");
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	
}

