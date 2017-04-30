
public class Controle {
	private Cliente cliente;
	private Treinador treinadores;

	public Controle(Cliente cliente, Treinador treinadores) {
		super();
		this.cliente = cliente;
		this.treinadores = treinadores;
	}

	public String toString() {
		return this.cliente.toString() + ".\n" + this.treinadores.toString();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Treinador getTreinadores() {
		return treinadores;
	}

	public void setTreinadores(Treinador treinadores) {
		this.treinadores = treinadores;
	}

}
