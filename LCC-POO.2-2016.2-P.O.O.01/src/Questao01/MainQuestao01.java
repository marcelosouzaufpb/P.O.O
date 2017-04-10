package Questao01;

public class MainQuestao01 {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(1, 2);
		Retangulo r2 = new Retangulo(2, 3);

		r1.perimetro();
		r2.perimetro();
		r1.area();
		r2.area();

		System.out.println(r1.toString() + "\n\n" + r2.toString());

	}

}
