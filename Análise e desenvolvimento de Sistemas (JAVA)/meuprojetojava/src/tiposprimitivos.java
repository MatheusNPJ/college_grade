public class tiposprimitivos {

    public static void main(String[] args) {
        
        //TIPOS INTEIROS
        byte valorByte = 127; //Máximo que essa var guarda é 127

        short valorShort = 32000;

        int valorInt = 2147483647; //Máximo para int

        long valorLong = 9223372036854775807L; //Precisa fechar com um L maiúsculo no final


        //TIPOS DE PONTO FLUTUANTE
        float valorFloat = 3.14f; //Precisa de f minúsculo no final
        double valorDouble = 3.1415926535;//Maior precisção

        //TIPOS DE CARACTERE
        char valorChar = 'A';

        //TIPO BOOLEANO
        boolean valorBooleano = true;


        //Exibindo valores no console
        System.out.println(" === Demonstração de Tipos Primitivos ===");
        System.out.println("Byte: " + valorByte);   
        System.out.println("Short: " + valorShort);
        System.out.println("Int: " + valorInt);
        System.out.println("Long: " + valorLong);
        System.out.println("Float: " + valorFloat);
        System.out.println("Double: " + valorDouble);
        System.out.println("Byte: " + valorChar);
        System.out.println("Byte: " + valorBooleano);
        


    }
    
}