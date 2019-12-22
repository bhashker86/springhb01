<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sadfas title here</title>
</head>
<body>
	<p>${title}</p>
	<p>${other_info}</p>
	<form action="add_user_submit" method="POST">

		<input type="text" name="first_name" placeholder="first name " /> <br/ >

		<input type="text" name="last_name" placeholder="last name " /> <br/ >


		<input type="text" name="gender" placeholder="gender " /> <br/ >


		<input type="text" name="email" placeholder="email" /> <br/ > <input
			type="text" name="mobile" placeholder="mobile" /> <br/ > <input
			type="submit" name="submit" value="submit" />







	</form>


</body>
</html>