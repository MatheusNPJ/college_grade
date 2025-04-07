import java.util.List;
import java.util.ArrayList;


public class tiposnaoprimitivos {
    
    public static void main (String[] args){

        //TIPOS DE STRING

        String texto = "Olá, Mundo!";

        //TIPOS DE ARRAY
        int[] numeros = {10, 20, 30, 40};

        //TIPOS LISTA
        List<String> listanomes = new ArrayList<>();
        listanomes.add("Ana");
        listanomes.add("Bruno");
        listanomes.add("Carlos");

        //EXIBINDO OS VALORES NO CONSOLE
        System.out.print("String: " + texto);

        System.out.println("");

        System.out.print("Array de números: ");
        for(int num : numeros) {
            System.out.println(num + " ");
        }
        
        System.out.println("Lista de nomes: " + listanomes);
        
    }



}
