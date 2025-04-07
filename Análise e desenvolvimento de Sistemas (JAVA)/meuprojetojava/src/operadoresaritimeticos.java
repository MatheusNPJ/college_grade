import java.util.Scanner;

public class operadoresaritimeticos {
    public static void main(String[] args) {

        //CRIANDO UM SCANNER PARA LER A VAR 
        Scanner scanner = new Scanner(System.in);
    
        //Solicita ao usuário um input 
        System.out.print("Digite por favor o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite por favor o segundo número: ");
        double num2 = scanner.nextDouble();

        //REALIZANDO OPERAÇÕES ARITIMÉTICAS
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double modulo = num1 % num2;
        double potencia = Math.pow(num1, num2);
        double raiz = Math.sqrt(num1);

        //EXIBINDO OS RESULTADOS
        System.out.println("Soma:  " + soma);
        System.out.println("Subtração:  " + subtracao);
        System.out.println("Multiplicação:  " + multiplicacao);
        System.out.println("Divisão:  " + divisao);
        System.out.println("Modulo:  " + modulo);
        System.out.println("Potencia:  " + potencia);
        System.out.println("Raiz:  " + raiz);

        scanner.close();
    }
}
