import java.util.Random;
import java.util.Scanner;



public class ex09 {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = random.nextInt(100);
        int compare = 0;

        System.out.println("Por favor digite um numero de 01 a 100 para tentar adivinhar o numero gerado por nos");

        do{
            compare = scanner.nextInt();

            if(compare < guess){
                System.out.println("O numero e maior, tente novamente.");
            }else if(compare > guess){
                System.out.println("o numero e menor, tente novamente.");
            }else{
                System.out.println("Parabens, voce adivinhou!");
            }

        }while(compare != guess);

        scanner.close();

    }
}
