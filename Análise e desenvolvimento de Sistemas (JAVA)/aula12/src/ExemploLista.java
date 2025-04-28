//COLEÇÕES: QUE SÃO COLEÇÕES?
//COLEÇÕES SÃO ESTRUTURAS QUE ARMAZENAM GRYOIS DE OBJETOS - COMO LISTAS, CONJUNTOS, MAPAS, FILAS E ETC...
//O JAVA OFERECE O FRAMEWORK DE COLEÇÕES JAVA.UTIL, QUE TRAZ VÁRIAS INTERFACES E CLASSES PRONTAS PARA:
//-ARMAZENAR DADOS
//-PERCORRER DADOS
//-ORDENAR DADOS, BUSCAR ADICIONAR E REMOVER ELEMENTOS COM FACILIDADE
// PRINCIPAIS TIPOS DE COLEÇÕES 
//LIST - ARRAY LIST, LINKED LIST - LISTA ORDENADA(ACEITA ELEMENTOS REPETIDOS)
//SET - HASH SET, TREESET - CONJUNTO (NÃO ACEITA ELEMENTOS REPETIDOS)
//MAP - HASH MAP, TREEMAP - PARES CHAVE-VALOR (EX: CPF -> NONE)

import java.util.List;
import java.util.ArrayList;

public class ExemploLista {
    public static void main(String[] args) throws Exception {
        
        //Criação da lista
        List<String> nomes = new ArrayList<>();

        //Adicionando elementos a lista 
        nomes.add("Ana");
        nomes.add("Julia");
        nomes.add("Marta");

        //Acessando elementos pelo índice
        System.out.println("Primeiro nome: " + nomes.get(0));

        //Percorrendo a lista 
        System.out.println("Todos os nomes");
        for (String nome : nomes)
            System.out.println(nome);

        //Verificando o tamanho da lista
        System.out.println("Tamanho da lista: " + nomes.size());

        //Removendo um elemento
        nomes.remove("Ana");
        
        System.out.println("Nomes após a remoção: ");
        for (String nome : nomes)
            System.out.println(nome);
    
    }
}
