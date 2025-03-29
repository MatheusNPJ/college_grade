

<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<!-- Escreva um algoritmo que leia um número digitado pelo usuário e mostre a mensagem 
Número maior do que 10!”, caso este número seja maior, ou “Número menor ou igual a 10!”, 
caso este número seja menor ou igual. -->


<body>
    <form action="" method="POST">
        <h1>Digite um número por favor</h1>
        <input type="number" name="digitou">
        <button type="submit">Enviar</button>
    </form>
    
    <?php
    
        if(!empty($_POST['digitou'])){

            $numero = $_POST['digitou'];

            if($numero > 10){
                echo "O número digitado é maior que 10";
            }else{
                echo "O número é menor que 10";
            }

        }

    ?>
</body>
</html>


