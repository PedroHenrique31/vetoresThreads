package vetoresThreads;
/**
 * Autor: Pedro Henrique Carneiro de Araújo RA:22108287
 * Este projeto é uma implementação para aprender o uso de threads em java, nele
 * faremos:
 * 		1-Definir um array de 10 posições;
 * 		2-Calcular média,maximo,minimo e ordenar o vetor;
 * 		3-Executar cada operação em uma thread;
 * 		4-Utilizar forma por delegação e por herança.
 * */

public class PrincipalClasse {

	public static void main(String[] args) {
		int[] numeros= {2,3,9,5,7,63,56,98,9,1};
		
		System.out.println("numeros: ");
		for(int num: numeros) {
			System.out.print(num+" ");
		}

	}
	int media(int[] numeros) {
		return 0;
	}
	int min(int[] numeros) {
		return 0;
	}
	int max(int[] numeros) {
		return 0;
	}
}
