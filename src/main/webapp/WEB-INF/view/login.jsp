<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet" type="text/css">
<title>Login</title>
</head>
<body>
<form:form modelAttribute="loginForm" class="form" action="${pageContext.request.contextPath}/login" method="post">

		<div id ="login">
			<p class="form-title">Login</p>
			<div class="error">
				<div><form:errors path="name" ></form:errors></div>
				<div><form:errors path="password"/></div>
				<c:if test="${not empty errorMessage}">
					<div><c:out value="${errorMessage}" /></div>
					 <c:remove var="errorMessage" scope="session" />
				</c:if>
			</div>
				<form:label type="name" path="name">name</form:label>
				<p class="name"><form:input type="name" path="name" /></p>
		         <p class="password-label"><form:label  type="password" path="password">password</form:label></p>
		        <p class="password"><form:password path="password" /></p>
		        <input type="submit" class="submit" value="Enter">
		        <p><a href="signup" >Signup here</a></p>

        </div>
		</form:form>
</body>
</html>