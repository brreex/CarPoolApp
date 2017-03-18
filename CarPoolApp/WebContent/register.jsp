<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="registerController" method= "POST">

          <fieldset>
              <legend> Personal Information</legend>
              <p>First name: <input type="text" name="fname" placeholder="first name"></p>
              <p>Last name: <input type="text" name="lname"  placeholder="last name"></p>
              <p>Gender: <input type="text" name="gender"  placeholder="gender"></p>
              <p>Birth date: <input type="date" name="bdate" ></p>
              <p>Email: <input type="text" name="email"  placeholder="last name"></p>
              <p>User name: <input type="text" name="username"  placeholder="user name"></p>
              <p>Password: <input type="password" name ="password" pattern="(?=[A-Z]+)(?=[a-z]+)(?=[0-9]+).{6,}"
                 title="Password must have at least one capital one small letter,a number and must have length of 6 characters"></p>
          </fieldset>

           <fieldset>
              <legend>Adress Information</legend>
              <p>Street: <input type="text" name="street" placeholder="street"></p>
              <p>city:<input type="text" name="city"  placeholder="last name"></p>
              <p>Zipcode <input type="text" name="zipcode"  placeholder="Zipcode"></p>
              <p>State <input type="text" name="state"  placeholder="Zipcode"></p>
              <p> <input type="submit" value="Register"></p>
           </fieldset>
</body>
</html>