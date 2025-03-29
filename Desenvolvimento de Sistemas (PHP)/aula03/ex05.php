<!--Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor da variável A 
passe a ser o valor da variável B, e o valor da variável B passe a ser o valor da variável A.  
presentar uma mensagem com o valor original de cada variável e outra com os valores 
trocados. -->

<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <form action="" method="POST">

        <input type="number" name="number1">
        <input type="number" name="number2">
        <button type="submit">Enviar</button>

    </form>

    <?php

        if($_SERVER['REQUEST_METHOD'] == "POST"){

            $number1 = $_POST['number1'];
            $number2 = $_POST['number2'];

            echo "numero A com valor de A:" . $number1;
            
            $tmp = $number1;

            $number1 = $number2;

            echo "numero A com valor de B" . $number2;

            echo "numero B com valor de B:" . $number2;

            echo "numero B com valor de A:" . $tmp;
        }
    ?>

</body>
</html>