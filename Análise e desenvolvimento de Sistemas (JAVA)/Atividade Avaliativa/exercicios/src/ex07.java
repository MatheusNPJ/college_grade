import java.util.Scanner;

public class ex07 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int cash = 0;
        int cem = 0;
        int cinq = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;


        System.out.println("Digite o valor que deseja sacar: ");
        cash = scanner.nextInt();

        cem = cash / 100;
        cash = cash % 100;

        cinq = cash / 50;
        cash = cash % 50;

        vinte = cash / 20;
        cash =  cash % 20;

        dez = cash / 10;
        cash = cash % 10;

        cinco = cash / 5;
        cash = cash %5;

        dois = cash / 2;
        cash = cash %2;

        System.out.println("Notas necessárias:");
        System.out.println("Notas de 100: " + cem);
        System.out.println("Notas de 50: " + cinq);
        System.out.println("Notas de 20: " + vinte);
        System.out.println("Notas de 10: " + dez);
        System.out.println("Notas de 5: " + cinco);
        System.out.println("Notas de 2: " + dois);
        
        // Se ainda houver valor restante que não pode ser sacado
        if (cash > 0) {
            System.out.println("Valor restante que não pode ser sacado: " + cash);
        }

        scanner.close();
    }
}