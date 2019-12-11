<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/signup.css" />" rel="stylesheet" type="text/css">
<title>Signup</title>
</head>
<body>

		<form:form modelAttribute="signupForm" class="form" action="${pageContext.request.contextPath}/signup" method="post">
		<div id="signup">
			<p class="form-title">Signup</p>

			<div class="error">
				<div><form:errors path="name"/></div>
				<div><form:errors path="password"/></div>
				<div><form:errors path="confirmPassword"/></div>

				<c:if test="${not empty errorMessage}">
					<c:out value="${errorMessage}" />
					<c:remove var="errorMessage" scope="session" />
				</c:if>
			</div><br/>

				<form:label type="name"  path="name">name</form:label>
		        <p class="name"><form:input type="name" path="name" /></p>

		        <form:label type="password" path="password">password</form:label>
		        <p class="password"><form:password  path="password" /></p>

                <form:label type="confirmPassword" path="password">password (confirm)</form:label>
				<p class="confirmPassword"><form:password path="confirmPassword" /></p>


		        <input class="submit" type="submit" value="Enter">

		        <p><a href="login">back</a></p>
		</div>
		</form:form>
</body>
</html>