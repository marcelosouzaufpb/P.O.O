package Questao04;

public class ProdutoGenerico<X, Y> {
	private X codigo;
	private String descricao;
	private Y preco;

	public ProdutoGenerico(X cod, String descr, Y pr) {
		codigo = cod;
		descricao = descr;
		preco = pr;
	}

	public X getCodigo() {
		return codigo;
	}

	public void setCodigo(X codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Y getPreco() {
		return preco;
	}

	public void setPreco(Y preco) {
		this.preco = preco;
	}

	public String toString() {
		return this.codigo + "\n" + this.descricao + "\n" + this.preco;

	}

}
