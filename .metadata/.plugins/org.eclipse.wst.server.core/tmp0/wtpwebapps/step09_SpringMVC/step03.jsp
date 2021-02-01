<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
    <%
    	//test용 Cookie 데이터 생성해서 client에게 전송
    	/* spring 기반의 sub controller에서
    		@CookieValue("key이름")으로 데이터 활용
    	*/
    	Cookie c = new Cookie("id", "cookieData");
    	c.setMaxAge(60*60);
    	response.addCookie(c);
    	
    	//test용 Session 데이터 저장
    	session.setAttribute("id","tester");
    	session.setAttribute("age",100);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>step03.jsp</title>
</head>
<body>
	<h2>Spring 기반의 상태 유지 기술</h2>
	<br><hr><br>
	
	* test를 위한 쿠키와 세션 데이터는 해당 jsp에서 저장했음 <br>	
	

	<br><hr><br>
	<h3>[1] Cookie API 활용</h3>
	<a href="sessiontracking/cookietest">1.sessiontracking/cookietest & @CookieValue</a>
	
	<br><hr><br>
	<h3>[2] HttpSession API 활용</h3>
	<a href="sessiontracking/sessionTest1">2-1. HttpSession API 활용 </a>
	
	<br><br>
	<a href="sessiontracking/sessionTest2">2-2. @SessionAttributes 이해하기 </a>
	
	<br><br>
	
	<a href="sessiontracking/sessionTest3DTO?id=mg&age=20">2-3. DTO 객체를 세션에 저장(id, age 데이터 전송)</a>
	
	
</body>
</html>