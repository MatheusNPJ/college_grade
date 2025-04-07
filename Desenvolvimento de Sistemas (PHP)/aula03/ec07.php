<!--Escreva um algoritmo que leia um número e diga, através de uma mensagem, se este número 
está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo, solicitar ao usuário 
que digite novamente, até que essa condição seja atendida.-->


<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <form action="" method="POST">
        <h1>Digite um número</h1>
        <input type="number" name="number1">
        <button type="submit">ENVIAR</button>
    </form>

    <?php

        if($_SERVER['REQUEST_METHOD'] == "POST"){
            if(!empty($_POST['number1'])){
                
                $number1 = $_POST['number1'];

                if($number1 > 100 && $number1 < 200){
                    echo "Parabens, vc é a mãe diná!";
                }else{
                    echo "DNV!";
                }
            
            }
        } 
        
    ?>
</body>
</html>