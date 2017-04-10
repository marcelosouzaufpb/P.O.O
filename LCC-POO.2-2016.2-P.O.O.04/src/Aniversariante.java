
public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;

	public Aniversariante() {
		this.nome = "";
		this.dataAniversario = null;
	}

	public Aniversariante(String nome, int dia, int mes, int ano) {
		this.nome = nome;
		this.dataAniversario = new DataAniversario(dia, mes, ano);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public boolean ehAniversarianteDoMes(int mes) {
		if (02 == mes) {
			return true;
		}
		return false;
	}

}
