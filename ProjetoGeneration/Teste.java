package ProjetoGeneration;

import java.util.Scanner;

public class Teste {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		String nome = "", email = "", produto = "", cidade = "";
		int op, quatidade = 0, senha = 0, cadastro = 0;
		
		Doador doador = new Doador();
		Receptor receptor = new Receptor();
		DadosPessoais dadospessoasi = null;
		
		System.out.println("************************************");
		System.out.println("* BEM VINDO - FAÇA O BEM PRA ALGUÉM *");
		System.out.println("************************************");
		
		System.out.println("[AVISO] : Use o underline(_) ou hífen(-) para separação entre nomes!");
		
		//-----------------------------FAZENDO CADASTRO---------------------------------------
		do {
		System.out.print("\nEscolha uma opção\n[1] - Já tenho cadastro\n[2] - Não tenho cadastro\n");
		op = leia.nextInt();
		switch(op) {
		case 1:
			System.out.println("FAÇA O LOGIN...");
			System.out.print("Digite seu e-mail: ");
			nome = leia.next();
			leia.nextLine();
			//System.out.print("Digite sua senha: ");
			//senha = leia.nextInt();
			break;
		case 2: 
			System.out.println("CRIE UMA CONTA...");
			System.out.print("Digite seu nome completo: ");
			nome = leia.next();
			leia.nextLine();
			System.out.print("Digite seu e-mail: ");
			email = leia.next();
			leia.nextLine();
			System.out.print("Digite seu telefone: ");
			String cel = leia.next();
			//System.out.print("Agora digita uma senha: ");
			//senha = leia.nextInt();
		}
		
		doador.doc();
		
		System.out.println(" ---------------------------------------------------- ");
		System.out.println("|***********************DOAÇÃO***********************|");
		System.out.println(" ----------------------------------------------------\n");
		doador.Nome(nome);
		doador.Email(email);
		doador.Cidade(cidade);
		doador.Produto(produto);
		
		System.out.println("\n ---------------------------------------------------- ");
		System.out.println("|**********************RECEPTOR**********************|");
		System.out.println(" ----------------------------------------------------");
		receptor.Nome(nome);
		receptor.NomeInstituicao();
		receptor.Email(email);
		receptor.Produto(produto);
		
		System.out.print("\n\nAinda tem pesoas para cadastrar: [1] - SIM e [2] - NÃO: ");
		cadastro = leia.nextInt();
		}while(cadastro == 1);
		
		
		
		
		
		//------------------------------CADASTRO FEITO---------------------------------

		/*
		System.out.print("O que você deseja fazer: \n[1] - Para doar\n[2] - Para receber\n");
		op = leia.nextInt();
		while(op < 1 || op > 2) {
			System.out.println("[ERRO]: OPÇÃO INVÁLIDA!! POR FAVOR ESCOLHA UMA DAS OPÇÕES ABAIXO.\n");
			System.out.print("O que você deseja fazer: \n[1] - Para doar\n[2] - Para receber\n");
			op = leia.nextInt();
		}
		switch(op) {
		case 1:
			System.out.println("*********************************************");
			System.out.println("* DOE AQUI O APARELHO QUE VOCÊ NÃO USA MAIS *");
			System.out.println("*********************************************");
			System.out.println("NOME: " + nome);
			//nome = leia.next();
			//leia.nextLine();
			System.out.println("E-MAIL: " + email);
			//email = leia.next();
			System.out.print("Qual a sua cidade ? ");
			cidade = leia.next();
			leia.nextLine();
			System.out.print("Qual produto vai doar? ");
			produto = leia.next();
			System.out.print("Quantos produtos pretendi doar: \n[1] - 1 Produto\n[2] - 2 Produto ou MAIS\n");
			quatidade = leia.nextInt();
			switch(quatidade) {
			case 1:
				System.out.println("\nOBRIGADO PELA SUA DOAÇÃO! VOCÊ ESTÁ AJUDANDO UMA CRIANÇA A CONTINUAR ESTUDANO!");
				break;
			case 2:
				System.out.println("\nOBRIGADO PELA SUA DOAÇÃO! VOCÊ ESTÁ AJUDANDO DUAS CRIANÇA A CONTINUAR ESTUDANO!");
				break;
			default:
				System.out.println("\nOBRIGADO PELA SUA DOAÇÃO!");
			}
			break;
		case 2:
			System.out.print("Digite seu nome completo: ");
			nome = leia.next();
			leia.nextLine();
			System.out.print("Digite seu CPF: ");
			email = leia.next();
			System.out.print("Qual sua escola? ");
			escola = leia.next();
		}
		*/
		
	}
}