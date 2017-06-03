package Programa;

public class Cliente extends Pessoa {

    private Data inicio;
    private String turno;
    private Treino treino;
    private String status;
    private String profRes;
    private Acesso acesso;
    private String diaDePagamento;
    private Ficha ficha;

    public Cliente() {
        this.inicio = null;
        this.turno = "sem turno";
        this.treino = null;
        this.status = "sem estatus";
        this.profRes = "sem professor";
        this.acesso = null;
        this.diaDePagamento = "Sem dia de Pagamento";
        this.ficha = null;
    }

    public Cliente(String nome, String spf, String rg, String sexo, Contato contato, Data nacimento, Data inicio,
            String turno, Treino treino, String status, String profRes, Acesso acesso, String diaDePagamento,Ficha ficha) {
        super(nome, spf, rg, sexo, contato, nacimento);
        this.inicio = inicio;
        this.turno = turno;
        this.treino = treino;
        this.status = status;
        this.profRes = profRes;
        this.acesso = acesso;
        this.diaDePagamento = diaDePagamento;
        this.ficha = ficha;
    }

	public Data getInicio() {
		return inicio;
	}

	public void setInicio(Data inicio) {
		this.inicio = inicio;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Treino getTreino() {
		return treino;
	}

	public void setTreino(Treino treino) {
		this.treino = treino;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProfRes() {
		return profRes;
	}

	public void setProfRes(String profRes) {
		this.profRes = profRes;
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}

	public String getDiaDePagamento() {
		return diaDePagamento;
	}

	public void setDiaDePagamento(String diaDePagamento) {
		this.diaDePagamento = diaDePagamento;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((acesso == null) ? 0 : acesso.hashCode());
		result = prime * result + ((diaDePagamento == null) ? 0 : diaDePagamento.hashCode());
		result = prime * result + ((ficha == null) ? 0 : ficha.hashCode());
		result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
		result = prime * result + ((profRes == null) ? 0 : profRes.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((treino == null) ? 0 : treino.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (acesso == null) {
			if (other.acesso != null)
				return false;
		} else if (!acesso.equals(other.acesso))
			return false;
		if (diaDePagamento == null) {
			if (other.diaDePagamento != null)
				return false;
		} else if (!diaDePagamento.equals(other.diaDePagamento))
			return false;
		if (ficha == null) {
			if (other.ficha != null)
				return false;
		} else if (!ficha.equals(other.ficha))
			return false;
		if (inicio == null) {
			if (other.inicio != null)
				return false;
		} else if (!inicio.equals(other.inicio))
			return false;
		if (profRes == null) {
			if (other.profRes != null)
				return false;
		} else if (!profRes.equals(other.profRes))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (treino == null) {
			if (other.treino != null)
				return false;
		} else if (!treino.equals(other.treino))
			return false;
		if (turno == null) {
			if (other.turno != null)
				return false;
		} else if (!turno.equals(other.turno))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [inicio=" + inicio + ", turno=" + turno + ", treino=" + treino + ", status=" + status
				+ ", profRes=" + profRes + ", acesso=" + acesso + ", diaDePagamento=" + diaDePagamento + ", ficha="
				+ ficha + "]";
	}

   
}
