package Questao01;

public class App {

	public static void main(String[] args) {
		Par<String, Double> a1 = new Par<String, Double>("Joao", 5.0);
		Par<Integer, String> a2 = new Par<Integer, String>(010101, "Joao");
		Par<Float, Float> a3 = new Par<Float, Float>(2.0f, 3.0f);
		System.out.println(a1.toString() + "\n" + a2.toString() + "\n" + a3.toString());

	}

}
