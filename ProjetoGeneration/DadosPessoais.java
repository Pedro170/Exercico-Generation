package ProjetoGeneration;

public abstract class DadosPessoais {
	
	String DadosPessoais;
	
	public DadosPessoais (String DadosPessoais) 
	{
		this.DadosPessoais = DadosPessoais;
	}
	abstract public void Email(String emaildadospessoais);
	abstract public void Nome(String nomedadospessoais);
	abstract public void Telefone(String telefonedadospessoais);
	abstract public void Cidade(String cidadedadospessoais);
	abstract public void Produto(String produtos);
	public String getDadosPessoais() {
		return DadosPessoais;
	}
	public void setDadosPessoais(String dadosPessoais) {
		DadosPessoais = dadosPessoais;
	}
	
	
}

	