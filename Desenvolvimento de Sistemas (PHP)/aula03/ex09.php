<!-- Leia dois números nas variáveis A e B e identifique se os valores são iguais ou diferentes. Caso 
eles sejam iguais imprima uma mensagem dizendo que são iguais. Caso sejam diferentes, 
informe que são diferentes e qual número é o maior.  -->

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
        <button type="submit">ENVIAR</button>

    </form>

    <?php

        if($_SERVER['REQUEST_METHOD'] == "POST"){

            if(!empty($_POST['number1']) && !empty($_POST['number2'])){

                $number1 = $_POST['number1'];
                $number2 = $_POST['number2'];

                if($number1 > $number2){
                    echo "Numero A é maior: " . $number1;
                }else if($number1 < $number2){
                    echo "Numero B é maior: " . $number2;
                }else{
                    echo "Os números são iguais";
                }
            }
        }
    ?>
</body>
</html>