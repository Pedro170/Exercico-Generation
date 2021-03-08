package Modulo1;

import java.util.Scanner;

public class Doador implements Dados {
	Scanner leia = new Scanner(System.in);
	String nome, email, tel, cidade, dispo;
	private String estadoDispo;
	
	public Doador() {
		this.estadoDispo = estadoDispo;
		
	}
	//getters e setters
	
	public String getEstadoDispo() {
		return estadoDispo;
	}
	public void setEstadoDispo(String estadoDispo) {
		this.estadoDispo = estadoDispo;
	}

	
	@Override
	public void nome() {
		System.out.println("*********************************************");
		System.out.println("* DOE AQUI O APARELHO QUE VOCÊ NÃO USA MAIS *");
		System.out.println("*********************************************");
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		leia.nextLine();
	}
	
	@Override
	public void email() {
		System.out.print("Digite seu email: ");
		email = leia.next();
		leia.nextLine();
	}
	@Override
	public void telefone() {
		System.out.print("Digite seu telefone: ");
		tel = leia.next();
	}
	@Override
	public void cidade() {
		System.out.print("Digite seu cidade: ");
		cidade = leia.next();
	}
	@Override
	public void dispositivo() {
		System.out.print("Qual(is) dispositivo(s) vai doar? : ");
		dispo = leia.next();
		System.out.print("Quantos dispositivos está doando: \n[1] - 1 Produto\n[2] - 2 Produto ou MAIS\n");
		int quatidade = leia.nextInt();
		switch(quatidade) {
		case 1:
			System.out.println("\nOBRIGADO PELA SUA DOAÇÃO! VOCÊ ESTÁ AJUDANDO UMA PESSOA A CONTINUAR ESTUDANO!");
			break;
		case 2:
			System.out.println("\nOBRIGADO PELA SUA DOAÇÃO! VOCÊ ESTÁ AJUDANDO DUAS PESSOAS A CONTINUAR ESTUDANO!");
			break;
		default:
			System.out.println("\nOBRIGADO PELA SUA DOAÇÃO!");
		}

	}
	
	@Override
	public void status() {
		System.out.println("\n --------------------------------------------------- ");
		System.out.println("|***********************DOADOR***********************|");
		System.out.println(" ----------------------------------------------------\n");
		System.out.println("Doador(a): " + nome);
		System.out.println("E-Mail: " + email);
		System.out.println("Tel: " + tel);
		System.out.println("Cidade: " + cidade);
		System.out.println("Dispositivo(s) doado(s): " + dispo);
	}
	
	public void doador() {
		System.out.println("\n --------------------------------------------------- ");
		System.out.println("|***********************DOADOR***********************|");
		System.out.println(" ----------------------------------------------------\n");
		System.out.println("Doador(a): Karine Antunes Farias");
		System.out.println("E-mail: karineantunesfarias@gmail.com.br");
		System.out.println("Telefone: (64) 57344-8923");
		System.out.println("Cidade: Campinas");
	}
	
}
