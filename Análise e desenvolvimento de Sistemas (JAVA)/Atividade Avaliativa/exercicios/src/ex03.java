import java.util.ArrayList; 
import java.util.Scanner;

public class ex03 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        

        for(int i = 0; i < 10; i++){

            System.out.println("Digite por favor um número: ");
            numeros.add(scanner.nextInt());
        }

        scanner.close();

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        for (Integer num : numeros){
            if(num < menor){
                menor = num;
            }
            if(num > maior){
                maior = num;
            }
        }
    
        System.out.println("Maior valor: " + maior + " menor valor: " + menor);
    }

}