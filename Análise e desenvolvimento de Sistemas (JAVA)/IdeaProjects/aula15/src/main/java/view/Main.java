/*PADÃO MVC
        O que é MVC?
        MCV divide sua aplicação em três camadas principais:

        Camada 	Responsabilidade
        Model 	Representa os dados e regras de negócio
        View	Interface com usuário (entrada e saída de dados)
        Controller	Faz a medição entre Model e View

        Model -> Contém as classes que representam os dados e a lógica de negócio
        (ex: Pessoa, Produto, Conta).

        View -> Contém as classes responsáveis por exibir informações para o usuário
        (ex: mensagens no console ou GUI).

        Controller -> Contém as classes que fazem a ponte entre o modelo e a visualização.

        Benefícios do MVC
        -Separação do MVC
        -Facilidade de manutenção e testes
        -Código mais limpo e reutilizável

        Para poder trabalhar com o Padrão MVC, precisamos criar os chamados Packages (Pacotes).
        O que é um pacote? Um pacote em Java é uma pasta onde agrupamos classes relacionadas logicamente. Ela serve para?
        -Organizar o código
        -Evitar conflitos de nomes de classes
        -Controlar visibilidade (ex: com o  modificador default).

*/
        package view;
import model.Pessoa;
import controller.PessoaController;

public class Main {
    public static void main(String[] args){
        Pessoa p = new Pessoa("Ana", 25);
        PessoaController controller = new PessoaController();
        controller.mostrarPessoa(p);
    }
}
