
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class acaoExercicio01 {

	// ação runExerciseOne (que é chamada no Main)
	public String runExerciseOne(String path) {

		// declarando variaveis
		File fl = new File(path);
		String line = null;

		try {
			// leiura do arquivo fl
			BufferedReader br = new BufferedReader(new FileReader(fl));
			line = br.readLine();

			// devolvendo outro arquivo "minhaSaida" com valores lidos do "testeEp1"
			File arquivo = new File("minhaSaida.txt");
			FileWriter writer = new FileWriter(arquivo);
			BufferedWriter escrever = new BufferedWriter(writer);

			escrever.write(line);

			escrever.close();
			br.close();

		} catch (FileNotFoundException ex) {

			System.out.println("File Not found.");
			Logger.getLogger(acaoExercicio01.class.getName()).log(Level.SEVERE, null, ex);

		} catch (IOException ex) {

			System.out.println("Line Read Error. ");
			Logger.getLogger(acaoExercicio01.class.getName()).log(Level.SEVERE, null, ex);

		}

		return "Over Exercise One";

	}

}
