package Questao03;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Poligono {
	protected ArrayList<Ponto> poli;

	public Poligono(ArrayList<Ponto> poli) {
		this.poli = new ArrayList<Ponto>();
	}

	public Poligono() {
		this.poli = new ArrayList<Ponto>();
	}

	public void add(Ponto p) throws ElementoJaExisteException {
		for (Ponto q : this.poli) {
			if (q.equals(p)) {
				throw new ElementoJaExisteException("Essa cordenada ja foi cadastrada !!!");
			}
		}
		poli.add(p);
	}

	public boolean remove(Ponto p) {
		for (Ponto q : this.poli) {
			if (q.equals(p)) {
				poli.remove(p);
				return true;

			}
		}
		return false;
	}

	public ArrayList<Ponto> getPoli() {
		return this.poli;
	}

	public String toString() {
		String pontos = "";
		for (int k = 0; k < poli.size(); k++) {
			pontos += poli.get(k).toString() + "\n";
		}
		return pontos;
	}

	public double are() {
		double soma = 0.0;
		for (int k = 0; k < this.poli.size() - 1; k++) {
			soma += (poli.get(k + 1).getY() * poli.get(k).getY()) - (poli.get(k + 1).getX() * poli.get(k).getY());
		}
		return soma / 2;
	}

}
