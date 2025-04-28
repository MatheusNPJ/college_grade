import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

    public static void main(String[] args)
    {

        //Criando um conjunto
        Set<String> cores = new HashSet<>();

        //Adicionando elementos 
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");

        //Testando adicionar uma cor já existente
        cores.add("Azul");//Não será adicionado
        
        //Imprimindo o conjunto
        System.out.println("Cores");
        for (String cor : cores)
            System.out.println(cor);
    
        //Verificando se contém uma cor
        if(cores.contains("Verde"))
            System.out.println("Contém a cor verde.");

        //Removendo uma cor 
        cores.remove("Amarelo");

        //Tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + cores.size());

        
    }
    
}
