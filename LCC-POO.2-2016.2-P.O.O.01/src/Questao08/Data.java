package Questao08;

public class Data {
	private int data;
	private int mes;
	private int ano;

	public Data(int data, int mes, int ano) {

		this.data = data;
		this.mes = mes;
		this.ano = ano;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		return this.data + "/" + this.mes + "/" + this.ano;
	}

}
