<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step03Session1.jsp</title>
</head>
<body>
	step03Session1.jsp : ${sessionScope.newData}-${sessionScope.id}
	
	<br><hr><br>
	<a href="sessiontracking/sessionDelete">1. HttpSession API로 삭제</a>
	<br><br>
	<a href="sessiontracking/sessionDelete2">2. Spring API로 삭제</a>
	
	<br><hr><br>
	 세션에 cust라는 key로 저장된 Customer 데이터 : ${sessionScope.cust.id }
</body>
</html>