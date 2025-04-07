import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int vet[] = new int[10];
        int pares = 0;

        for(int i = 0; i < 10; i++){

            System.out.println("Digite por favor um número: ");
            vet[i] = scanner.nextInt();

            if (vet[i] % 2 == 0){
                pares ++;
        
            }
        }

        System.out.println(pares);
        scanner.close();
    }
}
