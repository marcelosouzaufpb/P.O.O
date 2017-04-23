package Questao02;

public class ProdutoGenerico<X> {
	private X codigo;
	private String descricao;
	private double preco;

	public ProdutoGenerico(X cod, String descr, double pr) {
		codigo = cod;
		descricao = descr;
		preco = pr;
	}

	public X getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	public String toString() {
		return this.codigo.toString() + "\n" + this.descricao.toString() + "\n" + this.preco;
	}

}
