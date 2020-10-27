package Principal;

import quicksort.Algoritmo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import utility.*;
import mergesort.Merge;

public class Executar {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
      //Arquivo arq = new Arquivo();
        Algoritmo alg = new Algoritmo();
        Message msg = new Message();
        Merge merge = new Merge();
        
        List<Integer> valores = new ArrayList<Integer>();
        int i;
        
        String opcao_alg = JOptionPane.showInputDialog("Qual algoritmo de ordenação deseja executar?\n1 - QuickSort\n2 - MergeSort\n3 - HeapSort");
        switch (opcao_alg) {
            case "1":
                    String opcao_qck = JOptionPane.showInputDialog("Qual arquivo deseja executar?\n1 - 1000 números\n2 - 5000 números\n3 - 10000 números");
                    if(opcao_qck.equals("1")) {
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\1000_numbers.txt";
                        
                        BufferedReader br_qck1 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_qck1.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                        
                        int []valor = new int[valores.size()+1];

                        for (i = 0; i <= 9999; i++) {
                            valor[i] = valores.get(i);
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }

                        alg.quickSort(valor, 0, valor.length - 1);
                        
                        System.exit(0);
                    } else if(opcao_qck == "2") {
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\5000_numbers.txt";
                        
                        BufferedReader br_qck2 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_qck2.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                        
                        int []valor = new int[valores.size()+1];

                        for (i = 0; i <= 9999; i++) {
                            valor[i] = valores.get(i);
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }

                        alg.quickSort(valor, 0, valor.length - 1);
                        
                        System.exit(0);
                    } else if(opcao_qck == "3"){
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\10000_numbers.txt";
                        
                        BufferedReader br_qck3 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_qck3.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                        
                        int []valor = new int[valores.size()+1];

                        for (i = 0; i <= 9999; i++) {
                            valor[i] = valores.get(i);
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }

                        alg.quickSort(valor, 0, valor.length - 1);
                        
                        System.exit(0);
                    } else {
                        msg.showErrorMessage();
                        System.exit(0);
                    }
                break;
            case "2":
                    String opcao_mrg = JOptionPane.showInputDialog("Qual arquivo deseja executar?\n1 - 1000 números\n2 - 5000 números\n3 - 10000 números");
                    if(opcao_mrg == "1") {
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\1000_numbers.txt";
                        
                        BufferedReader br_mrg1 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_mrg1.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }

                        merge.merge(valores, 0, 9999);
                        for (i = 0; i <= 9999; i++) {
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }
                        
                        System.exit(0);
                    } else if(opcao_mrg == "2") {
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\5000_numbers.txt";
                        
                        BufferedReader br_mrg2 = new BufferedReader(new FileReader(arquivo));

                        String numeros;
                        while ((numeros = br_mrg2.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                       
                        merge.merge(valores, 0, 9999);
                        for (i = 0; i <= 9999; i++) {
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }
                        
                        System.exit(0);
                    } else if(opcao_mrg == "3"){
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\10000_numbers.txt";
                        
                        BufferedReader br_mrg3 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_mrg3.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                        
                        merge.merge(valores, 0, 9999);
                        for (i = 0; i <= 9999; i++) {
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }
                        
                        System.exit(0);
                    } else {
                        msg.showErrorMessage();
                        System.exit(0);
                    }
                break;
            case "3":
                    String opcao_hep = JOptionPane.showInputDialog("Qual arquivo deseja executar?\n1 - 1000 números\n2 - 5000 números\n3 - 10000 números");
                    if(opcao_hep == "1") {
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\1000_numbers.txt";
                        
                        BufferedReader br_hep1 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_hep1.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                        
                        int []valor = new int[valores.size()];

                        for (i = 0; i <= 9999; i++) {
                            valor[i] = valores.get(i);
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }

                        alg.quickSort(valor, 0, valor.length - 1);
                        
                        System.exit(0);
                    } else if(opcao_hep == "2") {
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\5000_numbers.txt";
                        
                        BufferedReader br_hep2 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_hep2.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                        
                        int []valor = new int[valores.size()];

                        for (i = 0; i <= 9999; i++) {
                            valor[i] = valores.get(i);
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }

                        alg.quickSort(valor, 0, valor.length - 1);
                        
                        System.exit(0);
                    } else if(opcao_hep == "3"){
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\10000_numbers.txt";
                        
                        BufferedReader br_hep3 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_hep3.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                        
                        int []valor = new int[valores.size()];

                        for (i = 0; i <= 9999; i++) {
                            valor[i] = valores.get(i);
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }

                        alg.quickSort(valor, 0, valor.length - 1);
                        
                        System.exit(0);
                    } else {
                        msg.showErrorMessage();
                        System.exit(0);
                    }
                break;
            default:
                msg.showErrorMessage();
                System.exit(0);
        }
    }
}

