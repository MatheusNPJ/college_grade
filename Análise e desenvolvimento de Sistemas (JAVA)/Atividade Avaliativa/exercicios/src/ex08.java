import java.util.Scanner;

public class ex08 {
    
    public static void main(String[] args) {
        
        int vogais = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite uma palavra: ");
        String palavra = scanner.nextLine();
        palavra = palavra.toLowerCase();

        for(int i = 0; i < palavra.length(); i++){

            char caractere = palavra.charAt(i);

            if(caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere =='u'){
                vogais++;
            }
        }

    
        System.out.println(vogais);
        scanner.close();
    }
}
