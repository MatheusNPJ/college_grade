import java.io.Serializable;

public class Pessoa implements Serializable{

    //Atributos da classe
        private String nome;
        private int idade;

    //Construtor
        public Pessoa (String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }

    //Método
        public void exibirDados(){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
}
