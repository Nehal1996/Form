<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fill Form</title>
</head>
<body>
<form action="insert2.html">
<h1><center>Fill Form</center></h1>
<center>First name <input type="text" name="fn"/></center><a></a>
<springForm:input path="name" />
				<springForm:errors path="name" cssClass="error" />
			
<br><br>
<center>Middle name <input type="text" name="mn"/></center>
<br><br>
<center>Last name   <input type="text" name="ln"/></center>
<br><br>
<center>Address<input type="text" name="add"/></center>
<br><br>
<center>Email <input type="text" name="email"/></center>
<br><br>
<center>Contact   <input type="text" name="contact"/></center>
<br><br>

<center><input type="submit"/></center>

</form>	
</body>
</html>