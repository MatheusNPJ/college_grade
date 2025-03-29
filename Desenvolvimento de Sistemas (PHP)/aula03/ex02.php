<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
<!-- Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua 
soma. -->

    <form action="" method="POST">
        <h1> Digite dois números e lhe mostrarei a soma </h1>
        <input type="number" name="numero1" placeholder="Numero1">
        <input type="number" name="numero2" placeholder="Numero2">
        <button type="submit">Enviar</button>
    </form>

    <?php

        if ($_SERVER["REQUEST_METHOD"] == "POST"){

          $numero1 = $_POST['numero1'];
          $numero2 = $_POST['numero2'];
          
          $numero1 = $numero1 + $numero2;

          echo $numero1;
        }
    ?>

</body>
</html>