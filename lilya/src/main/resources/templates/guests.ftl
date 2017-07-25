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
<div>
    <table>
        <tr>
            <th>ID</th>
            <th>Фамилия</th>
            <th>Имя</th>
            <th>Номер паспорта</th>
        </tr>

    <#list model.guests as guest>
        <tr>
            <td>${guest.id}</td>
            <td>${guest.lastName}</td>
            <td>${guest.firstName}</td>
            <td>${guest.passport}</td>
        </tr>
    </#list>
    </table>

</div>
</body>