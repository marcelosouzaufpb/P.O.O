package AreaCalculada;

public class TestaArea {

	public static void main(String[] args) {

		AreaCalculavel[] area = new AreaCalculavel[] { new Quadrado(), new Retangulo(), new Circulo() };

		for (int k = 0; k < area.length; k++) {
			System.out.println("- " + area[k]);
			System.out.println("Area total = " + area[k].calculaArea() + "\n");
		}

	}

}
