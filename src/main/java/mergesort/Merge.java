package mergesort;

import java.util.List;

public class Merge {
    public static void merge(List<Integer> X, int inicio, int fim){
        int meio;
        if(inicio < fim){
            meio=(inicio + fim)/2;
            merge(X, inicio, meio);
            merge(X,meio+1,fim);
            Intercala.intercala(X, inicio, fim, meio);
        }

    }
}
