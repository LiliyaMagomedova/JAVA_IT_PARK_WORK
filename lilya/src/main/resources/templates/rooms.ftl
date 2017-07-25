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
        <h2>Прайс-лист</h2>
        <table>
            <tr>
                <th>Номер комнаты</th>
                <th>Количество кроватей</th>
                <th>Цена за 1 ночь</th>
            </tr>

        <#list model.rooms as room>
            <tr>
                <td>${room.id}</td>
                <td>${room.bedNumber}</td>
                <td>${room.price}</td>
            </tr>
        </#list>
        </table>

    </div>
</div>

</body>