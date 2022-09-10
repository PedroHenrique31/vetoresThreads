package vetoresThreads;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Autor: Pedro Henrique Carneiro de Ara�jo RA:22108287
 * Este projeto � uma implementa��o para aprender o uso de threads em java, nele
 * faremos:
 * 		1-Definir um array de 10 posi��es;
 * 		2-Calcular m�dia,maximo,minimo e ordenar o vetor;
 * 		3-Executar cada opera��o em uma thread;
 * 		4-Utilizar forma por delega��o e por heran�a.
 * */

public class PrincipalClasse {
	private static final int TAMANHO=10;

	public static void main(String[] args) {
		int[] numeros= {2,3,9,5,7,63,56,98,9,1};
		int[] numerosOrdenados=new int[TAMANHO];
		
		// Printa na tela os numeros.
		System.out.println("numeros: ");
		for(int num: numeros) {
			System.out.print(num+" ");
		}
		//Processa os numeros calculando m�dia,maximo,minimo
		int mediaNumeros=media(numeros),menor=min(numeros),maior=max(numeros);
		System.out.print("\n"+"M�dia: "+mediaNumeros);
		System.out.print(" "+"Maior: "+maior);
		System.out.print(" "+"Menor: "+menor);
		
		//Printa na tela os numeros ordenados
		numerosOrdenados=ordena(numeros);
		System.out.println("\n"+"numeros ordenados: ");
		for(int num: numerosOrdenados) {
			System.out.print(num+" ");
		}

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
		ArrayList<Integer> lista=new ArrayList(TAMANHO);
		Integer numero=0; // um wrapper de int pra poderusar em ArrayList.
		/*
		 * Algum codigo vai aqui para ordenar o vetor
		 * Tentarei passar o vetor para um Array e usar o sort
		 * Ent�o passarei o Array para resposta
		 * */
		for (int i=0;i<TAMANHO;i++) {
			numero=numeros[i];
			lista.add(numero);
		}
		Collections.sort(lista);
	
		for (int i=0;i<TAMANHO;i++) {
			resposta[i]=lista.get(i);
		}
		return resposta;
		
	} //FIM ORDENA
}
