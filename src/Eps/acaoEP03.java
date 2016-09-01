package Eps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class acaoEP03 {

	public void main(String path) {

		File fl = new File(path);
		String line = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(fl));
			File arquivo = new File("saída.txt");
			FileWriter writer = new FileWriter(arquivo);
			BufferedWriter escrever = new BufferedWriter(writer);

			String[] uniao = null;
			String[] intersec = null;
			String[] sub = null;
			String card = null;

			while (br.ready()) {

				line = br.readLine();
				line = line.replace("{", "");
				line = line.replace("}", "");

				if (line.contains("u")) {
					// insira aqui o método ou objeto que trata das uniões.

					line = line.replace("u", ", ");
					uniao = line.split(", ");

					int vetorAux[] = new int[100000000];
					int posicoes[] = new int[uniao.length];

					for (int i = 0; i < uniao.length; i++) {
						posicoes[i] = Integer.parseInt(uniao[i]);
					}

					escrever.write("União: { ");

					for (int j = 0; j < uniao.length; j++) {
						++vetorAux[posicoes[j]];

						if (vetorAux[posicoes[j]] == 1) {
							uniao[j] = Integer.toString(posicoes[j]);
							escrever.write(uniao[j] + " ");
						}

					}

					escrever.write("}");
					escrever.newLine();

				} else if (line.contains("i")) {
					// insira aqui o método ou objeto que trata das intersecções

					line = line.replace("i", ", ");
					intersec = line.split(", ");

					int vetorAux[] = new int[100000000];
					int posicoes[] = new int[intersec.length];

					for (int i = 0; i < intersec.length; i++) {
						posicoes[i] = Integer.parseInt(intersec[i]);
					}

					escrever.write("Intersecção: { ");

					for (int j = 0; j < intersec.length; j++) {
						++vetorAux[posicoes[j]];

						if (vetorAux[posicoes[j]] == 2) {
							intersec[j] = Integer.toString(posicoes[j]);
							escrever.write(intersec[j] + " ");
						}

					}

					escrever.write("}");
					escrever.newLine();

				} else if (line.contains("s")) {
					// insira aqui o método ou objeto que trata das subtrações

					line = line.replace("s", ", ");
					sub = line.split(", ");

					escrever.write("Subtração: ");
					
					for (int i = 0; i < sub.length; i++) {

					}

					escrever.newLine();

				} else if (!line.contains("u") && !line.contains("i") && !line.contains("s")) {
					// insira aqui o método ou objeto que trata da cardinalidade

					escrever.write("Cardinalidade: ");

					String[] cardinalidade = line.split(",");

					card = Integer.toString(cardinalidade.length);
					escrever.write(card);

					escrever.newLine();

				}

			}

			escrever.close();
			br.close();

		} catch (FileNotFoundException ex) {
			Logger.getLogger(acao.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(acao.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}

