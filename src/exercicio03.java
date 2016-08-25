import java.io.File;
import javax.swing.JFileChooser;

public class exercicio03 {

	public static void main(String[] args) {

		acaoExercicio03 eUm = new acaoExercicio03();
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
