import java.util.Scanner;

class Tabela{
    
    String nome;
    double preco;
    int qtd;


    void func(){
        
        System.out.println("Produto: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade: " + qtd);

    }
}


public class ex01 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Tabela tabela = new Tabela();

        System.out.print("Digite o nome do produto: ");
        tabela.nome = scanner.nextLine();

        System.out.print("Digite o preco produto: ");
        tabela.preco = scanner.nextDouble();

        System.out.print("Digite a quantidade: ");
        tabela.qtd = scanner.nextInt();

        tabela.func();

        scanner.close();
    }
    
}
