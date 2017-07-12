<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="/css/style.css" />
    <title>Check date</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>Выбрать свободную комнату</th>
        </tr>

    </table>

    <form method = "get" action = "/checkres">
    <input type="text" id="arrivalDate" name="arrivalDate" placeholder="Дата прибытия">
    <input type="text" id="departureDate" name="departureDate" placeholder="Дата отъезда">
    <input type="text" id="beds" name="beds" placeholder="Желаемое число кроватей">
        <input type="submit" value="Найти свободные">
    </form>
    

</div>
</body>