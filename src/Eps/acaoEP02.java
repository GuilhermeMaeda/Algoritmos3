package Eps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class acaoEP02 {

	public String runExerciseOne(String path) {

		Scanner in = new Scanner(System.in);
		File fl = new File(path);
		String[][] cordenada = new String[100000][100];
		String[] arrayStringNumber = null;
		int qntLinha = 0;

		try {

			BufferedReader br = new BufferedReader(new FileReader(fl));

			String contandoLinha = null;

			while ((contandoLinha = br.readLine()) != null) {

				arrayStringNumber = contandoLinha.split(" ");

				for (int i = 0; i < arrayStringNumber.length; i++) {

					cordenada[qntLinha][i] = Integer.parseInt(arrayStringNumber[i];

				}

				qntLinha++;

			}

			// Resolvendo questão: soliciatando coordenada e imprimindo valores
			// equivalentes
			System.out.println("Linha: ");
			int linha = in.nextInt();
			System.out.println("Posição: ");
			int posicao = in.nextInt();

			if (linha <= cordenada.length && posicao <= cordenada.length) {

				if (cordenada[linha][posicao] != null) {
					System.out.println("O valor da coordenada é: " + cordenada[linha][posicao]);
				} else {
					System.out.println("O valor da coordenada é: -1");

				}

			}

			br.close();

		} catch (FileNotFoundException ex) {

			System.out.println("File Not found.");
			Logger.getLogger(acaoEP02.class.getName()).log(Level.SEVERE, null, ex);

		} catch (IOException ex) {

			System.out.println("Line Read Error. ");
			Logger.getLogger(acaoEP02.class.getName()).log(Level.SEVERE, null, ex);

		}

		in.close();

		return "Over Exercise One";

	}

}