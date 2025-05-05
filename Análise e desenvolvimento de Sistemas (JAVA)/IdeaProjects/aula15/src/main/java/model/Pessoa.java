package model;

public class Pessoa {
    private String nome;

    private int idade;

    //Construtor da classe pessoa
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Isso habilita pegar dados de um atributo que é privado
    public String getNome(){
        return nome;
    }

    //Isso habilita pegar dados de um atributo que é privado
    public int getIdade(){
        return idade;
    }

}
