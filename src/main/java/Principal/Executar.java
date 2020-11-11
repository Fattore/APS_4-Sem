package Principal;

import quicksort.Algoritmo;
import mergesort.Merge;
import heapsort.HEAPSORT;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import utility.*;

public class Executar {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Algoritmo alg = new Algoritmo();
        Merge merge = new Merge();
        HEAPSORT heapsort = new HEAPSORT();
        Message msg = new Message();

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

                        long tempoInicial = System.currentTimeMillis();                       

                        alg.quickSort(valores, 0, 999);
                        
                        long tempoFinal = System.currentTimeMillis();


                        for (i = 0; i <= 999; i++) {
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }                        

                        System.out.println("o metodo executou em: " + (tempoFinal - tempoInicial)/ 1000d+ "s");                       
                        System.exit(0);
                    } else if(opcao_qck.equals("2")) {
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\5000_numbers.txt";
                        
                        BufferedReader br_qck2 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_qck2.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                        
                       long tempoInicial = System.currentTimeMillis();                       

                        alg.quickSort(valores, 0, 4999);
                        
                        long tempoFinal = System.currentTimeMillis();


                        for (i = 0; i <= 4999; i++) {
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }  

                        System.out.println("o metodo executou em: " + (tempoFinal - tempoInicial)/ 1000d + "s");                        
                        System.exit(0);
                    } else if(opcao_qck.equals("3")){
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\10000_numbers.txt";
                        
                        BufferedReader br_qck3 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_qck3.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                        
                       long tempoInicial = System.currentTimeMillis();                       

                        alg.quickSort(valores, 0, 9999);
                        
                        long tempoFinal = System.currentTimeMillis();


                        for (i = 0; i <= 9999; i++) {
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }  

                        System.out.println("o metodo executou em: " + (tempoFinal - tempoInicial)/ 1000d + "s");                        
                        System.exit(0); 
                    } else {
                        msg.showErrorMessage();
                        System.exit(0);
                    }
                break;
            case "2":
                    String opcao_mrg = JOptionPane.showInputDialog("Qual arquivo deseja executar?\n1 - 1000 números\n2 - 5000 números\n3 - 10000 números");
                    if(opcao_mrg.equals("1")) {
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\1000_numbers.txt";
                        
                        BufferedReader br_mrg1 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_mrg1.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }

                        long tempoInicial = System.currentTimeMillis();                       

                        merge.merge(valores, 0, 999);
                        
                        long tempoFinal = System.currentTimeMillis();


                        for (i = 0; i <= 999; i++) {
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }

                        System.out.println("o metodo executou em: " + (tempoFinal - tempoInicial)/ 1000d + "s");                        
                        System.exit(0);
                    } else if(opcao_mrg.equals("2")) {
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\5000_numbers.txt";
                        
                        BufferedReader br_mrg2 = new BufferedReader(new FileReader(arquivo));

                        String numeros;
                        while ((numeros = br_mrg2.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                       
                        long tempoInicial = System.currentTimeMillis();                       

                        merge.merge(valores, 0, 4999);
                        
                        long tempoFinal = System.currentTimeMillis();


                        for (i = 0; i <= 4999; i++) {
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }

                        System.out.println("o metodo executou em: " + (tempoFinal - tempoInicial)/ 1000d + "s");                        
                        System.exit(0);
                    } else if(opcao_mrg.equals("3")){
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\10000_numbers.txt";
                        
                        BufferedReader br_mrg3 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_mrg3.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                        
                        long tempoInicial = System.currentTimeMillis();                       

                        merge.merge(valores, 0, 9999);
                        
                        long tempoFinal = System.currentTimeMillis();


                        for (i = 0; i <= 9999; i++) {
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }

                        System.out.println("o metodo executou em: " + (tempoFinal - tempoInicial)/ 1000d + "s");                        
                        System.exit(0);
                    } else {
                        msg.showErrorMessage();
                        System.exit(0);
                    }
                break;
            case "3":
                    String opcao_hep = JOptionPane.showInputDialog("Qual arquivo deseja executar?\n1 - 1000 números\n2 - 5000 números\n3 - 10000 números");
                    if(opcao_hep.equals("1")) {
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\1000_numbers.txt";
                        
                        BufferedReader br_hep1 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_hep1.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }  
                        
                        long tempoInicial = System.currentTimeMillis();                       

                        heapsort.heapsort(valores);
                        
                        long tempoFinal = System.currentTimeMillis();


                        for (i = 0; i <= 999; i++) {
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        } 

                        System.out.println("o metodo executou em: " + (tempoFinal - tempoInicial)/ 1000d + "s");                        
                        System.exit(0);
                    } else if(opcao_hep.equals("2")) {
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\5000_numbers.txt";
                        
                        BufferedReader br_hep2 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_hep2.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                        
                        long tempoInicial = System.currentTimeMillis();                       

                        heapsort.heapsort(valores);
                        
                        long tempoFinal = System.currentTimeMillis();


                        for (i = 0; i <= 4999; i++) {
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        } 

                        System.out.println("o metodo executou em: " + (tempoFinal - tempoInicial)/ 1000d + "s");                        
                        System.exit(0);
                    } else if(opcao_hep.equals("3")){
                        String arquivo = "D:\\Faculdades\\4ªSemestre\\APS\\10000_numbers.txt";
                        
                        BufferedReader br_hep3 = new BufferedReader(new FileReader(arquivo));
                        
                        String numeros;
                        while ((numeros = br_hep3.readLine()) != null) {
                            int converted = Integer.parseInt(numeros);
                            valores.add(converted);
                        }
                        
                        long tempoInicial = System.currentTimeMillis();                       

                        heapsort.heapsort(valores);
                        
                        long tempoFinal = System.currentTimeMillis();

                        for (i = 0; i <= 9999; i++) {
                            System.out.println((i + 1) + "º numero: " + valores.get(i));
                        }                      
                        
                        System.out.println("o metodo executou em: " + (tempoFinal - tempoInicial)/ 1000d + "s");                        
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

