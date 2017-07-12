<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="/css/style.css" />
    <title>Guests</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>Регистрация</th>
        </tr>

    </table>
    <form method="post" action="/add">

        <input type="text" id="guestId" name="guestId" placeholder="ID гостя">
        <input type="text" id="roomId" name="roomId" placeholder="Номер комнаты">
        <input type="submit" value="Отправить">

    </form>


</div>
</body>