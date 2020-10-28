package heapsort;

import java.util.List;


public class HEAPSORT {


  public static void heapsort(List<Integer> lista) {
  for (int i = lista.size() / 2 - 1; i >= 0; i--) {
			maxHeapify(lista, i, lista.size());
		}
		int tamanho = lista.size();
		for (int i = lista.size() - 1; i > 0; i--) {
			troca(lista, i, 0);
			maxHeapify(lista, 0, --tamanho);
		}
		//for (int i = 0; i < lista.length; i++) {
			//System.out.print(lista[i]+" ");
		//}
	}

	private static void maxHeapify(List<Integer> lista, int pai, int tamanho) {
		int noEsq = 2 * pai + 1, 
				noDir = noEsq + 1;
		if (noEsq < tamanho) {
			if (noDir < tamanho && lista.get(noEsq) < lista.get(noDir))
				noEsq = noDir;
			if (lista.get(noEsq) > lista.get(pai)) {
				troca(lista, noEsq, pai);
				maxHeapify(lista, noEsq, tamanho);
			}
		}
	}

	public static void troca(List<Integer> lista, int a, int b) {
		int aux = lista.get(a);
		lista.set(a, lista.get(b));
		lista.set(b, aux);
	}
	
	private static void minHeapify(List<Integer> lista, int pai, int tamanho) {
		int noEsq = 2 * pai + 1, 
				noDir = noEsq + 1;
		if (noEsq < tamanho) {
			if (noDir < tamanho && lista.get(noEsq) > lista.get(noDir))
				noEsq = noDir;
			if (lista.get(noEsq) < lista.get(pai)) {
				troca(lista, noEsq, pai);
				minHeapify(lista, noEsq, tamanho);
			}
		}
	}
}
   
