package vetoresThreads;

public class Media extends Funcionalidade {
	public Media(int[] numeros,int tamanho) {
		super(numeros,tamanho);
		this.nome="Thread m�dia";
		start();
	}
	public void run() {
		int menor;
		menor=PrincipalClasse.media(vetor);
		System.out.println(this.nome+" calcula m�dia igual a "+menor);
	}
}
