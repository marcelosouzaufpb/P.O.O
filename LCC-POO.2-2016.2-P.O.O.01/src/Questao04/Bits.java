package Questao04;

import java.util.Arrays;

public class Bits {
	protected boolean bits[];
	protected boolean bit;

	public Bits(int tamanho) {
		this.bits = new boolean[tamanho];
		this.bit = false;
	}

	public boolean[] getBits() {
		return bits;
	}

	public void setBits(boolean[] bits) {
		this.bits = bits;
	}

	public boolean isBit() {
		return bit;
	}

	public void setBit(boolean bit) {
		this.bit = bit;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Bits) {
			Bits b = (Bits) obj;
			if (Arrays.equals(bits, b.bits)) {
				return true;
			}
		}
		return false;
	}

	public Bits and(boolean[] o, boolean[] b) throws TamanhosDiferentesException {
		if (o.length != b.length) {
			throw new TamanhosDiferentesException("Os tamanhos sao diferentes !!!");
		}
		Bits and = new Bits(o.length);
		for (int k = 0; k < o.length; k++) {
			if ((o.equals(true) && (b.equals(true)))) {
				and.bits[k] = true;
			} else {
				and.bits[k] = false;
			}
		}
		return and;

	}

	public Bits or(boolean[] o, boolean[] b) throws TamanhosDiferentesException {
		if (o.length != b.length) {
			throw new TamanhosDiferentesException("Os tamanhos sao diferentes !!!");
		}
		Bits or = new Bits(o.length);
		for (int k = 0; k < o.length; k++) {
			if ((o.equals(false) && (o.equals(false)))) {
				or.bits[k] = false;
			} else {
				or.bits[k] = true;
			}
		}
		return or;
	}

	public Bits not(boolean[] o) {
		Bits not = new Bits(o.length);
		for (int k = 0; k < o.length; k++) {
			if (o[k] == false) {
				not.bits[k] = true;
			} else {
				not.bits[k] = false;
			}
		}
		return not;
	}

	public String toString() {
		String bit = "";
		for (int k = 0; k < this.bits.length; k++) {
			if (this.bits[k] == false) {
				bit += "0";
			} else {
				bit += "1";
			}
		}
		return "(" + bit + ")";
	}

}
