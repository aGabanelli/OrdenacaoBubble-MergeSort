package main;

import controller.OrdenacaoController;

public class Principal {

	public static void main(String[] args) {
		
		OrdenacaoController ordenacao = new OrdenacaoController();
		
		int[] vetorEx01 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetorEx02 = {44, 43, 42, 41, 40, 39, 38};
		int[] vetorEx03 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
		
		int tamanhoex01 = vetorEx01.length;
		int tamanhoex02 = vetorEx02.length;
		int tamanhoex03 = vetorEx03.length;
		
		System.out.println("Exercício 1:");
		System.out.println("Bubble Sort:");
		ordenacao.ordenacaoBubbleSort(vetorEx01);		
		System.out.println("\n");
		System.out.println("Merge Sort:");
		ordenacao.mergeSort(vetorEx01, 0, tamanhoex01-1);
		System.out.println("\n\n================================================\n");

		System.out.println("Exercício 2:");
		System.out.println("Bubble Sort:");
		ordenacao.ordenacaoBubbleSort(vetorEx02);		
		System.out.println("\n");
		System.out.println("Merge Sort:");
		ordenacao.mergeSort(vetorEx02, 0, tamanhoex02-1);
		System.out.println("\n\n================================================\n");
		
		System.out.println("Exercício 3:");
		System.out.println("Bubble Sort:");
		ordenacao.ordenacaoBubbleSort(vetorEx03);		
		System.out.println("\n");
		System.out.println("Merge Sort:");
		ordenacao.mergeSort(vetorEx03, 0, tamanhoex03-1);
		System.out.println("\n\n================================================\n");
		
	}
	
}
