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
	private static final int TAMANHO=10;

	public static void main(String[] args) {
		int[] numeros= {2,3,9,5,7,63,56,98,9,1};
		int[] numerosOrdenados=new int[TAMANHO];
		
		System.out.println("numeros: ");
		for(int num: numeros) {
			System.out.print(num+" ");
		}
		int mediaNumeros=media(numeros),menor=min(numeros),maior=max(numeros);
		System.out.print("\n"+"Média: "+mediaNumeros);
		System.out.print(" "+"Maior: "+maior);
		System.out.print(" "+"Menor: "+menor);

	}
	static int media(int[] numeros) {
		int soma=0,media=0,tamanho=1;
		//tamanho=numeros.length();
		for (int num:numeros) {
			soma=soma+num;
			tamanho++;
		}
		media=soma/tamanho;
		return media;
	}
	static int min(int[] numeros) {
		int minimo=numeros[0];
		for (int i : numeros) {
			if(i<minimo) {
				minimo=i;
			}
		}
		return minimo;
	}
	static int max(int[] numeros) {
		int maximo=numeros[0];
		for (int i : numeros) {
			if(i>maximo)
				maximo=i;
		}
		return maximo;
	}
	static int[] ordena(int[] numeros) {
		int [] resposta=new int[TAMANHO];
		
		/*
		 * Algum codigo vai aqui para ordenar o vetor
		 * */
		for (int i=0;i<=TAMANHO;i++) {
			resposta[i]=numeros[i];
		}
		return resposta;
		
	} //FIM ORDENA
}
