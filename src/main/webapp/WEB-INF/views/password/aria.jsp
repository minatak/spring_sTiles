<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>title</title>
  <jsp:include page="/WEB-INF/views/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>ARIA 암호화</h2>
	<pre>
		ARIA 암호화 방식은 경량환경 및 하드웨어 구현을 위해 최적화된 범용블록 암호화 알고리즘이다.
		ARIA가 사용하는 연산은 대부분 XOR(배타적)과 같은 단순한 바이트단위 연산으로, 
		블록크기는 125Bite(32문자)/256Bite(64문자)로 구성된다.
		ARIA는 Academy(학계), Research Institute(연구소), Agency(정부기관)의 첫글자를 따서 만들었다.
		ARIA 암호화 방식은 복호화가 가능하다.			
	</pre>
	<hr/>
	<div>
		<form method="post">
			<input type="text" name="pwd" id="pwd" autofocus>
		</form>
	</div>
</div>
<p><br/></p>
</body>
</html>