import java.util.Scanner;

class Carro{

    String modelo;
    boolean ligado  = false;
    int velocidade;

    void ligar(){
        
        if(!ligado){
            ligado = true;
            System.out.println("O carro foi ligado.");
        }else{
            System.out.println("O carro já está ligado");
        }
    }

    void desligar(){
        
        if(ligado && velocidade == 0){
            ligado = false;
            System.out.println("O carro foi desligado");
        }else if(velocidade > 0){
            System.out.println("Não é possivel desligar o carro enquanto estiver em movimento");
        }else{
            System.out.println("O carro já está desligado");
        }
    }

    void acelerar(){
        
        if(ligado){
            velocidade += 20;
            System.out.println("Acelerando");
        }else if (ligado == false) {
            ligado = true;
            System.out.println("O carro foi ligado, acelerando");
        }
    }

    void parar(){
        if(velocidade > 0){
            velocidade = 0;
            System.out.println("O diminuindo a velocidade");
        }else{
            System.out.println("O carro já está parado");
        }
    }
}

public class ex03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        int op;

        do{
            System.out.println("\n === MENU ===");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Acelerar");
            System.out.println("3 - Desligar carro");
            System.out.println("4 - Parar carro");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.acelerar();
                    break;
                case 3:
                    carro.desligar();
                    break;
                case 4:
                    carro.parar();
                    break;
                case 5:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente!");
            }
        }while(op != 5);

        scanner.close();
    }
}
