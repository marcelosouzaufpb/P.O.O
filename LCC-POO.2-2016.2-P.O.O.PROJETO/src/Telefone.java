
public class Telefone {
	private int numero;
	private String operadora;
	private int prefixo;

	public Telefone(int numero, String operadora, int prefixo) {
		super();
		this.numero = numero;
		this.operadora = operadora;
		this.prefixo = prefixo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public int getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(int prefixo) {
		this.prefixo = prefixo;
	}
}
