package Programa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class Gerente extends Funcionario {

    private List<Treinador> listaDeTreinadores;

    public Gerente() {
        this.listaDeTreinadores = new ArrayList<Treinador>();
    }

    public Gerente(String nome, String spf, String rg, String sexo, Contato contato, Data nacimento, double salario,
            String turno, String funcao, List<Treinador> listaDeTreinadores) {
        super(nome, spf, rg, sexo, contato, nacimento, salario, turno, funcao);
        this.listaDeTreinadores = new ArrayList<Treinador>();
    }

    public boolean cadastraFuncionario(Treinador t) {
        for (Treinador x : this.listaDeTreinadores) {
            if (x.getCpf().equals(t.getCpf())) {

                return false;
            }
        }
        this.listaDeTreinadores.add(t);

        return true;
    }

    public boolean removerFuncionario(String cpf) {
        Iterator<Treinador> i = this.listaDeTreinadores.iterator();
        while (i.hasNext()) {
            Treinador a = i.next();
            if (a.getCpf().equals(cpf)) {
                i.remove();

                return true;
            }
        }
        return false;
    }

    public Treinador pesquisarFuncionario(String cpf) {
        for (Treinador t : listaDeTreinadores) {
            if (t.getCpf().equals(cpf)) {

                return t;
            }
        }
        return null;
    }

    public boolean existeLogin(String login) {
        for (Treinador a : this.listaDeTreinadores) {
            if (a.getAcesso().getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }

    public boolean existeSenha(String senha) {
        for (Treinador a : this.listaDeTreinadores) {
            if (a.getAcesso().getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public List<Treinador> getListaDeTreinadores() {
        return listaDeTreinadores;
    }

    public void setListaDeTreinadores(List<Treinador> listaDeTreinadores) {
        this.listaDeTreinadores = listaDeTreinadores;
    }

    @Override
    public String toString() {
        return "Gerente [listaDeTreinadores=" + listaDeTreinadores + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((listaDeTreinadores == null) ? 0 : listaDeTreinadores.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Gerente other = (Gerente) obj;
        if (listaDeTreinadores == null) {
            if (other.listaDeTreinadores != null) {
                return false;
            }
        } else if (!listaDeTreinadores.equals(other.listaDeTreinadores)) {
            return false;
        }
        return true;
    }

}
