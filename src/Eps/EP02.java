package Eps;

import java.io.File;
import javax.swing.JFileChooser;

public class EP02 {

	public static void main(String[] args) {

		acaoEP02 eUm = new acaoEP02();
		eUm.runExerciseOne(getPathFile());

	}

	public static final String getPathFile() {

		final JFileChooser fc = new JFileChooser();
		int returnValue = fc.showOpenDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {

			File seleFile = fc.getSelectedFile();
			return seleFile.getAbsolutePath();

		} else {

			System.exit(0);

		}

		return null;

	}

}
