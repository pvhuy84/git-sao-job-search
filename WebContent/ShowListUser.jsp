<%@page import="model.bean.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List User</title>
</head>
<body>
	<%
		if (request.getAttribute("listUser") == null) {
	%>
	<form action="ShowListUserServlet">
		<input type="submit" value="Show List User" />
	</form>
	<%
		} else {
			ArrayList<User> listUser = (ArrayList<User>) request.getAttribute("listUser");
			int i = 0;
			while (i < listUser.size()) {
	%>
	<h1>
		User:
		<%=listUser.get(i).getUsername()%></h1>
	<h3>
		---Pass:
		<%=listUser.get(i).getPassword()%></h3>
	<h3>
		---Type:
		<%=listUser.get(i).getUsertype()%></h3>
	<%
		i++;
			}
		}
	%>
</body>
</html>