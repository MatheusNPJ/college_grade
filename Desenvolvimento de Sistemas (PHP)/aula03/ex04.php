<!-- Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração, multiplicação 
e a divisão dos números lidos. -->

<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <form action="" method="POST">
        <h1>Ex 04</h1>

        <input type="number" name="number1">
        <input type="number" name="number2">
        <button type="submit">Enviar</button>
    </form>
    
    <?php

        if($_SERVER['REQUEST_METHOD'] == "POST"){

            $number1 = $_POST['number1'];
            $number2 = $_POST['number2'];
        
            $soma = $number1 + $number2;
            $subtracao = $number1 - $number2;
            $divisao = $number1 / $number2;
            $multiplicacao = $number1 * $number2;
            

            echo "$soma \n";
            echo "$subtracao \n";
            echo "$divisao \n";
            echo "$multiplicacao\n";
        }
    ?>
</body>
</html>