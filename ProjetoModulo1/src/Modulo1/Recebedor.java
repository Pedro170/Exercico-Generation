package Modulo1;

import java.util.Scanner;

public class Recebedor implements Dados {
	Scanner leia = new Scanner(System.in);
	String nome, email, tel, cidade, esco;
	
	@Override
	public void nome() {
		System.out.println("******************************************************");
		System.out.println("* CADASTRE-SE AQUI PARA PODER RECEBER UM DISPOSITIVO *");
		System.out.println("******************************************************");
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
		System.out.print("Digite seu bairro: ");
		cidade = leia.next();
	}

	@Override
	public void dispositivo() {
		System.out.print("Coloque aqui a escola que você estuda : ");
		esco = leia.next();
	}
	
	@Override
	public void status() {
		System.out.println("\n ---------------------------------------------------- ");
		System.out.println("|**********************RECEPTOR**********************|");
		System.out.println(" ----------------------------------------------------");
		System.out.println("Recebeu: " + nome);
		System.out.println("E-Mail: " + email);
		System.out.println("Tel: " + tel);
		System.out.println("Bairro: " + cidade);
		System.out.println("Escola: " + esco);
	}
	
	public void recebedor() {
		System.out.println("\n ---------------------------------------------------- ");
		System.out.println("|**********************RECEPTOR**********************|");
		System.out.println(" ----------------------------------------------------");
		System.out.println("\nNome do receptor: José Raimundo dos Santos");
		System.out.println("Email do receptor: shaolinmatadordeporco@gmail.com");
		System.out.println("Telefone do Recpetor: (11) 98466-1875");
		System.out.println("Bairro: Jardim Pery");
		System.out.println("Escola: Capitão II");
	}
	
}
