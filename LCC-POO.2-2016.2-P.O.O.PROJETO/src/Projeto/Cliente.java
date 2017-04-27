package Projeto;

import java.util.List;

public class Cliente extends Pessoa {
	protected List<Treino> listaDeTreinos;
	protected String turno;
	protected Estatos estatos;

	public Cliente(String nome, Idade idade, int rg, int cpf, List<Treino> listaDeTreinos, String turno,
			Estatos estatos) {
		super(nome, idade, rg, cpf);
		this.listaDeTreinos = listaDeTreinos;
		this.turno = turno;
		this.estatos = estatos;
	}

}
