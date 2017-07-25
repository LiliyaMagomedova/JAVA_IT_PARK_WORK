<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="/css/box.css" />
    <title>Guests</title>
</head>
<body>
<ul>
    <li><a href="main.ftl">Главная</a></li>
    <li><a href="rooms.ftl">Прайс</a></li>
    <li><a href="newguest.ftl">Регистрация гостя</a></li>
    <li><a href="#">Контакты</a></li>
</ul>
<div class="wrapper_body">
    <div class="cbm_wrap">
        <h2>Регистрация гостя</h2>
    <table>
        <tr>
            <th>Регистрация</th>
        </tr>

    <form method="get" action="/new">
        <tr>
            <td>
            <input type="text" id="lastName" name="lastName" placeholder="Фамилия">
            </td>
        </tr>
        <tr>
            <td>
            <input type="text" id="firstName" name="firstName" placeholder="Имя">
            </td>
        </tr>
        <tr>
            <td>
            <input type="text" id="passport" name="passport" placeholder="Номер паспорта">
            </td>
        </tr>
        <tr>
            <td>
            <input type="submit" value="Отправить">
            </td>
        </tr>
    </form>

    </table>
    </div>
</div>
</body>