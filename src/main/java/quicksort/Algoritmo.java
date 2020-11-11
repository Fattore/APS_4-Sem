package quicksort;

import java.util.List;

public class Algoritmo {
    
    public static void quickSort(List<Integer> lista, int esquerdo, int direito) {
        if(esquerdo < direito) {
            int pivo = separar(lista, esquerdo, direito);
            quickSort(lista, esquerdo, pivo - 1);
            quickSort(lista, pivo + 1, direito);
        }
    }

    private static int separar(List<Integer> lista, int esquerdo, int direito) {
        int i = esquerdo + 1;
        int j = direito;
        int pivo = lista.get(esquerdo);
        
        while (i <= j) {
            if(lista.get(i) <= pivo) {
                i++;
            } else if(lista.get(j) > pivo) {
                j--;
            } else if(i <= j) {
                trocar(lista, i, j);
                i++;
                j--;
            }
        }
        trocar(lista, esquerdo, j);
        return j;
    }

    private static void trocar(List<Integer> lista, int i, int j) {
        int aux = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, aux);           
    }
}
