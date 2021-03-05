package ProjetoGeneration;

import java.util.Scanner;

public class Doador extends DadosPessoais  {
	
	private String produto;
	
	public Doador() 
	{
		super("Doador");
	}
	
	public void doc() {
		Scanner leia = new Scanner(System.in);
		String email = "", escola = "", cidade = "";
		int op, quatidade = 0, senha = 0;
		
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
			System.out.print("Digite seu nome: ");
			String nome = leia.next();
			//leia.nextLine();
			System.out.print("Digite seu e-mail: ");
			email = leia.next();
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
			//nome = leia.next();
			leia.nextLine();
			System.out.print("Digite seu CPF: ");
			email = leia.next();
			System.out.print("Qual sua escola? ");
			escola = leia.next();
		}
	}
	
	
	@Override
	public void Nome(String nomedadospessoais)
	{
		System.out.println("Doador: " + nomedadospessoais);
	}
	
	@Override
	public void Email(String emaildadospessoais)
	{
		System.out.println("Email do Doador: " + emaildadospessoais);
	}
	
	@Override
	public void Telefone(String telefonedadospessoais)
	{
		System.out.println("Telefone do Doador: " + telefonedadospessoais);
	}
	
	@Override
	public void Cidade(String cidadedadospessoais)
	{
		System.out.println("Cidade do Doador: " + cidadedadospessoais);
	}
	
	@Override
	public void Produto(String produtos) {
		System.out.println("Dispositivo(s) doado(s): " + produtos);
	}
	
	/*
	 public void Dispositivo()
	{
		System.out.println("Qual é o Tipo do Dispositivo Eletronico");
	}
	public void  Informacoes()
	{
		System.out.println("Qual o estado do Dispositivo Eletronico");
	}
	*/ 
	
}

