import java.util.Scanner;

public class ex04 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int vet[] = new int[5];
        float soma = 0;

        for(int i = 0; i < 5; i++){

            System.out.println("Digite sua nota: ");
            vet[i] = scanner.nextInt();

            soma += vet[i];
           
        }

        soma = (soma / 5);

        System.out.println(soma);
        scanner.close();

    }
}
