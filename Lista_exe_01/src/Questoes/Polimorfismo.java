package Questoes;

import javax.swing.JOptionPane;

public class Polimorfismo {

	private String texto;
	
	public Polimorfismo(){
		this.texto = texto;
	}
	
	public void ler(){
		JOptionPane.showMessageDialog(null, "                                 Defina e exemplifique Polimorfismo.\n\n\n"
				                           +"Polimorfismo: � a habilidade de vari�veis terem �mais de um tipo�.\n"
				                           +"Fun��es s�o ditas polim�rficas quando seus operandos podem ter mais de um tipo \n"
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

