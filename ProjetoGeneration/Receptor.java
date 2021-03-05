package ProjetoGeneration;

public class Receptor extends DadosPessoais {
	
	public Receptor()
	{
		super("Receptor");
	}
	
	@Override
	public void Nome(String nomedadospessoais)
	{
		System.out.println("Nome do receptor: José Raimundo dos Santos");
	}
	
	@Override
	public void Email(String emaildadospessoais)
	{
		System.out.println("Email do receptor: shalinmatadordeporco@gmail.com");
	}
	
	@Override
	public void Telefone(String telefonedadospessoais)
	{
		System.out.println("Telefone do Recpetor: (11) 98466-1875");
	}
	
	@Override
	public void Cidade(String cidadedadospessoais)
	{
		System.out.println("Bairro: Jardim Pery");
	}
	
	public void Dispositivo()
	{
		System.out.println("Qual é o Tipo do Dispositivo Eletronico: " );
	}
	
	public void NomeInstituicao()
	{
		System.out.println("Escola: Capitão II");
	}
	
	public void Produto(String produtos) {
		System.out.println("Dispositivo(s) doado(s): " + produtos);
	}

}
