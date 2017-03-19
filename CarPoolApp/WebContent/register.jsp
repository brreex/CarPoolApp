<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="registerController" method="post">

		<fieldset>
			<legend> Personal Information</legend>
			<p>
				First name: <input type="text" name="fname" placeholder="first name">
			</p>
			<p>
				Last name: <input type="text" name="lname" placeholder="last name">
			</p>
			<p>
				Gender: <input type="text" name="gender" placeholder="gender">
			</p>
			<p>
				Birth date: <input type="text" name="bdate">
			</p>
			<p>
				Email: <input type="text" name="email" placeholder="last name">
			</p>
			<p>
				User name: <input type="text" name="username"
					placeholder="user name">
			</p>
			<p>
				Password: <input type="password" name="password">
			</p>
		</fieldset>

		<fieldset>
			<legend>Adress Information</legend>
			<p>
				Street: <input type="text" name="street" placeholder="street">
			</p>
			<p>
				city:<input type="text" name="city" placeholder="last name">
			</p>
			<p>
				Zipcode <input type="text" name="zipcode" placeholder="Zipcode">
			</p>
			<p>
				State <input type="text" name="state" placeholder="Zipcode">
			</p>
			<p>
				<input type="submit" value="Register">
			</p>
			<%-- <p style ='color:red; visibility:${ageMessage}'>Age must be above 18 years old!</p> --%>
		</fieldset>
	</form>
</body>
</html>