package Modulo1;

import java.util.Scanner;

public class TesteDados {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		Doador doador = new Doador();
		Recebedor recebedor = new Recebedor();
		//		abertura
		System.out.println("*************************************");
		System.out.println("* BEM VINDO - FAÇA O BEM PRA ALGUÉM *");
		System.out.println("*************************************");
		System.out.println("[AVISO] : Use o underline(_) ou hífen(-) para separação entre nomes!\n");
		
		//	 condicional switch case
		System.out.print("O que você deseja fazer: \n[1] - Para doar\n[2] - Para receber\n");
		int op = leia.nextInt();
		while(op < 1 || op > 2) {
			System.out.println("[ERRO]: OPÇÃO INVÁLIDA!! POR FAVOR ESCOLHA UMA DAS OPÇÕES ABAIXO.\n");
			System.out.print("O que você deseja fazer: \n[1] - Para doar\n[2] - Para receber\n");
			op = leia.nextInt();
		}
		switch(op) {
		case 1: 
			doador.nome();
			doador.email();
			doador.telefone();
			doador.cidade();
			doador.dispositivo();
			doador.status();
			recebedor.recebedor();
			break;
		case 2:
			recebedor.nome();
			recebedor.email();
			recebedor.telefone();
			recebedor.cidade();
			recebedor.dispositivo();
			recebedor.status();
			doador.doador(); 
			break;
		default:
		}
		
		
	}
}
