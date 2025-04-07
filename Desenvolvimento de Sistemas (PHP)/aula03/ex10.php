<!--Escreva um algoritmo que leia um número de 1 a 50. Escreva-os na tela indo do número
digitado até o número 50.
Caso o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número
inválido!”, e solicitar uma nova entrada até que essa condição seja atendida -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
        <form action="" method="post">

        <label for="valor">Valor:</label>
        <input type="number" name="valor">

        <button type="submit">Enviar</button>
        </form>

        <?php
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            if (!empty($_POST['valor'])) {
                $valor = $_POST['valor'];
                if($valor < 50) {
                    do {
                        echo $valor . "<br>"; 
                        $valor = $valor + 1; 
                    } while ($valor != 51);
            } else{
                echo "valor acima do 50";
            }
        }
    }
        ?>
</body>
</html>