import java.util.Scanner;

public class ex05 {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){
            
                System.out.println("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        for(int i = 0; i < 3; i++){
            
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j]);
            }
        
            System.out.println();
        }
    }
}
