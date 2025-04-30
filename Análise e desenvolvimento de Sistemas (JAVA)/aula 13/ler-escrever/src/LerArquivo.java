import java.io.BufferedReader;//Permite ler texto em um arquivo 
import java.io.FileReader;//Abre um arquivo para leitura
import java.io.IOException; //Representa erros  de entrada/saída como falhas ao acessar o arquivo

public class LerArquivo {
    
    public static void main(String[] args) {
        
        String nomeArquivo = "saida.txt";

        try(BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo)))
        {
            String linha;

            while((linha = leitor.readLine()) != null)
            {
                System.out.println("linha lida: " + linha);
            }
        }catch (IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
