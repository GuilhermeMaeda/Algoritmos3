package Eps;

import java.io.File;
import javax.swing.JFileChooser;

public class EP03 {

	public static void main(String[] args) {
		// chamando a class acaoExercicio01
		acao eUm = new acao();
		// chama a fun��o, pega o file desejado, e chama na class runExerciseOne
		eUm.main(getPathFile());

	}

	// fun��o criando a��o para escolher o file que sera utilizado como
	// parametro na classe acaoExercicio01
	public static final String getPathFile() {

		final JFileChooser fc = new JFileChooser();
		int returnValue = fc.showOpenDialog(null);

		// selecionar o arquivo e abrir
		if (returnValue == JFileChooser.APPROVE_OPTION) {

			File seleFile = fc.getSelectedFile();
			return seleFile.getAbsolutePath();

			// Criei um else para n�o aparecer erro caso eu fa�a algo
			// sem ser escolher um arquivo (por exemplo: fechar no X, apertar
			// cancelar)

		} else {

			System.exit(0);

		}

		return null;

	}

}
