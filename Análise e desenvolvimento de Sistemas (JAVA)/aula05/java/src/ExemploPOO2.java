import java.util.Scanner;

class Pessoa{
    String nome;
    int idade;

    void dizerOla(){
        System.out.println("Olá, sou o " + nome);
        System.out.println("Tenho " + idade + " anos");
    }
}
public class ExemploPOO2 {
    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite seu nome: ");
        pessoa.nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        pessoa.idade = scanner.nextInt();

        pessoa.dizerOla();

        scanner.close();
    }
}
