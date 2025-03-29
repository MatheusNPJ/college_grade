<!--Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A 
fórmula de conversão é: F = (9 * C + 160) / 5 -->

<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="POST">

        <h1>Digite uma temperatura em celsius</h1>

        <input type="number" name="graus">
        <button>Enviar</button>

    </form>

    <?php
    
        if($_SERVER['REQUEST_METHOD'] == "POST"){
            if(!empty($_POST['graus'])){

                $celsius = $_POST['graus'];
                $fa =  (9 * $celsius + 160) / 5;

                echo "$fa";
            }
        }
    
    ?>
</body>
</html>