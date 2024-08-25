package main;

import controller.OrdenacaoController;

public class Principal {
	
	public static void main(String[] args) {
		OrdenacaoController ordenacao = new OrdenacaoController();
		int[] vetor1 = {15,13,43,42,34,12,56,32,98,99,47};
		int[] vetor2 = {15,13,43,42,34,12,56,32,98,99,47};	
		
		int tamanho = vetor2.length;
		
		System.out.println("Bubble Sort");
		ordenacao.ordenacaoBubbleSort(vetor1);
		System.out.println("\n\n=========================================\n");
		System.out.println("Merge Sort");
		ordenacao.mergeSort(vetor2, 0, tamanho-1);
	}

}
