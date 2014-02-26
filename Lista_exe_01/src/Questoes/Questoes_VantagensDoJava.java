package Questoes;

import javax.swing.JOptionPane;


public class Questoes_VantagensDoJava {

	private String texto;
	        
	public Questoes_VantagensDoJava(String texto){
		this.texto = texto;
	}
	
	public void ler(){
		JOptionPane.showMessageDialog(null,"                                          QUESTAO 01 - Funcionamento do Compilador\n\n\n"
				                          + "No processo de compilação, ao invés do programa ser compilado para código de máquina \n"
                                          +"da plataforma que vai ser executado, o programa é compilado para bytecode\n"
                                          +"•O bytecode é genérico, isto é, não é específico para nenhum sistema operacional em particular\n"
                                          +"•Quando um programa Java é executado, o arquivo bytecode é interpretado pelo interpretador\n"
                                          +" da tecnologia java, que é denominado Java Virtual Machine\n"
                                          +".Existe uma JVM diferente para cada plataforma onde a tecnologia Java pode ser executada \n"
                                          + "e deverá existir uma instalada no computador no qual será executado um programa \n"
                                          + "Java. Os browsers, por exemplo, incorporam uma JVM para a execução de applets \n"); 
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	
}
