namespace Aula2;

class Program
{
    

    static void Main(string[] args)
    {
        /*
        int[] numeros = new int [5];
        for(int i = 0; i < 5; i++){
            Console.Write("Entre com o valor: ");
            var input = Console.ReadLine();
            numeros[i] = int.Parse(input);
        }
        
        int cont = 0;
        while(cont < 5){
            Console.WriteLine(numeros[cont]);
            cont++;
        }
        */
        
        Aluno aluno = new Aluno();
        aluno.Name = "João da silva";

        
        Console.WriteLine(aluno.Id + " " + aluno.Name);

        var pessoa = (nome: "Maria", peso: 68.8, altura: 1.65);
        var pessoa2 = (nome: "João", peso: 100.8, altura: 1.95);
        CalcularIMC(pessoa);
        CalcularIMC(pessoa2);
    }

    private static void CalcularIMC( (string nome, double peso, double altura) ar) {

        //Calcular o IMC 

        var imc = ar.peso / (ar.altura * ar.altura);

        Console.WriteLine(ar.nome +" - " + imc);
    }
}
