//Aluno: João Paulo Nunes Marques, Ciencia da Computação 4º Semestre

//retornar a quantidade de numeros pares que foi encontrado ao multiplicar o vetor

public class exercicio02 {

	static int[] vetor;
	static int contador;

	public static void main(String[] args) {

		// altere o valor do parametro como lhe agrada

		populandoVetor(100);

		calculandoPares();

	}

	// função para preencher a matriz de 0 a x (numero do parametro)
	public static void populandoVetor(int x) {

		vetor = new int[x];

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = i;

		}

	}

	// função que corre o vetor multiplicando numero por numero
	// ignorando a volta na leitura da matriz evitando por exemplo 1 x 2 e 2 x 1
	public static void calculandoPares() {

		for (int i = 0; i < vetor.length; i++) {

			for (int j = i; j < vetor.length; j++) {

				int result = i * j;

				if (result % 2 == 0 && result != 0) {

					contador++;

				}

			}

		}

		// Imprimindo a quantidade de resultado pares
		System.out.println("Existe " + contador + " numeros pares entre os produtos");

	}

}
