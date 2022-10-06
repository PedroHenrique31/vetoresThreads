package vetoresThreads;

public class Ordenador extends Funcionalidade{
	private int tamanho;
	public Ordenador(int[] numeros,int tamanho) {
		super(numeros,tamanho);
		this.nome="Thread Ordena";
		this.tamanho=tamanho;
		start();
	}
	public void run() {
		int[] valorOrdenado=new int[tamanho];
		valorOrdenado=PrincipalClasse.ordena(vetor);
		System.out.println(this.nome+" ordenou os numeros da forma: ");
		for(int num: valorOrdenado) {
			System.out.print(num+" ");
		}
	}
}
