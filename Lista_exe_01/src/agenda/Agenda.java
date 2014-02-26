package agenda;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;


public class Agenda {

	Scanner scan = new Scanner(System.in);
	//Contato []contato = new Contato[10];
	
	private int n = 0;
    
	
	public Agenda(){
		this.n = n;
	}
	
public void agenda(String livro){	
	do{
	
		
	n =	Integer.parseInt(JOptionPane.showInputDialog("             MENU DE OPCOES \n\n"
				                          + "1 - Adicionar \n"
				                          + "2 - Procurar \n"
				                          + "3 - Editar \n"
				                          + "4 - Listar \n"
				                          + "5 - Remover \n"
				                          + "6 - Voltar \n"));
		
		switch(n){
		
		
		case 1:
		    
			
			
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		
		
		default:
			JOptionPane.showMessageDialog(null, "OPCAO INVALIDA !");	
		}
	
	}while(n != 6);
	
	
}


}
