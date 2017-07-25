<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<html xmlns='http://www.w3.org/1999/xhtml'>
<head>
    <title>Добро пожаловать!</title>
    <link rel='stylesheet' href="/css/box.css">
</head>
<body>
<ul>
    <li><a href="main.ftl">Главная</a></li>
    <li><a href="rooms.ftl">Прайс</a></li>
    <li><a href="newguest.ftl">Регистрация гостя</a></li>
    <li><a href="#">Контакты</a></li>
</ul>
<div class="wrapper_body">
    <div class="cbm_wrap ">
        <h1>Отель Картонная коробка</h1>
        <img src="http://filing.pl/wp-content/uploads/2015/05/filing_images_bb6bb8656fcf.jpg">
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam luctus consectetur dolor a porttitor. Curabitur id sem sed ante fringilla pulvinar et id lectus. Nullam justo ipsum, hendrerit ut commodo nec, pellentesque nec erat. Pellentesque pharetra.</p>
        <br />
        <a href="http://www.designshock.com/">DesignShock.com </a>
    </div>
</div>
</body>
</html>
