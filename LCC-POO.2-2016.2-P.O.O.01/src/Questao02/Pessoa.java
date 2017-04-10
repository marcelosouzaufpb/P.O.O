package Questao02;

public class Pessoa {

	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;

	public Pessoa(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
	}

	public Pessoa() {
		this.nome = "";
		this.idade = 0;
		this.altura = 0.0;
		this.peso = 0.0;
		this.sexo = "";
	}

	public Pessoa(String nome, int idade, double peso, String sexo, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double IMC() {
		return (this.peso / (this.altura * this.altura));
	}

	public String toSring() {
		if (IMC() <= 18.5) {
			return this.nome + " Abaixo do peso normal";
		} else if ((18.5 < IMC()) && (IMC() <= 25)) {
			return "Peso Normal";

		} else if ((25 < IMC()) && (IMC() <= 30)) {
			return this.nome + " Acima do peso normal";

		} else {
			return this.nome + " Obesidade";
		}
	}
}
