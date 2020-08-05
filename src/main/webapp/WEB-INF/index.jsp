<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
 <form action="/codigo" method="post">
 <h1><c:out value="${error}"/></h1>
 <h1>Cual es el codigo</h1>
 <input type="text" name="bushido">
 </form>
</div>
</body>
</html>