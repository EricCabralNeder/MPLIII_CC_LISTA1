package Questoes;

import javax.swing.JOptionPane;

public class Defina_Objeto {
	
	private String texto;
	
	public Defina_Objeto(String texto){
		this.texto = texto;
	}
	
	public void ler(){
		JOptionPane.showMessageDialog(null, "DEFINA - ESTADO(atributos),COMPORTAMENTO(metodos),INTERFACE(assinatura),IDENTIDADE ! \n\n\n            "
				                           +".Um Estado(atributos),DEFINICAO: e uma variavel de uma classe. EXEMPLO: int valor1;\n\n"
				                           +".Um Comportamento(metodos),DEFINICAO:comportamento ou estado de uma classe. \n"
				                           + "EXEPLO: public voi ler(){\n"
				                           + "JOptionPane.showMessageDialog(null,andar)}; \n\n"
				                           + "Interface(assinaturas),DEFINICAO: Interface é um recurso da orientação a objeto utilizado \n"
				                           + "em Java que define ações que devem ser obrigatoriamente executadas, mas que cada classe pode \n"
				                           + "executar de forma diferente.\n"
				                           + "EXEMPLO: public class TV{\n"
				                           + "private int tamanho,canal,volume,ligada;\n"
				                           + "public TV (int tamanho){\n"
				                           + "this.tamanho = tamanho\n;"
				                           + "this.canal = 0;\n"
				                           + "this.volume = 0;\n"
				                           + "this.ligada = false; \n\n"
				                           + "(Identidade),DEFINICAO: e a propiedade de um objeto que distingue-o de outros objetos. \n"
				                           + "EXEMPLO: uma classe");
	}

}

