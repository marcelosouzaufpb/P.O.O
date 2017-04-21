package artigotdd.calculadora.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Log {

	private BufferedWriter bw;

	public void criaLog1(String nomeDaPessoa) throws IOException {
		File f = new File(nomeDaPessoa);
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		bw = new BufferedWriter(pw);
		bw.write(nomeDaPessoa);
		bw.newLine();
	}

	public void criaLog(String nomeDaPessoa) {

	}
}
