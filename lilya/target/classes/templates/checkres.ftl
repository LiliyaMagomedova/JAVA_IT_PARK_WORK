<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="/css/style.css" />
    <title>Free rooms</title>
</head>
<body>
<div>
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
</body>