package Main;


import java.util.Scanner;

import javax.swing.JOptionPane;

import Questoes.Beneficios_oo;
import Questoes.Defina_Objeto;
import Questoes.Polimorfismo;
import Questoes.Questoes_VantagensDoJava;
import Folha_de_pagamento.FolhaDePagamento;
import Loja_de_informatica.Fatura;
import agenda.Agenda;



public class Principal {

	public static void main(String[] args) {

		
//*******************************estanciando objetos********************************************************
	Questoes_VantagensDoJava questoes = new Questoes_VantagensDoJava("");	
	Defina_Objeto objeto = new Defina_Objeto("");	
	Beneficios_oo beneficio = new Beneficios_oo();
	Polimorfismo polimorfismo = new Polimorfismo();	
	Scanner scan = new Scanner(System.in);
	FolhaDePagamento pg = new FolhaDePagamento();
    Agenda agenda = new Agenda();
    Fatura fatura = new Fatura();
//******************************declaracao de variaveis*****************************************************
	
    
	int n=1;
	String entrada;
	double valor = 0;
	String livro = "";
	
	
	do{
	
		
		n = Integer.parseInt(JOptionPane.showInputDialog("                          MENU DE OPCOES \n\n\n"
				                          + "1 - Resposta da 1 questao (as vantagens do java)\n"
				                          + "2 - Resposta da 2 questao (definicoes de um objeto)\n"
				                          + "3 - resposta da 3 questao (defina orientacao a objeto)\n"
				                          + "4 - resposta da 4 questao (defina polimorfismo)\n"
				                          + "5 - Programa FOLHA DE PAGAMENTO \n"
				                          + "6 - Programa LOJA DE SUPRIMENTOS \n"
				                          + "7 - Programa AGENDA TELEFONICA \n"
				                          + "8 - Programa LOCADORA \n"
				                          + "9 - Programa RELACIONAMENTO DE VEICULOS \n"
				                          +"10 - Programa FIGURA GEOMETRICA \n"
				                          + "0 - SAIR DO PROGRAMA"));
		
                                       
		
		
		
		
		switch(n){
		
		case 1:
			questoes.ler();
		    break;
		case 2:
			objeto.ler();
			break;
		case 3:
			beneficio.ler();
			break;
		case 4:
			polimorfismo.ler();
			break;
		case 5:		
			entrada =JOptionPane.showInputDialog("digite seu codigo");
			JOptionPane.showMessageDialog(null, pg.teste(entrada));//pg.teste(entrada);	
			break;
		case 6:
			fatura.setNumero(JOptionPane.showInputDialog("Digite o Numero do Item: ")); 
			fatura.setDescricao(JOptionPane.showInputDialog("Digite uma Descricao do Produto: "));
			fatura.setQuantidadeComprada(Integer.parseInt(JOptionPane.showInputDialog( "Digite a Quantidade: ")));
			fatura.setPrecoPorIten(Integer.parseInt(JOptionPane.showInputDialog( "Digite o Preco: ")));
			
			
			
			JOptionPane.showMessageDialog(null,"Numero do Iten: "+fatura.getNumero()+"\n"
			                                  +"Descrição do Iten: "+fatura.getDescricao()+"\n"
					                          +"Quantidade Comprada: "+fatura.getQuantidadeComprada()+"\n"
			                                  +"Preço Unitario: "+fatura.getPrecoPorIten()+"\n\n"
			                                  +"Total da Nota: "+fatura.calculaFatura(fatura.getQuantidadeComprada(),fatura.getPrecoPorIten()));  // nao recebe o valor calculado !
			
			break;
		case 7:
			agenda.agenda(livro);
			break;
		case 8:
			
			break;
		case 9:
			
			break;
		case 10:
			
			break;
		case 0:
			System.exit(0);
		default:
			JOptionPane.showMessageDialog(null, "OPCAO INVALIDA !");
			
				
			
			
			
			
		
		}
		
		

                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
		
	}while(n != 0);
	}
			
	}


