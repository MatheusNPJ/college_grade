<!-- Escreva um algoritmo que leia os valores de dois números inteiros distintos nas variáveis A e B 
e informe qual deles é o maior. Caso os números sejam iguais informar ao usuário que a 
sequência de números informados é inválida. -->

<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <form action="" method="POST">

        <h1>Por favor digite os inteiros</h1>
        <input type="numer" name="number1">
        <input type="numer" name="number2">
        <button type="submit">Enviar</button>
    
    </form>
    
    <?php

        if($_SERVER['REQUEST_METHOD'] == "POST"){

            $number1 = $_POST['number1'];
            $number2 = $_POST['number2'];
            
            if($number1 > $number2){
                echo "Numero 1 é maior";
            }else if($number1 < $number2){
                echo "Numero 2 é maior";
            }else{
                echo "Os números são iguais";
            }
            
        }

    ?>
</body>
</html>