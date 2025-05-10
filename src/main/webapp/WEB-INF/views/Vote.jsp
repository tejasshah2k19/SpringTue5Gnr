<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error{
	color: red;
}
</style>
</head>
<body>

<form action="checkeligiblity" method="post">
	Name : <input type="text" name="firstName"/><span class="error">${firstNameError}</span><br><br>
	Gender : Male<input type="radio" name="gender" value="male"/>
	FeMale<input type="radio" name="gender" value="female"/>
	<span class="error">${genderError }</span>
	<br><br>
	Age : <input type="text" name="age"/>
	<span class="error">${ageError}</span>
	<br><br>
 	<input type="submit" value="Check Eligiblity"/>

</form>

</body>
</html>