import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int vet[] = new int[5];
        int soma = 0;

        for(int i = 0; i < 5; i++){

            System.out.println("Digite por favor um número: ");
            vet[i] = scanner.nextInt();

            soma += vet[i];
        }

        System.out.println(soma);
        scanner.close();
    }
}
