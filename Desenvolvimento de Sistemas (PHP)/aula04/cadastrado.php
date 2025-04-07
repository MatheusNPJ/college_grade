<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula 04 - Cliente Cadastrado</title>
</head>
<body>

    <p>
        <a href="index.php">Voltar a Home</a>
    </p>

    <?php
        //Dessa maneira, se o campo, não está vazio e os outros 2 também não, faça
       // if(!empty($_POST['nome']) && !empty($_POST['email']) && !empty($_POST['fone'])){

            //faça...

        //}


        //1° CAMADA DE VERIFICAÇÃO
        //Verificando da maneira correta se o servidor recebeu uma requisição POST
        if($_SERVER['REQUEST_METHOD'] == 'POST'){


            //2° CAMADA DE VERIFICAÇÃO (NENHUM CAMPO PODE ESTAR EM BRANCO)
            //Se recebeu requisição, verifique se os campos estão preenchidos
            //Se não estiverem preenchidos crie a var erros
            if(empty($_POST['nome'])){
                $erros[] = "<h4>Nome não pode estar em branco!</h4>";
            }

            if(empty($_POST['email'])){
                $erros[] = "<h4>Email não pode estar em branco!</h4>";
            }

            if(empty($_POST['fone'])){
                $erros[] = "<h4>Telefone não pode estar em branco!</h4>";
            }

            
            //Se não houver erros
            if(!isset($erros)){
                //faça
                $nome = $_POST['nome'];
                $email = $_POST['email'];
                $fone = $_POST['fone'];

                echo "<h2>Cliente Cadastrado</h2>";

                echo "Nome do cliente: " . $nome . "<br>";
                echo "E-mail: " . $email . "<br>";
                echo "Telefone" . $fone . "<br>";
            } else {
                //Se houver erros, aprensente os erros e o formulário para o usuário preencher 
                echo "<h3>Preencha todos os campos do formulário</h3>";
                
                //print_r($erros); //debugar erros


                //foreach: laço para percorrer arrays, está no indice 0, se houver ele passa o conteudo
                //para erro atual e imprime erro atual e pula para a próxima posição do array
                foreach ($erros as $erroatual){
                    echo $erroatual;
                }
                

                require_once('form_cadastro.php');
            }  

        //SE O FORMULÁRIO NÃO FOI ENVIADO, MENSAGEM DE ERRO
        }else{
            echo "<h3> ATENÇÃO! formulário não enviado";
        }

    ?>
    
</body>
</html>