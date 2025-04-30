import java.io.BufferedWriter; //Permite escrever texto em um arquivo 
import java.io.FileWriter; //Cria ou abre um arquivo para gravação
import java.io.IOException; //Representa erros  de entrada/saída como falhas ao acessar o arquivo

public class EscreverArquivo {

    public static void main(String[] args) {
        String  nomeArquivo = "saida.txt";

        //Bloco try-with-resources que garante o fechamento do arquivo após o uso
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo))) 
        {
            escritor.write("Olá Mundo!");
            escritor.newLine();
            escritor.write("Esse é um exemplo de gravação em arquivo.");
            System.out.println("Arquivo gravado com sucesso!");
        }catch(IOException e){
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}