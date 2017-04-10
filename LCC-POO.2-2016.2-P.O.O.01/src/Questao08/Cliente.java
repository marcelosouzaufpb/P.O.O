package Questao08;

public class Cliente extends Pessoa {
	private int codigo;

	public Cliente(String nome, Data nacimento, int codigo) {
		super(nome, nacimento);
		this.codigo = codigo;
	}

	public Cliente() {
		this.codigo = 0;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String imprimirDados() {

		return "(" + this.codigo + ")";
	}

}
