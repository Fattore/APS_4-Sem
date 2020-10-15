package Principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import utility.Arquivo;

public class Executar {
    
    public static void main(String[] args) {
        Arquivo arq = new Arquivo();
        
        String nomeDir = JOptionPane.showInputDialog("Digite o diretório do arquivo\nExemplo:\nC:\\Program Files");
        String nomeArq = JOptionPane.showInputDialog("Digite o nome do arquivo\nExemplo:\nTeste.txt");
        
        int[] valor = arq.ler(nomeDir,nomeArq);
        
        quickSort(valor[0], 0, valor);
        System.out.println(Arrays.toString(valor));
        
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
        trocar(vetor, esquerdo, j);
        return j;
    }

    private static void trocar(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;        
        
    }
}

