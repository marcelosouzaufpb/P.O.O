package Programa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Treinador extends Funcionario {

    private Acesso acesso;
    private List<Cliente> listaDeClientes;
    private String diaDePagamento;

    public Treinador(String nome, String cpf, String rg, String sexo, Contato contato, Data nacimento, double salario,
            String turno, String funcao, Acesso acesso, List<Cliente> listaDeClientes, String diaDePagamento) {
        super(nome, cpf, rg, sexo, contato, nacimento, salario, turno, funcao);
        this.acesso = acesso;
        this.listaDeClientes = new ArrayList<Cliente>();
        this.diaDePagamento = diaDePagamento;

    }

    public Treinador() {
        this.acesso = null;
        this.listaDeClientes = new ArrayList<Cliente>();

    }

    public boolean cadastrarCliente(Cliente c) {
        for (Cliente a : this.listaDeClientes) {
            if (a.getCpf().equals(c.getCpf())) {

                return false;
            }
        }
        this.listaDeClientes.add(c);

        return true;

    }

    public Cliente pesquisaClienet(String cpf) {
        for (Cliente c : listaDeClientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    public boolean removerCliente(String cpf) {
        Iterator<Cliente> i = this.listaDeClientes.iterator();
        while (i.hasNext()) {
            Cliente a = i.next();
            if (a.getCpf().equals(cpf)) {
                i.remove();

                return true;
            }
        }
        return false;
    }

    public boolean existeLogin(String login) {
        for (Cliente a : this.listaDeClientes) {
            if (a.getAcesso().getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }

    public boolean existeSenha(String senha) {
        for (Cliente a : this.listaDeClientes) {
            if (a.getAcesso().getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public Cliente pesquisaClienteLOSE(String nome, String senha) {
        for (Cliente x : this.listaDeClientes) {
            if (nome.equals(x.getAcesso()) && senha.equals(x.getAcesso().getSenha())) {
                return x;
            }
        }
        return null;
    }

    public Acesso getAcesso() {
        return acesso;
    }

    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }

    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(List<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    public String getDiaDePagamento() {
        return diaDePagamento;
    }

    public void setDiaDePagamento(String diaDePagamento) {
        this.diaDePagamento = diaDePagamento;
    }

    @Override
    public String toString() {
        return "Treinador [acesso=" + acesso + ", listaDeClientes=" + listaDeClientes + ", diaDePagamento="
                + diaDePagamento + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((acesso == null) ? 0 : acesso.hashCode());
        result = prime * result + ((diaDePagamento == null) ? 0 : diaDePagamento.hashCode());
        result = prime * result + ((listaDeClientes == null) ? 0 : listaDeClientes.hashCode());
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
        Treinador other = (Treinador) obj;
        if (acesso == null) {
            if (other.acesso != null) {
                return false;
            }
        } else if (!acesso.equals(other.acesso)) {
            return false;
        }
        if (diaDePagamento == null) {
            if (other.diaDePagamento != null) {
                return false;
            }
        } else if (!diaDePagamento.equals(other.diaDePagamento)) {
            return false;
        }
        if (listaDeClientes == null) {
            if (other.listaDeClientes != null) {
                return false;
            }
        } else if (!listaDeClientes.equals(other.listaDeClientes)) {
            return false;
        }
        return true;
    }

}
