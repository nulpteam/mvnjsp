<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><c:out value="${title}"/></title>
<link href="css/style.css" type="text/css" rel="stylesheet">
</head>
<body>
	<div id="bg">
		<div id="login"class="classname">
			<img src="img/loginform.png">
			<form action="FormControler" method="post">
				<div class="loginFromFields">
					<input type="text" name="login"><br>
					<input type="password" name="pass"><br>
					<input type="submit">
				</div>
			</form>
		</div>
	</div>
	<div style="color:white">
	
		<c:forEach  items="${list}" 	var="p">
			String <c:out value="${p.id}"/>
			String <c:out value="${p.name}"/>
		</c:forEach>
	</div>
</body>
</html>