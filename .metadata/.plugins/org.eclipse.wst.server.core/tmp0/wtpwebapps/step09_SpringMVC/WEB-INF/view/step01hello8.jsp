<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step01hello8</title>
</head>
<body>
	step01hello8.jsp : ${param.id}<br>
	서버의 controller에서 새로 저장된 데이터 값 출력 : -${requestScope.cust.id}-
</body>
</html>