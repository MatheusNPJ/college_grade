
class Carro {

    String modelo;
    int ano;

    void buzinar(){
        System.out.println("Bii Bii!!");
    }
}

public  class ExemploPOO1 {

    public static void main(String[] args) {
        
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2022;

        meuCarro.buzinar();

        System.out.println("Meu carro é um "  + meuCarro.modelo + "do ano " + meuCarro.ano);
    }

}