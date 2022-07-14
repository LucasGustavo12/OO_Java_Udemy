package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;
	private String sobrenome;

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	// Getter
	public int getIdade() {
		return idade;
	}

	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 100) {
			this.idade = novaIdade;
		}

	}

	@Override
	public String toString() {
		return "Olá eu sou o " + getNome() + " e tenho " + getIdade() + "anos.";
	}

}
