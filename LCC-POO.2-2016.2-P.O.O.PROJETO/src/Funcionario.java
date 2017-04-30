

public abstract class Funcionario extends Pessoa {
	private double salario;
	private HorarioEDiaDeTrabalho horasEDiaTrabalho;
	private String funcao;

	public Funcionario(String nome, Data dataDeNascimento, int cpf, int rg, Contato contatos) {
		super(nome, dataDeNascimento, cpf, rg, contatos);
	}

	public Funcionario(double salario, HorarioEDiaDeTrabalho horasEDiaTrabalho, String funcao) {
		this.salario = salario;
		this.horasEDiaTrabalho = horasEDiaTrabalho;
		this.funcao = funcao;
	}

	public String toString() {
		return "Função: " + this.funcao + ".\n " + this.horasEDiaTrabalho.toString() + ".\n" + this.salario + ".";
	}

	public abstract double calculaSalario();

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public HorarioEDiaDeTrabalho getHorasEDiaTrabalho() {
		return horasEDiaTrabalho;
	}

	public void setHorasEDiaTrabalho(HorarioEDiaDeTrabalho horasEDiaTrabalho) {
		this.horasEDiaTrabalho = horasEDiaTrabalho;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((funcao == null) ? 0 : funcao.hashCode());
		result = prime * result + ((horasEDiaTrabalho == null) ? 0 : horasEDiaTrabalho.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (funcao == null) {
			if (other.funcao != null)
				return false;
		} else if (!funcao.equals(other.funcao))
			return false;
		if (horasEDiaTrabalho == null) {
			if (other.horasEDiaTrabalho != null)
				return false;
		} else if (!horasEDiaTrabalho.equals(other.horasEDiaTrabalho))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}

}
