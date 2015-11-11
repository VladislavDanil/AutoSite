<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet">
<script type='text/javascript' src="js/jquery-2.1.4.min.js"></script>
<script type='text/javascript' src='js/valid_t.js'></script>
<script type='text/javascript' src='js/f.js'></script>

<title>Запись на тест-драйв</title>

</head>
<body onload="urlParser(); resultParse();">
<input name="result" type="hidden" id="result" value="${mes}" />
<div class="b-container img">
</div>
<div class="b-popup" id="popup1">
    <div class="b-popup-content">
       <h1> Мы зарегистрировали вашу заявку! </h1>
        <h1>Спасибо что вы с нами.</h1>
    </div>
</div>
	<form name="form" action="TestDrive" method="post"
		onsubmit="return zakazValid()">
		<div class="centre">
			<h1 align="center">Запись на тест-драйв</h1>
			<div class="formBlock" align="center">
				<div id="left_quest">
					<div>
						<p class="zag">Модель</p>
						<input name="auto_name" type="hidden" id="transfer" value="" /> <span
							class="promo_name" id="aName"><br> </span>
					</div>
				</div>
			</div>

			<h2>Контактные данные</h2>
			<div class="formBlock" align="center">

				<div id="left_quest">
					<div>

						<p class="zag">Имя</p>
						<input name="name" class="formgroup" type="text" value=""
							id="name" size="58">


						<p class="zag">Фамилия</p>
						<input name="last_name" class="formgroup" type="text" value=""
							id="lastName" size="58">



						<p class="zag">Отчество</p>
						<input name="middle_name" class="formgroup" type="text" value=""
							id="nameF" size="58">



						<p class="zag">Предпочитаемая дата в формате (2001-12-31)</p>
						<input name="data" class="formgroup" type="text" value="" id="fone" size="58">
                        
                        <p class="zag">Телефон</p>
						<input name="fon" class="formgroup" type="text" value="" id="fone" size="58">
<p class="zag">Проверка на человечность</p>
				<img src="jcaptcha.jpg" /> <br/>
                <input type="text" name="jcaptcha" value="" />
					</div>
				</div>
			</div>
			<p>
				<span style="color: red" id="valid"> </span><br />
				<span style="color: red" id="validname"> </span><br /> 
				<span style="color: red" id="validfon"> </span><br />
				<span style="color: red" id="validdata"> </span><br />  
				<span style="color: red" id="validdata2"> </span><br />
				<span style="color: red" id="validdata2">${mes1}</span><br />
				 <label> 
				<input
					type="submit" value="Записаться" size="58" id="send_form_credit">
				</label>
			</p>
		</div>
	</form>
</body>
</html>
