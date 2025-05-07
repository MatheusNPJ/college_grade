/*O que é serialização?
Serialização é o processo de transformar um objeto em uma sequência de bytes para que ele possa ser:

-Salvo em um arquivo 
-Enviado pela rede
-Armazenado de forma persistente

O que é desserialização?
Desserialização é o processo inverso: reconstruir um objeto a partir de uma sequência de bytes previamente serializada.

-Explicações adicionais

	Comando			Explicação
ObjectOutputStream		Serve para salvar objetos em arquivos binários
ObjectInputStream		Serve para ler objetos salvos
writeObject (obj)		Salva o objeto no arquivo
readObject()			Recupera o objeto do arquivo
implements Serializable		Torna a classe seializável

Obs: É possível serializar qualquer objeto desde que ele implemente a interface serializable 

Exemplo: Vamos criar uma classe Pessoa, serializá-la para um arquivo e depois recuperá-la (desserializar). 

- Formato .dat(binário usado como ObjectOutputStream)
	- Vantagens: Guarda o objeto completo com estrutura, útil para persistência interna.
	- Desvantagens: não é legível por uma pessoa, difícil de compartilhar com outras aplicações

- Formarto .txt (texto puro)
	- Armazena os dados manualmente formatados em texto
	- É legível e editável
	- Precisa escrever e ler manualmente os atributos, não guarda a estrutura do objeto.

- Formato .json (padrão de dados estruturado)
	- Guarda os dados de forma estruturada e legível.
	- Muito usado em integrações com API's, banco de dados, etc
	- Requer uma biblioteca externas como json ou Jackson para facilitar. */

import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;

public class ProgramaPrincipal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);

        //SERIALIZAÇÃO (SALVAR OBJETO EM ARQUIVO)

        try(ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream("pessoa.dat")))
        {
            oos.writeObject(pessoa); //Salva o objeto no arquivo
            System.out.println("Obejto salvo com sucesso!");
        } catch (IOException e){
            System.out.println("Erro ao salvar o objeto: " + e.getMessage());
        }

        //DESSERIALIZAÇÃO (Ler o objeto do arquivo)
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoa.dat")))
        {
            Pessoa pessoaLida = (Pessoa) ois.readObject(); //Lê o objeto e faz cast
            System.out.println("Objeto lido do arquivo:");
            pessoaLida.exibirDados();
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Erro ao ler o objeto: " + e.getMessage());
        }
    }
}
