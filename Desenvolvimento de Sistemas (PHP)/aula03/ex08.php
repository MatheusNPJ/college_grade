<!--Escreva um algoritmo que leia um número e mostre uma mensagem caso este número seja 
maior ou igual a 50, outra se ele for menor que 50. -->

<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=
    , initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <form action="" method="POST">

        <h1>ex 08</h1>
        
        <input type="number" name="number">
        <button type="submit">Enviar</button>

    </form>

    <?php

        if($_SERVER['REQUEST_METHOD'] == "POST"){

            $number = $_POST['number'];

            if($number > 50){
                echo "O numero digitado é maior que 50";
            }else{
                echo "O numero digitado é menor que 50";
            }
        }
    ?>

</body>
</html>