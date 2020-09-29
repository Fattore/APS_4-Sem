package Principal;

public class Executar {
    
    public static void main(String[] args) {
        int[] valor = {3,6,7,1,134,5,4,134,6,5,247,2457,21,47,24,67,7527247,247,289,28,24,56};
        quickSort(valor, 0, valor.lenght-1);
        
    }
    
    public static void quickSort(int esquerdo, int direito, int[] vetor) {
        if(esquerdo < direito){
            
            int pivo = separar(vetor, esquerdo, direito);
            quickSort(vetor, esquerdo, pivo-1);
            quickSort(vetor, pivo+1, direito);
        }
        
    }

    private static int separar(int[] vetor, int esquerdo, int direito) {
        int i = esquerdo+1;
        int j = direito;
        int pivo = vetor[esquerdo];
        
        while(i <= j){
            if(vetor[i] <= pivo){
                i++;
            } else if(vetor[j] > pivo){
                j--;
            } else if(i <= j){
                trocar(vetor, i, j);
                i++;
                j--;
            }
            
        }
        return 0;
    }

    private static void trocar(int[] vetor, int i, int j) {
        ahsfhshstrhtrhywstrhsrthy
    }
}

