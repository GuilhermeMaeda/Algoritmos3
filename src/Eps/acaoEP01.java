package Eps;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class acaoEP01 {

	public String runExerciseOne(String path) {

		File fl = new File(path);
		String line = null;
		String[] arrayStringNumber;
		int contadorPar = 0;

		try {

			BufferedReader br = new BufferedReader(new FileReader(fl));

			line = br.readLine();
			arrayStringNumber = line.split(";");
			int[] arrayNumber = new int[arrayStringNumber.length];

			for (int i = 0; i < arrayStringNumber.length; i++) {

				arrayNumber[i] = Integer.parseInt(arrayStringNumber[i]);

			}

			// insira aqui o seu código para responder este problema.
			// passe como paramentro o arranjo arrayNumber

			for (int i = 0; i < arrayNumber.length; i++) {

				if (arrayNumber[i] % 2 == 0) {

					contadorPar++;

				}
			}

			int resultado = contadorPar * arrayStringNumber.length;
			JOptionPane.showMessageDialog(null, "O número de pares no array cujo produto é par: " + resultado);

			br.close();

		} catch (FileNotFoundException ex) {

			System.out.println("File Not found.");
			Logger.getLogger(acaoEP01.class.getName()).log(Level.SEVERE, null, ex);

		} catch (IOException ex) {

			System.out.println("Line Read Error. ");
			Logger.getLogger(acaoEP01.class.getName()).log(Level.SEVERE, null, ex);

		}

		return "Over Exercise One";

	}

}