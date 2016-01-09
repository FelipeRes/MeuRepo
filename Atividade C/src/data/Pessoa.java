package data;

public class Pessoa {
	private String nome;
	private String CPF;
	private String RG;
	private int idade;
	private String sexo;
	
	public Pessoa(String nome, String CPF, String RG,  int idade, String sexo){
		this.nome = nome;
		this.CPF = CPF;
		this.RG = RG;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}
	
}
