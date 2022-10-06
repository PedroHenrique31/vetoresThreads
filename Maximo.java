package vetoresThreads;

public class Maximo extends Funcionalidade{
	public Maximo(int[] numeros,int tamanho) {
		super(numeros,tamanho);
		this.nome="Thread Máximo";
		start();
	}
	public void run() {
		int maior;
		maior=PrincipalClasse.max(vetor);
		System.out.println(this.nome+" diz que o maior numero é: "+maior);
	}
}
