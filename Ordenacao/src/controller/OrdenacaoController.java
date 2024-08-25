package controller;

import br.edu.fateczl.sort.*;


public class OrdenacaoController {

	public OrdenacaoController() {
		super();
	}
	
	public void ordenacaoBubbleSort(int[] vetor) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] vetorSort = bubbleSort.bubbleSort(vetor);
		for(int i : vetorSort) {
			System.out.print(i + " ");
		}
	}
	
	public void mergeSort(int[] vetor, int i, int f) {
		MergeSort mergeSort = new MergeSort();		
		int[] vetorSort = mergeSort.ordenacaoMergeSort(vetor, i, f);
		for(int x : vetorSort) {
			System.out.print(x + " ");
		}
	}
	
}
