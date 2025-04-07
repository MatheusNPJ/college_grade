import java.util.Random;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); 

        int machine = random.nextInt(10);        
        int user = 0;
        int palpite = 0;

        System.out.println("Por favor digite 1 para impar e 2 para par");
        user = scanner.nextInt();

        if(user == 1){
            System.out.println("voce escolheu impar");
        }else{
            System.out.println("Voce escolhe par");
        }

        System.out.println("Agora digite seu palpite: ");
        palpite = scanner.nextInt();

        int result = palpite + machine;

        if(result % 2 != 0){
            result = 1;
        }else{
            result = 2;
        }

        if (result == user){
            System.out.println("você ganhou!");
        }else{
            System.out.println("Você perdeu!");
        }

        scanner.close();
    }   
}
