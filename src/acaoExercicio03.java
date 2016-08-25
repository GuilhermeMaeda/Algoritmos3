import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class acaoExercicio03 {

	public String runExerciseOne(String path) {

		Scanner in = new Scanner(System.in);
		File fl = new File(path);
		String line = null;
		String[] arrayStringNumber;

		try {

			BufferedReader br = new BufferedReader(new FileReader(fl));

			line = br.readLine();
			// igualando a leitura ao arrayStringNumber e separando posições por
			// ;
			arrayStringNumber = line.split(" ");
			// criando array do tamanho das posições encontradas no
			// arrayStringNumber
			int[] arrayNumber = new int[arrayStringNumber.length];

			// jogando valores nas determinadas posições (populando arrayNumber)
			for (int i = 0; i < arrayStringNumber.length; i++) {

				arrayNumber[i] = Integer.parseInt(arrayStringNumber[i]);

			}

			//Resolvendo questão: soliciatando coordenada e imprimindo valores equivalentes
			System.out.println("Insira a coordenada, existem " + "0" + " Linhas e " + (arrayNumber.length - 1) + " Posições");
			System.out.println("Linha: ");
			int linha = in.nextInt();
			System.out.println("Posição: ");
			int posicao = in.nextInt();

			if (posicao < arrayNumber.length) {
				System.out.println("\n O valor da coordenada é: " + arrayNumber[posicao]);
			} else {
				System.out.println("\n O valor da coordenada é: -1");
			}

			br.close();

		} catch (FileNotFoundException ex) {

			System.out.println("File Not found.");
			Logger.getLogger(acaoExercicio03.class.getName()).log(Level.SEVERE, null, ex);

		} catch (IOException ex) {

			System.out.println("Line Read Error. ");
			Logger.getLogger(acaoExercicio03.class.getName()).log(Level.SEVERE, null, ex);

		}

		in.close();

		return "Over Exercise One";

	}

}
