//MVC: model (Tarefa, Usuario), controller (TarefaController), view (Menu).
//
//Herança/Polimorfismo: Tarefa pode ter subclasses como TarefaSimples, TarefaComPrazo.
//
//Interface: Interface Gerenciavel com métodos criar(), editar(), etc.
//
//Exceções: TarefaNaoEncontradaException.
//
//Coleções: List<Tarefa>, Map<String, List<Tarefa>> por usuário.
//
//Arquivos: Gravar tarefas por usuário.
//
//Menu: Cadastrar tarefa, listar, editar, excluir, salvar.

package model;
public class Usuario {

    private int Id;
    private String Nome;
    private String AreasDaVida; //Faculdade//Trabalho//Pessoal

}
