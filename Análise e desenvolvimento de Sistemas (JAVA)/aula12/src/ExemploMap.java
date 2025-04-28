//Map é uma estrutura que armazena pares de cgaves e valor 
//Cada chave é unica 
//Pode ser pensado como um dicionário 

import java.util.HashMap;
import java.util.Map;


public class ExemploMap {
    
    public static void main(String[] args) {
        
        // Criando um Map onde a chave é String (nome) e o valor Integer (idade)
        Map<String, Integer> pessoas = new HashMap<>();

        //Adicionando Elementos
        pessoas.put("Ana", 25);
        pessoas.put("Bruno", 54);
        pessoas.put("Jamisson", 79);
        pessoas.put("Enzo", 104);

        //Posso atualizar a idade da Ana
        pessoas.put("Ana", 28);

        //Imprimindo MAP
        System.out.println("Lista de Pessoas");
        for (String nome : pessoas.keySet()){
            Integer idade = pessoas.get(nome);
            System.out.println(nome + " " + idade + " anos");
        }

}
}