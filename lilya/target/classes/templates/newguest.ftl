<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="/css/input.css" />
    <title>Guests</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>Регистрация</th>
        </tr>

    </table>
    <form method="post" action="/new">

        <input type="text" id="lastName" name="lastName" placeholder="Фамилия">
        <input type="text" id="firstName" name="firstName" placeholder="Имя">
        <input type="text" id="passport" name="passport" placeholder="Номер паспорта">
        <input type="submit" value="Отправить">



</div>
</body>