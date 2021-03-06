<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="loginForm" class="form" action="${pageContext.request.contextPath}/login" method="post">

		<div id ="login">
			<p class="form-title">ログイン</p>
			<div class="error">
				<div><form:errors path="name" ></form:errors></div>
				<div><form:errors path="password"/></div>
				<c:if test="${not empty errorMessage}">
					<div><c:out value="${errorMessage}" /></div>
					 <c:remove var="errorMessage" scope="session" />
				</c:if>
			</div>
				<form:label type="name" path="name">名前</form:label>
				<p class="name"><form:input type="name" path="name" /></p>
		        <form:label type="password" path="password">パスワード</form:label>
		        <p class="password"><form:password path="password" /></p>
		        <p class="submit"><input type="submit" value="ログイン"></p>
		        <a href="signup" >ユーザー登録はこちら</a>
        </div>
		</form:form>
</body>
</html>