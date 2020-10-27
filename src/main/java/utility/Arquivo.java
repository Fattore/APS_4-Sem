package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Arquivo {   
    
    public static List ler() throws FileNotFoundException, IOException {
        
        List<Integer> valores = new ArrayList<Integer>();
        int i;
        
        String nomeDir = JOptionPane.showInputDialog("Digite o diretório do arquivo\nExemplo:\nC:\\Program Files");
        String nomeArq = JOptionPane.showInputDialog("Digite o nome do arquivo\nExemplo:\nTeste.txt");

        BufferedReader br2 = new BufferedReader(new FileReader(nomeDir+nomeArq));
        String numeros;

        while ((numeros = br2.readLine()) != null) {
            int converted = Integer.parseInt(numeros);
            valores.add(converted);
        }
        
        return valores;
    }
}