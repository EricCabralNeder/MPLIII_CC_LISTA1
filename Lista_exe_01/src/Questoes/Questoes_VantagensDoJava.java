package Questoes;

import javax.swing.JOptionPane;


public class Questoes_VantagensDoJava {

	private String texto;
	        
	public Questoes_VantagensDoJava(String texto){
		this.texto = texto;
	}
	
	public void ler(){
		JOptionPane.showMessageDialog(null,"                                          QUESTAO 01 - Funcionamento do Compilador\n\n\n"
				                          + "No processo de compila��o, ao inv�s do programa ser compilado para c�digo de m�quina \n"
                                          +"da plataforma que vai ser executado, o programa � compilado para bytecode\n"
                                          +"�O bytecode � gen�rico, isto �, n�o � espec�fico para nenhum sistema operacional em particular\n"
                                          +"�Quando um programa Java � executado, o arquivo bytecode � interpretado pelo interpretador\n"
                                          +" da tecnologia java, que � denominado Java Virtual Machine\n"
                                          +".Existe uma JVM diferente para cada plataforma onde a tecnologia Java pode ser executada \n"
                                          + "e dever� existir uma instalada no computador no qual ser� executado um programa \n"
                                          + "Java. Os browsers, por exemplo, incorporam uma JVM para a execu��o de applets \n"); 
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	
}
