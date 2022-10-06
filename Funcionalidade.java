package vetoresThreads;

/**
 * 	Classe abstrata Funcionalidade, herda de threads.
 * Possui um vetor de dados para trabalhar, cada funcionalidade herdará desta.
 * */
public abstract class Funcionalidade extends Thread {
	protected int[] vetor;
	public Funcionalidade(int[] numeros,int tamanho) {
		vetor= new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			vetor[i]=numeros[i];
		}
	}
	
}
