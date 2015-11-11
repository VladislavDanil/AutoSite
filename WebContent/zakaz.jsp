<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet">
<script type='text/javascript' src="js/jquery-2.1.4.min.js"></script>
<script type='text/javascript' src='js/valid.js'></script>
<script type='text/javascript' src='js/f.js'></script>
<title>Регистрация</title>

</head>
<body onload="urlParser(); resultParse();">
<input name="result" type="hidden" id="result" value="${mes}" />
<div class="b-container img">
</div>
<div class="b-popup" id="popup1">
    <div class="b-popup-content">
       <h1> Мы зарегистрировали вашу заявку! </h1>
        <h1>Спасибо что вы с нами.</h1>
        <div class="prokrutka">
          <c:forEach var="i" items="${array}">
             <c:out value="${i}"/><p>
          </c:forEach>
        </div>
    </div>
</div>
	<form name="form" action="Zakaz" method="post"
		onsubmit="return zakazValid()">
		<div class="centre">
			<h1 align="center">Заказ Авто</h1>
			<div class="formBlock" align="center">
				<div id="left_quest">
					<div>
						<p class="zag">Модель</p>
						<input name="auto_name" type="hidden" id="transfer" value="" /> <span
							class="promo_name" id="aName"><br> </span>
					</div>
					<div>

						<p class="zag">Цвет кузова</p>
						<br />
						<table border="1px">
							<tr>
								<td><input name="color" checked="checked" class="formgroup"
									type="radio" value="Апельсин" id="colorAuto" name="color-a"></td>
								<td><input name="color" class="formgroup" type="radio"
									value="Белое облако" id="colorAuto" name="color-a"></td>
								<td><input name="color" class="formgroup" type="radio"
									value="Пламя" id="colorAuto" name="color-a"></td>
								<td><input name="color" class="formgroup" type="radio"
									value="Агава" id="colorAuto" name="color-a"></td>
								<td><input name="color" class="formgroup" type="radio"
									value="Ладога" id="colorAuto" name="color-a"></td>
								<td><input name="color" class="formgroup" type="radio"
									value="Одиссей" id="colorAuto" name="color-a"></td>
								<td><input name="color" class="formgroup" type="radio"
									value="Рислинг" id="colorAuto" name="color-a"></td>
								<td><input name="color" class="formgroup" type="radio"
									value="Борнео" id="colorAuto" name="color-a"></td>
								<td><input name="color" class="formgroup" type="radio"
									value="Пантера" id="colorAuto" name="color-a"></td>
								<td><input name="color" class="formgroup" type="radio"
									value="Кориандр" id="colorAuto" name="color-a"></td>
							</tr>
							<tr>
								<td class="ap"></td>
								<td class="wh_ob"></td>
								<td class="faer"></td>
								<td class="agava"></td>
								<td class="ladoga"></td>
								<td class="odisea"></td>
								<td class="risling"></td>
								<td class="borneo"></td>
								<td class="pantera"></td>
								<td class="koriandr"></td>
							</tr>
						</table>
						<p class="zag">Двигатель</p>
						<select name="turning1" class="turnintodropdown">
							<option>1.6 - 82 л.с. - 8 к.л.</option>
							<option>1.6 л. - 106 л.с. - 16 кл.</option>
						</select>
						<p class="zag">Комплектация</p>
						<select name="turning2" class="turnintodropdown">
							<option>Standart</option>
							<option>Norma/Norma+</option>
							<option>Lux</option>
							<option>Lux+</option>
						</select>
						<p class="zag">Дополнительный услуги</p>
						<table width="500px">
							<tr>
								<td>
								
								<input type="checkbox" name="option2" value="Защита
									картера">Защита
									картера<Br> <input type="checkbox" name="option3"
									value="Установка сигнализации">Установка сигнализации<Br></td>
							</tr>
						</table>
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
				<span style="color: red" id="validdata2">${mes1}</span><br /> 
				 <label> 
				<input
					type="submit" value="Заказать" size="58" id="send_form_credit">
				</label>
			</p>
		</div>
	</form>
</body>
</html>
