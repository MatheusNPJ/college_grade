import java.util.Scanner;

public class EstruturaSwitch {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        int dia = scanner.nextInt();

        String NomeDia;

        switch(dia) {
            case 1:
                NomeDia = "Domingo";
                break;
            case 2:
                NomeDia = "Segunda";
                break;
            case 3:
                NomeDia = "Terça";
                break;
            case 4:
                NomeDia = "Quarta";
                break;
            case 5:
                NomeDia = "Quinta";
                break;
            case 6:
                NomeDia = "Sexta";
                break;
            case 7:
                NomeDia = "Sábado";
                break;
            default:
                NomeDia =  "Número inválido";
                break;
        }
        
        System.out.println("O dia da semana é: " + NomeDia);
        scanner.close();
    }
}
