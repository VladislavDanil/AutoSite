/*"youfile.html?parametr"*/
var autoName = location.search.substring(1);
function urlParser() {
	var SummDok = document.getElementById('aName');
	SummDok.innerHTML = autoName;
	document.getElementById('transfer').value = autoName;
}

function zakazValid() {

	var auto_name = document.forms["form"]["auto_name"].value;
	var name = document.forms["form"]["name"].value;
	var last_name = document.forms["form"]["last_name"].value;
	var middle_name = document.forms["form"]["middle_name"].value;
	var fon = document.forms["form"]["fon"].value;

	if ((auto_name == "") || (name == "") || (last_name == "")
			|| (middle_name == "")) {
		document.getElementById("valid").innerHTML = "*все поля обязательны для заполнения";
		document.getElementById("validname").innerHTML = "";
		document.getElementById("validfon").innerHTML = "";
		return false;
	}

	if ((!form.name.value.match(/^[а-яА-ЯёЁa-zA-Z]+$/))
			|| (!form.last_name.value.match(/^[а-яА-ЯёЁa-zA-Z]+$/))
			|| (!form.middle_name.value.match(/^[а-яА-ЯёЁa-zA-Z]+$/))) {
		document.getElementById("validname").innerHTML = "*в поля имя, "
				+ "фамилия, отчество вводить можно только буквы";
		document.getElementById("valid").innerHTML = "";
		document.getElementById("validfon").innerHTML = "";
		return false;
	}
	if ((!form.fon.value.match(/^[0-9]+$/))) {
		document.getElementById("validfon").innerHTML = "*в поле телефон"
				+ "можно вводить только числа";
		document.getElementById("valid").innerHTML = "";
		document.getElementById("validname").innerHTML = "";
		return false;
	}
	if (!form.data.value
			.match(/[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[01])/)) {
		document.getElementById("validdata").innerHTML = "*дата не соответствует формату";
		return false;
	}

}
function resultParse(){
	var result = document.getElementById('result');
	if(result.value == 1){
		PopUpShow();
	}
}