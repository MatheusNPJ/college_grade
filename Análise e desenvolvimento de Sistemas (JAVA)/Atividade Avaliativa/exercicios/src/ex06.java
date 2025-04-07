import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {
        
        int tabuada = 0;
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;
        System.out.println("Por favor digite o número da tabuada que deseja visualizar: ");
        tabuada = scanner.nextInt();

        for(int i = 1; i < 11; i++){
            resultado = tabuada * i;
            System.out.println(  tabuada +"x"+ i +"=" + resultado);
        }

        scanner.close();
    }
}
