<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 04 -  Resultado de clientes</title>
</head>
<body>
    
    <h1>Resultado de Pesquisa</h1>

    <?php

        if(!empty($_GET['cliente'])){

            $cliente = $_GET['cliente'];


            //Criando array de clientes
            //$clientes[] = "João Silva";
            //$clientes[] = "Maria souza";
            //$clientes[] = "Leonardo de João";


            //Criando array de clientes de outra maneira
            $clientes = [
                "João Silva",
                "Maria souza",
                "Leonardo de João"
            ];

            $encontrou = false;


            //Criando um foreach para percorrer o array clientes
            foreach($clientes as $clienteAtual){
                
                //Verificar se o nome que digitamos no form está contido dentro do nome do cliente atual
                if(str_contains($clienteAtual, $cliente)){
                    echo "Cliente encontrado! " . $clienteAtual . "<br>";
                    $encontrou = true;//Cliente encontrado!
                }

            }

            //Se encontrou ainda false, não foi encontrado clientes.
            if(!$encontrou){
                echo "Nenhum cliente encontrado com o nome " . $cliente;
            }

        }else{
            echo "Nenhum dado foi enviado para pesquisa.";
        }

    ?>

    <p>
        <a href="index.php">Voltar à Home</a>
    </p>

</body>
</html>