package Questao05;

import java.util.ArrayList;
import java.util.List;

public class Dicionario<X, Y> {
	private List<X> l1;
	private List<Y> l2;

	public Dicionario() {
		l1 = new ArrayList<X>();
		l2 = new ArrayList<Y>();
	}

	public void add(X key, Y value) {
		l1.add(key);
		l2.add(value);
	}

	public Y getValue(X key) {
		for (int k = 0; k < l1.size(); k++) {
			if (key == l1.get(k)) {
				return l2.get(k);
			}
		}
		return null;
	}

}
