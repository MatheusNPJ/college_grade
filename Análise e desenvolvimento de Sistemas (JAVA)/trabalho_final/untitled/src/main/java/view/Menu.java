package view;
import java.util.scanner;


//Essa classe é responsável somente em exibir o menu;
public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {

        int op;

        do {

            System.out.println("Planeje sua semana!");
            System.out.println("");
            System.out.println("===MENU===");
            System.out.println("");
            System.out.println("1 - Cadastre uma tarefa");
            System.out.println("2 - Listar as tarefas da semana");
            System.out.println("3 - Editar tarefa");
            System.out.println("4 - Excluir tarefa");
            System.out.println("");
            System.out.println("0 - Sair");

            op = scanner.nextInt; //Captar a ação desejada
            scanner.nextLine();

            //Chamar o método desejado
            switch(op){
                case 1:
                    tarefaController.cadastrar(scanner);
                    break;
            }

        } while (op != 0);
    }
}
