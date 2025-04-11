<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    
    <?php

        //Função para verificar se o form foi enviado
        function form_nao_enviado(){
            //A partir do momento que eu coloquei o operador lógico dentro da função, tornei ela uma função que retorna um booleano.
            
            
            //Se diferente de POST, retorne TRUE 
            //Se for igual a POST, retorne FALSE
            return $_SERVER['REQUEST_METHOD'] != 'POST';

        }

        //Função para verificar se o valor que foi digitado no form não é numérico
        function valor_nao_numerico(){

            //Se qualquer um dos campos não for número a função retornará verdadeiro

            return !is_numeric($_POST['valor1']) || !is_numeric($_POST['valor2']);
        }

    ?>

    
</body>
</html>