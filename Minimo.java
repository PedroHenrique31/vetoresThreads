package vetoresThreads;

public class Minimo extends Funcionalidade{
	public Minimo(int[] numeros,int tamanho) {
		super(numeros,tamanho);
		this.nome="Thread Mínimo";
		start();
	}
	public void run() {
		int menor;
		menor=PrincipalClasse.min(vetor);
		System.out.println(this.nome+" calcula menor valor igual a "+menor);
	}
}
