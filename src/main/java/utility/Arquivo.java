package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {   
    
    public static int[] ler(String nomeDir, String nomeArq) {
        
        File dir = new File(nomeDir);    
        File arq = new File(dir, nomeArq);
        //List lista = new ArrayList();
        
        //Criamos um vetor para armazenar as linhas dentro do arquivo
        int[] valorInt = new int[0];
        
        try {
            //Indicamos o arquivo que será lido
            FileReader fr = new FileReader(arq);

            //Criamos o objeto bufferReader que nos
            // oferece o método de leitura readLine()
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arq)));
            //BufferedReader br = new BufferedReader(fr);

            //String que irá receber cada linha do arquivo
            String linha = "";
            
            //Fazemos um loop linha a linha no arquivo,
            // enquanto ele seja diferente de null.
            //O método readLine() devolve a linha na
            // posicao do loop para a variavel linha.
            while ( ( linha = br.readLine() ) != null) {
                //Aqui adicionamos as linhas em um vetor
                //lista.add(linha);
		valorInt = new int[Integer.parseInt(linha)];		
                //System.out.println(linha);
            }
            //liberamos o fluxo dos objetos ou fechamos o arquivo
            fr.close();
            br.close();
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        //getVetor(valorInt);
        return valorInt;
    }
}