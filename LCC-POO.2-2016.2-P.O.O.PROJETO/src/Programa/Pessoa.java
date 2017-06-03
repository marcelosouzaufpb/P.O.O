package Programa;

public class Pessoa {

    private String nome;
    private String cpf;
    private String rg;
    private String sexo;
    private Contato contato;
    private Data nacimento;

    public Pessoa() {
        this.nome = "Sem nome";
        this.cpf = "Sem cpf";
        this.rg = "Sem rg";
        this.sexo = "Sem sexo";
        this.contato = contato;
        this.nacimento = nacimento;
    }

    public Pessoa(String nome, String cpf, String rg, String sexo, Contato contato, Data nacimento) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.contato = contato;
        this.nacimento = nacimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Data getNacimento() {
        return nacimento;
    }

    public void setNacimento(Data nacimento) {
        this.nacimento = nacimento;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", spf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + ", contato=" + contato
                + ", nacimento=" + nacimento + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contato == null) ? 0 : contato.hashCode());
        result = prime * result + ((nacimento == null) ? 0 : nacimento.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((rg == null) ? 0 : rg.hashCode());
        result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Pessoa other = (Pessoa) obj;
        if (contato == null) {
            if (other.contato != null) {
                return false;
            }
        } else if (!contato.equals(other.contato)) {
            return false;
        }
        if (nacimento == null) {
            if (other.nacimento != null) {
                return false;
            }
        } else if (!nacimento.equals(other.nacimento)) {
            return false;
        }
        if (nome == null) {
            if (other.nome != null) {
                return false;
            }
        } else if (!nome.equals(other.nome)) {
            return false;
        }
        if (rg == null) {
            if (other.rg != null) {
                return false;
            }
        } else if (!rg.equals(other.rg)) {
            return false;
        }
        if (sexo == null) {
            if (other.sexo != null) {
                return false;
            }
        } else if (!sexo.equals(other.sexo)) {
            return false;
        }
        if (cpf == null) {
            if (other.cpf != null) {
                return false;
            }
        } else if (!cpf.equals(other.cpf)) {
            return false;
        }
        return true;
    }

}
