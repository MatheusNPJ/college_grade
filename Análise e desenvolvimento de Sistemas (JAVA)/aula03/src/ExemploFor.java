public class ExemploFor {
    
    public static void main(String[] args) {
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Numero: " + i);
        }

        int[] numeros = {10, 101, 1011, 1110};

        for (int num : numeros){
            System.out.print(num + " ");
        }
    }
}
