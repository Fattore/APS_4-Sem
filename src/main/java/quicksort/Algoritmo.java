package quicksort;

public class Algoritmo {
    
    public static void quickSort(int[] vetor, int esquerdo, int direito) {
        if(esquerdo < direito) {
            int pivo = separar(vetor, esquerdo, direito);
            quickSort(vetor, esquerdo, pivo - 1);
            quickSort(vetor, pivo + 1, direito);
        }
    }

    private static int separar(int[] vetor, int esquerdo, int direito) {
        int i = esquerdo + 1;
        int j = direito;
        int pivo = vetor[esquerdo];
        
        while (i <= j) {
            if(vetor[i] <= pivo) {
                i++;
            } else if(vetor[j] > pivo) {
                j--;
            } else if(i <= j) {
                trocar(vetor, i, j);
                i++;
                j--;
            }
        }
        trocar(vetor, esquerdo, j);
        return j;
    }

    private static void trocar(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;           
    }
}
