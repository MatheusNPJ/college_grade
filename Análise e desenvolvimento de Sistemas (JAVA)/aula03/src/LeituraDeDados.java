import java.util.Scanner;

public class LeituraDeDados {

    public static void  main (String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite um número inteiro: ");
        int inteiro = scanner.nextInt();

        System.out.print("Digite um número decilmal: ");
        double decimal = scanner.nextDouble();

        System.out.print("Digite uma palavra:");
        String palavra = scanner.next();

        scanner.nextLine();//Essa linha está pegando o enter do input passado, para não bugar o scanner da próxima linha. 

        System.out.print("Digite por favor uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("\n=== Dados Lidos ===");
        System.out.println("Numero inteiro: " + inteiro);
        System.out.println("Numero decimal: " + decimal);
        System.out.println("Palavra: " + palavra);
        System.out.println("Frase: " + frase);

        scanner.close();
    }
}