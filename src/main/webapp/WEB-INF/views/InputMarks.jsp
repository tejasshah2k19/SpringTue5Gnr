<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<h2>Input Marks</h2>

<form action="calculateresult" method="post">

	First Name : <input type="text" name="firstName"><Br><Br>
	Std : <input type="text" name="std"/><br><br>  
	Maths: <input type="text" name="maths"/><br><br>
	Sci:<input type="text" name="sci"/><br><br>
	Eng: <input type="text" name="eng"/><br><br>
	
	<input type="submit" value="Calculate Result"/>

</form>

</body>
</html>