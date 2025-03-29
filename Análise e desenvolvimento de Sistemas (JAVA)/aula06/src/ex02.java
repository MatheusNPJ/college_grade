
import java.util.Scanner;

class Aluno{
    
    String nome;
    double nota1;
    double nota2;

    void media(){

        nota1 = (nota1 + nota2) / 2;

        if(nota1 > 70){
            System.out.println(nome + " aprovado!");
        }else{
            System.out.println(nome + " Reprovado");
        }
    }   
}

public class ex02 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
    
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.print("Digite a nota 1: ");
        aluno.nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        aluno.nota2 = scanner.nextDouble();

        aluno.media();

        scanner.close();
    }
}
